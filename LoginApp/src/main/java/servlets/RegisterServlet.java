package servlets;

import java.io.*;
import java.sql.*;
import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;

@WebServlet("/RegisterServlet")
public class RegisterServlet extends HttpServlet {
    private static final long serialVersionUID = 1L;
    
    // Database connection details - CHANGE THESE!
    private static final String DB_URL = "jdbc:mysql://localhost:3306/userdb";
    private static final String DB_USER = "root";
    private static final String DB_PASSWORD = "pwd";
    
    @Override
    public void init() throws ServletException {
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
        } catch (ClassNotFoundException e) {
            throw new ServletException("MySQL JDBC Driver not found", e);
        }
    }
    
    protected void doPost(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        
        String username = request.getParameter("username");
        String password = request.getParameter("password");
        String email = request.getParameter("email");
        
        Connection conn = null;
        PreparedStatement checkStmt = null;
        PreparedStatement insertStmt = null;
        ResultSet rs = null;
        
        try {
            // 1. Get database connection
            conn = DriverManager.getConnection(DB_URL, DB_USER, DB_PASSWORD);
            
            // 2. Check if username already exists
            String checkSql = "SELECT id FROM users WHERE username = ? OR email = ?";
            checkStmt = conn.prepareStatement(checkSql);
            checkStmt.setString(1, username);
            checkStmt.setString(2, email);
            rs = checkStmt.executeQuery();
            
            if (rs.next()) {
                // Username or email already exists
                request.setAttribute("errorMessage", "Username or Email already exists!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
                return;
            }
            
            // 3. Insert new user
            String insertSql = "INSERT INTO users (username, password, email) VALUES (?, ?, ?)";
            insertStmt = conn.prepareStatement(insertSql);
            insertStmt.setString(1, username);
            insertStmt.setString(2, password);
            insertStmt.setString(3, email);
            
            int rows = insertStmt.executeUpdate();
            
            if (rows > 0) {
                // Registration successful
                request.setAttribute("successMessage", "Registration successful! Please login.");
                request.getRequestDispatcher("index.jsp").forward(request, response);
            } else {
                request.setAttribute("errorMessage", "Registration failed!");
                request.getRequestDispatcher("register.jsp").forward(request, response);
            }
            
        } catch (SQLException e) {
            e.printStackTrace();
            request.setAttribute("errorMessage", "Database error: " + e.getMessage());
            request.getRequestDispatcher("register.jsp").forward(request, response);
        } finally {
            // Close resources
            try { if (rs != null) rs.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (checkStmt != null) checkStmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (insertStmt != null) insertStmt.close(); } catch (SQLException e) { e.printStackTrace(); }
            try { if (conn != null) conn.close(); } catch (SQLException e) { e.printStackTrace(); }
        }
    }
    
    protected void doGet(HttpServletRequest request, HttpServletResponse response)
            throws ServletException, IOException {
        response.sendRedirect("register.jsp");
    }
}
<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%
    // Check if user is logged in
    if (session.getAttribute("username") == null) {
        response.sendRedirect("index.jsp");
        return;
    }
%>
<!DOCTYPE html>
<html>
<head>
    <title>Welcome</title>
</head>
<body>
    <h2>Welcome, <%= session.getAttribute("username") %>!</h2>
    <p>You have successfully logged in.</p>
    
    <form action="LogoutServlet" method="post">
        <input type="submit" value="Logout">
    </form>
    
</body>
</html>
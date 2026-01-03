<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Login</title>
    <script>
        function validateLogin() {
            var username = document.forms["loginForm"]["username"].value;
            var password = document.forms["loginForm"]["password"].value;
            if (username === "" || password === "") {
                alert("Username and Password must be filled out");
                return false;
            }
            return true;
        }
    </script>
</head>
<body>
    <h2>Login</h2>
    
    <%-- Display success message if redirected from registration --%>
    <% if (request.getAttribute("successMessage") != null) { %>
        <p style="color:green;"><%= request.getAttribute("successMessage") %></p>
    <% } %>
    
    <%-- Display error message if login failed --%>
    <% if (request.getAttribute("errorMessage") != null) { %>
        <p style="color:red;"><%= request.getAttribute("errorMessage") %></p>
    <% } %>
    
    <form name="loginForm" action="LoginServlet" method="post" onsubmit="return validateLogin()">
        Username: <input type="text" name="username" required><br><br>
        Password: <input type="password" name="password" required><br><br>
        <input type="submit" value="Login">
    </form>
    <br>
    <a href="register.jsp">New User? Register Here</a>
</body>
</html>
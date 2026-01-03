<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
    <title>Register</title>
    <script>
        function validateRegister() {
            var username = document.forms["regForm"]["username"].value;
            var password = document.forms["regForm"]["password"].value;
            var email = document.forms["regForm"]["email"].value;
            
            if (username === "" || password === "" || email === "") {
                alert("All fields must be filled out");
                return false;
            }
            
            if (password.length < 6) {
                alert("Password must be at least 6 characters");
                return false;
            }
            
            // Simple email validation
            var emailPattern = /^[^\s@]+@[^\s@]+\.[^\s@]+$/;
            if (!emailPattern.test(email)) {
                alert("Please enter a valid email address");
                return false;
            }
            
            return true;
        }
    </script>
</head>
<body>
    <h2>Register</h2>
    
    <%-- Display error message if registration failed --%>
    <% if (request.getAttribute("errorMessage") != null) { %>
        <p style="color:red;"><%= request.getAttribute("errorMessage") %></p>
    <% } %>
    
    <form name="regForm" action="RegisterServlet" method="post" onsubmit="return validateRegister()">
        Username: <input type="text" name="username" required><br><br>
        Password: <input type="password" name="password" required minlength="6"><br><br>
        Email: <input type="email" name="email" required><br><br>
        <input type="submit" value="Register">
    </form>
    <br>
    <a href="index.jsp">Already have an account? Login Here</a>
</body>
</html>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset="UTF-8"/>
</head>
<body>
    <h2>Login page</h2>

    <form action="/login" method="post">
        <label for="email">E-mail:</label> <br>
        <input type="email" id="email" name="email"/> <br>
        <label for="password">Password</label> <br>
        <input type="password" id="password" name="password"/> <br>
        <input type="submit" id="submit" name="submit" value="Login"/>
        <input type="reset" value="Reset"/>
    </form>
</body>
</html>
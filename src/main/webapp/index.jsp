<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
</head>
<body>
<h2>Bejelentkezés</h2>
<form action="login.jsp" method="post">
    <label for="email">E-mail:</label> <br>
    <input type="email" id="email" name="email"/> <br>
    <label for="password">Password</label> <br>
    <input type="password" id="password" name="password"/> <br>
    <input type="submit" id="submit" name="submit" value="Submit"/>
    <input type="reset" value="Reset"
</form>
</body>
</html>

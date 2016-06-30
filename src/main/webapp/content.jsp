<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@ page isELIgnored="false" %>

<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
</head>
<body>
    <c:forEach items="${products}" var="product">
        <div>
            <c:out value="${product.category}"/>
            <c:out value="${product.name}"/>
            <c:out value="${product.price}"/>
            <c:out value="${product.warranty}"/>
        </div>
    </c:forEach>
    <form action="/logout" method="post">
        <input type="submit" value="Logout"/>
    </form>
</body>
</html>

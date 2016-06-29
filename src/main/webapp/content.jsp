<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8"/>
</head>
<body>
<%
    if ((session.getAttribute("user") == null) || (session.getAttribute("user") == "")) {
%>
        Nem vagy bejelentkezve!<br/>
        <a href="index.jsp">Bejelentkezes</a>
<%} else {%>
        Welcome <%=session.getAttribute("user")%>
        <a href='logout.jsp'>Log out</a>
<%
    }
%>
</body>
</html>

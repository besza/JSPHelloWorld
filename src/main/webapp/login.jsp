<%
    String userEmail = "user@epam.com";
    String userPassword = "kacsa";

    String email = request.getParameter("email");
    String password = request.getParameter("password");

    if (email.equals(userEmail) && password.equals(userPassword)) {
        session.setAttribute("user",email);
        response.sendRedirect("content.jsp");
    } else {
        out.println("Hibás login <a href='index.jsp'>próbáld újra!</a>");
    }
%>
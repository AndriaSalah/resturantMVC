<%-- 
    Document   : userView
    Created on : Nov 22, 2022, 9:33:08 PM
    Author     : andria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <p>welcome <b> <%= model.person. getUsername()%></b></p>
        <form action="reservationController" method="post">
            <a href="reservationView.jsp" >Make reservation</a>
            <a href="reservationHistory.jsp">View reservation</a>
            <a href="index.html" >Logout</a>
        </form>
    </body>
</html>

<%-- 
    Document   : userView
    Created on : Nov 22, 2022, 9:33:08 PM
    Author     : andria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<style>
    .viewRes{
        opacity: 0;
        visibility: hidden;
    }
</style>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="styles/home.css" type="text/css"/>
    </head>
    <body>
        <div class="mainContainer">
            <p>welcome <b> <%= model.person.getUsername()%></b></p>
           
                <a href="reservationView.jsp" >Make reservation</a>
                <a href="reservationHistory.jsp" >View Reservation</a>
                <a href="reservationDelete.jsp">Delete Reservation</a>
                <a href="index.jsp" >Logout</a>
            
        </div>
    </body>
</html>

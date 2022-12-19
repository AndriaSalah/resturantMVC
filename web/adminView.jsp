<%-- 
    Document   : homeAdmin
    Created on : Dec 9, 2022, 8:54:40 PM
    Author     : himaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOME Admin</title>
    </head>
    <body>
        <p>welcome <%= model.person. getUsername()%></p>
        <<form action="adminController" method="post">
            <input class="button" type="submit" value="Make reservation" name="Make reservation">
            <input class="button" type="submit" value="View reservation" name="View reservation">
            <input class="button" type="submit" value="Add product" name="Add product">
            <input class="button" type="submit" value="DEL product" name="DEL product">
            <input class="button" type="submit" value="Logout" name="Logout">
            </form>
            
            
<!--            <a href="reservationView.jsp">Make reservation</a>
            <a href="reservationHistory.jsp">View reservation</a>
            <a href="reservationHistory.jsp">Add product</a>
            <a href="reservationHistory.jsp">DEL product</a>
            <a href="index.jsp">Logout</a>-->
            

      
    </body>
</html>
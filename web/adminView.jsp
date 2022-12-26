<%-- 
    Document   : homeAdmin
    Created on : Dec 9, 2022, 8:54:40 PM
    Author     : himaa
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <style>
        html{
    width: 100%;
    height: 100%;
    background-color: #ecc4bc;

}
body{
    
    display: flex;
    flex-direction: column;
    justify-content: center;
    align-items: center;
    height: 95%;

}
.mainContainer{
    height: 50rem;
    width: 100%;
    display: flex;
    flex-direction: column;
    align-items: center;
    justify-content: center;
}
.button{
    text-align: center;
    text-decoration: none;
    color: black;
    margin: 1rem 1rem ;
    background-color: beige; 
    width: 9rem;
    line-height: 3rem;
    border-radius: 30px;
    transition-duration: 0.2s;
    cursor: pointer;
}
.button:hover{
    background: #dc736b;
}
p{
    font-size: 35px;
}
form{
    
    display: flex;
    flex-wrap: wrap;
    justify-content: center;

}

    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>HOME Admin</title>
    </head>
    <body>
        <p>welcome <b><%= model.person. getUsername()%></b></p>
        <form action="adminController" method="post">
            <input class="button" type="submit" value="Make reservation" name="Make reservation">
            <input class="button" type="submit" value="View reservation" name="View reservation">
            <input class="button" type="submit" value="Delete reservation" name="Delete reservation">
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
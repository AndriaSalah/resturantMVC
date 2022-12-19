<%-- 
    Document   : reservationSuccess
    Created on : Dec 16, 2022, 9:04:36 PM
    Author     : andria
--%>

<%@page import="model.reservationModel"%>
<%@page import="model.person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>order was successfully booked</h1>
        <p>order set under the name of <%=person.getUsername()%></p>
        <p>reservation id : <%=reservationModel.getReservationID()%></p>
        <p>order contents :</p>
        <div>
            <%for (int idx = 0; idx < reservationModel.getProductNames().size(); idx++) {%>
            <p><%=reservationModel.getProductNames().get(idx)%></p>
            <%}%>
            <a href="/index.jsp/userView.jsp">click here to go back to the homepage</a>
        </div>
    </body>
</html>

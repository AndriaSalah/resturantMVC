<%-- 
    Document   : reservationView
    Created on : Nov 22, 2022, 9:42:57 PM
    Author     : andria
--%>

<%@page import="model.reservationModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
reservationModel re = new reservationModel();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Welcome please choose your meal course from below</h1>
        <h3>Appetizers</h3>
        <select name="appetizers" id = "appetizers">
            <%
              System.out.println("googgoo"+ re.getMain());
            %>
        </select>
    </body>
</html>

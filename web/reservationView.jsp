<%-- 
    Document   : reservationView
    Created on : Nov 22, 2022, 9:42:57 PM
    Author     : andria
--%>

<%@page import="model.productModel"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
productModel product = new productModel();
%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form action="reservationController" method="post">
        <h1>Welcome please choose your meal course from below</h1>
        <h3>Appetizers</h3>
        <select name="appetizers" id = "appetizers">
            <%for (int i = 0; i < product.getMain().size() ; i++) {%>
            <%System.out.println(product.getTypeAtIndex("appetizer",i));%>
            <option> <%= product.getTypeAtIndex("appetizer",i) %> </option> 
              <%  }  %>
        </select>
        <h3>main</h3>
        <select name="main" id = "main">
            <%for (int i = 0; i < product.getMain().size() ; i++) {%>
            <%System.out.println(product.getTypeAtIndex("main",i));%>
            <option> <%= product.getTypeAtIndex("main",i) %> </option> 
              <%  }  %>
        </select>
        <h3>dessert</h3>
        <select name="dessert" id = "dessert">
            <%for (int i = 0; i < product.getMain().size() ; i++) {%>
            <%System.out.println(product.getTypeAtIndex("dessert",i));%>
            <option> <%= product.getTypeAtIndex("dessert",i) %> </option> 
              <%  }  %>
        </select>
        <h3>drinks</h3>
        <select name="drinks" id = "drinks">
            <%for (int i = 0; i < product.getMain().size() ; i++) {%>
            <%System.out.println(product.getTypeAtIndex("drinks",i));%>
            <option> <%= product.getTypeAtIndex("drinks",i) %> </option> 
              <%  }  %>
        </select>
        <input class="button" type="submit" value="submit">
        </form>
    </body>
</html>

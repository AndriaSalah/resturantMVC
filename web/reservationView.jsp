<%-- 
    Document   : reservationView
    Created on : Nov 22, 2022, 9:42:57 PM
    Author     : andria
--%>


<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%@page import="model.productModel"%>
<%
    productModel product = new productModel();
%>
<!DOCTYPE html>
<html>
    <style>
        select{
            width: 10rem;
            text-align: center;
            border: none;
            outline: 2px solid black;
            outline-offset: 8px;
            border-radius: 30px;
            transition-duration: 0.2s;
            background: transparent;
        }
        select:hover{
            outline-color: #dc736b;
        }
        form{

            height: 100%;
            display: flex;
            align-content: center;
            flex-direction: column;
            justify-content: center;
            align-items: center;

        }

        .button{
            transition-duration: 0.2s;
            background: bisque;
            color: black;
            cursor: pointer;
            width: 5rem;
            height: 2rem;
            border: none;
            border-radius: 30px;
            margin-top: 2rem
        }
        .button:hover{
            border: solid 1px black;
            background:#dc736b;
            color:black;
        }
        html{
            width: 100%;
            height: 100%;
            background-color: #ecc4bc;

        }
        body{

            width: 100%;
            height: 50rem;

        }
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
        <link rel="stylesheet" href="styles/Reservation.css" type="text/css"/>
    </head>
    <body>
        <form action="reservationController" method="post">
            <h1>Welcome please choose your meal course from below</h1>
            <h3>Appetizers</h3>
            <select name="appetizers" id = "appetizers">
                <%for (int i = 0; i < product.getAppetizer().size(); i++) {%>
                <%System.out.println(product.getTypeAtIndex("appetizer", i));%>
                <option> <%= product.getTypeAtIndex("appetizer", i)%> </option> 
                <%  }  %>
            </select>

            <h3>main</h3>
            <select name="main" id = "main">
                <%for (int i = 0; i < product.getMain().size(); i++) {%>
                <%System.out.println(product.getTypeAtIndex("main", i));%>
                <option> <%= product.getTypeAtIndex("main", i)%> </option> 
                <%  }  %>
            </select>
            <h3>dessert</h3>
            <select name="dessert" id = "dessert">
                <%for (int i = 0; i < product.getDessert().size(); i++) {%>
                <%System.out.println(product.getTypeAtIndex("dessert", i));%>
                <option> <%= product.getTypeAtIndex("dessert", i)%> </option> 
                <%  }  %>
            </select>
            <h3>drinks</h3>
            <select name="drinks" id = "drinks">
                <%for (int i = 0; i < product.getDrinks().size(); i++) {%>
                <%System.out.println(product.getTypeAtIndex("drinks", i));%>
                <option> <%= product.getTypeAtIndex("drinks", i)%> </option> 
                <%  }%>
            </select>
            <input class="button" type="submit" value="submit">
        </form>
    </body>
</html>

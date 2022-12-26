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
    <style>


        .mainContainer {
            background: antiquewhite;
            width: 95%;
            height: 50%;
            display: flex;
            flex-direction: column;
            align-content: center;
            align-items: center;
            justify-content: center;
            border-radius: 30px;
            flex-wrap: wrap;
        }

        body{
            display: flex;
            justify-content: center;
            align-content: center;
            width: 100%;
            height: 100%;
            flex-wrap: wrap;


        }
        html{
            width:100%;
            height:100%;
            background-color: #ecc4bc;
            overflow: hidden;
        }
        a{

            text-decoration: none;
            background: #dc736b;
            line-height: 3rem;
            width: 17rem;
            color: black;
            text-align: center;
            border-radius: 30px;
            transition-duration: 0.2s;
        }
        a:hover{
            background: bisque
        }
        p{
            margin-left: 6rem;
        }
        .orders{
            width: 42%;
        }
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div class = "mainContainer">
            <h1>Order was booked successfully</h1>
            <h3>Order is set under the name of <b><%=person.getUsername()%></b></h3>
            <h3>reservation id : <b><%=reservationModel.getReservationID()%></b></h3>            
            <div class="orders">
                <h4><b>order contents :</b></h4>
                <%for (int idx = 0; idx < reservationModel.getProductNames().size(); idx++) {%>
                <p><%=reservationModel.getProductNames().get(idx)%></p>
                <%}%>
            </div>
                <%if (person.getType().equals("user")){%>
            <a href="/index.jsp/userView.jsp">click here to go back to the homepage</a>
           <% } else if(person.getType().equals("admin")) {%><a href="/index.jsp/adminView.jsp">click here to go back to the homepage</a><%}%>
        </div>
    </body>
</html>

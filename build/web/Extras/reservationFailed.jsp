<%-- 
    Document   : fail
    Created on : Dec 26, 2022, 3:24:53 AM
    Author     : andria
--%>

<%@page import="model.person"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
            <style>


        .mainContainer {
            background: antiquewhite;
            width: 95%;
            height: 60%;
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
            /*margin-left: 6rem;*/
            font-size: 20px;
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
        <div  class="mainContainer" >
        <h1>reservation failed</h1>
                <%if (person.getType().equals("user")){%>
            <a href="/index.jsp/userView.jsp">click here to go back to the homepage</a>
           <% } else if(person.getType().equals("admin")) {%><a href="/index.jsp/adminView.jsp">click here to go back to the homepage</a><%}%>
        </div>
    </body>
</html>

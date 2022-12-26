<%-- 
    Document   : reservationHistory
    Created on : Nov 22, 2022, 9:45:39 PM
    Author     : andria
--%>

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
        
.textfield{
    text-align: center;
    height: 1.5rem;
    border-radius: 30px;
    border : 1px solid black;
    background: transparent;
    
}
.textfield:focus , input:focus{
    background-color: white;
    border-color: white;
    outline: none;
    /*color: black;*/
}
.button{
    margin: 1rem 1rem ;
    transition-duration: 0.2s;
    background:  #ffdccc;
    color: black;
    cursor: pointer;
    width: 9rem;
    height: 3rem;
    border: none;
    border-radius: 30px;
}
.button:hover{
   background: #dc736b;
}
</style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <form class="mainContainer" action="reservationController" method="get">
            <h2>please enter the reservation ID that you want to check</h2>
            <input class= "textfield" type="text" name="resID" >
            <input class="button" type="submit" name="view" value="view">
        </form>
    </body>
</html>

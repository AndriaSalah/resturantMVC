<%-- 
    Document   : registration
    Created on : Nov 22, 2022, 8:41:51 PM
    Author     : andria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
        <style>
        html{
    width:100%;
    height:100%;
     background-color: #ecc4bc;
     overflow: hidden;
}
body{
    width:100%;
    height:100%;

}
form{
    height: 100%;
    display: flex;
    flex-direction: column;
    justify-content: center ;
    align-items: center;
}

.button{
    margin: 1rem 1rem ;
    transition-duration: 0.2s;
    background: bisque;
    color: black;
    cursor: pointer;
    width: 9rem;
    height: 3rem;
    border: none;
    border-radius: 30px;
    cursor: pointer;
}
.button:hover{
   background: #dc736b;
}
.buttons{
    margin-top : 1rem;
    display: flex;
    flex-direction: row;
    gap: 0.5rem;
}
.Container {
    width:50%;
    height: 40%;
    background: #e4a0a0;
    border:none;
    border-radius: 30px;
}
.mainContainer{
    width: 100%;
    height: 100%;
    display:flex;
    align-items: center;
    justify-content: center;
}

a{
    text-align: center;
    text-decoration: none;
    color: black;
    margin: 1rem 1rem ;
    background-color: beige; 
    width: 12rem;
    line-height: 3rem;
    border-radius: 30px;
    transition-duration: 0.2s;
}
a:hover{
    background: #dc736b;
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
    </style>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register here</title>
    </head>
    <body>
        <form action="registrationController" method="post">
            username: <input class="textfield"  type="text" name="uname" ><br>
            password: <input class="textfield" type="text" name="pwd" > <br>
            <input class ="button" type="submit" value="submit">
            <a href="index.jsp">Already a user ? , login !</a>
        </form>
    </body>
</html>

<%-- 
    Document   : registration
    Created on : Nov 22, 2022, 8:41:51 PM
    Author     : andria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Register here</title>
    </head>
    <body>
        <form action="registrationController" method="post">
            username: <input type="text" name="uname" ><br>
            password: <input type="text" name="pwd" > <br>
            <input type="submit" value="submit">
            <a href="index.html">Already a user ? , login !</a>
        </form>
    </body>
</html>

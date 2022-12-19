<!DOCTYPE html>
<html>
    <head>
        <title>Resturant</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <link rel="stylesheet" href="styles/login.css" type="text/css"/>

    </head>
    <body>
        <div style="width: 100%;height: 100%" class="mainContainer">
            <form  class="Container" action="loginController" method="post">
                username: <input class="textfield" type="text" name="uname" ><br>
                password: <input class="textfield" type="text" name="pwd" > <br>
                <div class="buttons">
                    <input class="button" type="submit" value="submit">
                    <a href="registration.jsp">register now</a>
                    
                </div>
            </form>
        </div>
    </body>
</html>

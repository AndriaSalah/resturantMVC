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
    width: 9rem;
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
        <title>Resturant</title>
        <meta charset="UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1.0">
        <!--<link rel="stylesheet" href="styles/login.css" type="text/css"/>-->

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

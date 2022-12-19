<%-- 
    Document   : removeProduct
    Created on : Dec 18, 2022, 11:50:17 PM
    Author     : andria
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <div style="width: 100%;height: 100%" class="mainContainer">
            <form  class="Container" action="productController" method="get">
                Item ID :<input class="textfield" type="text" name="itemID" ><br>
                Item Name : <input type="text" name="itemName" id="itemName">
                <input class="button" type="submit" value="submit">
            </form>
        </div>
    </body>
</html>


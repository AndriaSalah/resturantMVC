<%-- 
    Document   : addProduct
    Created on : Dec 18, 2022, 11:50:08 PM
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
            <form  class="Container" action="productController" method="post">
                Dish name <input class="textfield" type="text" name="DishName" ><br>
                Dish type <select name="dishType" id = "dishType">
                    <option>appetizer</option>
                    <option>main</option>
                    <option>dessert</option>
                    <option>drinks</option>
                </select> <br>
                Price : <input type="text" name="price" id="price">
                    <input class="button" type="submit" value="submit">
                    
            </form>
        </div>
    </body>
</html>

<%-- 
    Document   : menu
    Created on : Sep 22, 2014, 5:46:17 PM
    Author     : Hodgey
--%>

<%@page import="java.util.List"%>
<%@page import="restaurant.dao.MenuItem"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Restaurant Menu</title>
        
    </head>
    <body>
        The following items are on the menu for today:
        <br />
        <table id="menu" border="1">
            <tr>
                <td>Item Name</td>
                <td>Item Price</td>
                <td>Add item to Order</td>
            </tr>
            <%
                String msg = "";
                Object objMsg = request.getAttribute("menu");
                List<MenuItem> menuItems = (List) objMsg;
                for (MenuItem items : menuItems) {
                    msg += "<tr><td>" + items.getItemName() + "</td><td>" + items.getItemPrice()
                            + "</td><td><a href=\"#" + items.getItemId() + "\">+</a></tr>";
                }
            %>
            <%= msg%>

        </table> 

    </body>
</html>

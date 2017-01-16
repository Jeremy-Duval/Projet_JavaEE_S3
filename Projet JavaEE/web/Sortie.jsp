<%-- 
    Document   : Sortie
    Created on : 11 janv. 2017, 17:51:52
    Author     : Jérémy
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Votre commande</title>
    </head>
    <body>
        <h1>Votre commande</h1>
        <br>
        <%out.println(request.getParameter("pseudo"));%>
         * 
        <%out.println("points :" + request.getParameter("points"));%>
        <br>
    </body>
</html>


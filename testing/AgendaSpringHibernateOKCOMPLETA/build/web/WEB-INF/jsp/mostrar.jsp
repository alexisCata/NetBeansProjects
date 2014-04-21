<%-- 
    Document   : mostrar
    Created on : 06-feb-2014, 19:52:37
    Author     : davidjgc
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Hello World! Mostrar</h1>
        
        <%
           String nombre= (String) session.getAttribute("nombre");
        %>
        Bienvenido <%=nombre%>
        
        <%
            nombre= (String) request.getAttribute("nombre");
        %>
        Bienvenido <%=nombre%>
    </body>
</html>

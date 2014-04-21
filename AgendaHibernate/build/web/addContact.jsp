<%-- 
    Document   : addContact
    Created on : 10-feb-2014, 10:52:24
    Author     : alexis
--%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi agenda hacker - Añadir</title>
    </head>
    <body>
        <h1>Añadir contactos Hibernate</h1>
        
        <form action="ServAddHib" method="post" >
            <div>Nombre: <input type="text" name="nombre" size="30" ></div>
            <div>Teléfono: <input type="text" name="telf" size="30" ></div>
            <div>Edad: <input type="text" name="edad" size="30" ></div>
            <div>Altura: <input type="text" name="altura" size="30" ></div>
            <div><input type="submit" value="Añadir contacto"></div>
        </form>
        
    </body>
</html>

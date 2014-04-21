<%-- 
    Document   : UpdateCon
    Created on : 07-feb-2014, 12:49:33
    Author     : alexis
--%>
<%@page import="datos.Contacto"%>
<%
    HttpSession miSesion = request.getSession();
    Contacto  unCon = (Contacto) miSesion.getAttribute("contacto");
    String telfynom = (String) miSesion.getAttribute("telfynom");
%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi agenda hacker - Modificar</title>
    </head>
   <h1>Modificar contacto Hibernate</h1>
        <% 
        
        %>
        <form action="ServUpdateDAO" method="post" >
            <div>Nombre: <input type="text" name="nombre" size="30" value="<%=unCon.getNombre() %>"></div>
            <div>Teléfono: <input type="text" name="telf" size="30" value="<%=unCon.getTelefono() %>"></div>
            <div>Edad: <input type="text" name="edad" size="30" value="<%=unCon.getEdad() %>"></div>
            <div>Altura: <input type="text" name="altura" size="30" value="<%=unCon.getAltura() %>"></div>
            <div><input type="submit" value="Modificar contacto"></div>
        </form>
</html>

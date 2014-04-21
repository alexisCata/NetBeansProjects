<%-- 
    Document   : UpdateCon
    Created on : 10-feb-2014, 11:52:37
    Author     : alexis
--%>
<%@page import="entidades.DireccionAnot"%>
<%@page import="entidades.ContactoAnot"%>
<%
    HttpSession miSesion = request.getSession();
    ContactoAnot  unCon = (ContactoAnot) miSesion.getAttribute("unContacto");
    DireccionAnot direc = unCon.getDireccion();
%> 
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Modificar contacto</title>
    </head>
   <h1>Modificar contacto Hibernate</h1>
        <% 
        
        %>
        <form action="ServUpdHib" method="post" >
            <div>Nombre: <input type="text" name="nombre" size="30" value="<%=unCon.getNombre() %>"></div>
            <div>Teléfono: <input type="text" name="telf" size="30" value="<%=unCon.getTelefono() %>"></div>
            <div>Edad: <input type="text" name="edad" size="30" value="<%=unCon.getEdad() %>"></div>
            <div>Altura: <input type="text" name="altura" size="30" value="<%=unCon.getAltura() %>"></div>
            <div>Dirección: <input type="text" name="direccion" size="30" value="<%=direc.getCalle()%>"></div>
            <div>CP: <input type="text" name="cp" size="30" value="<%=direc.getCodigopostal()%>"></div>
            <div><input type="submit" value="Modificar contacto"></div>
        </form>
</html>

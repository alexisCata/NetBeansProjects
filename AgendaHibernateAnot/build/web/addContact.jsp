<%-- 
    Document   : addContact
    Created on : 10-feb-2014, 10:52:24
    Author     : alexis
--%>
<%@page import="entidades.DireccionAnot"%>
<%@page import="entidades.ContactoAnot"%>
<%
    HttpSession miSesion = request.getSession();
    ContactoAnot unCon = (ContactoAnot) miSesion.getAttribute("unContacto");
    
%> 

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi agenda hacker - Añadir</title>
    </head>
    <body
        <% if (unCon != null) {%>
        onload="alert('Telefono duplicado')"
        <%
        } 
        %>
        >
        <h1>Añadir contactos Hibernate</h1>
        <form action="ServAddHib" method="post" >

            <% if (unCon == null) {%>

            <div>Nombre: <input type="text" name="nombre" size="30" ></div>
            <div>Teléfono: <input type="text" name="telf" size="30" ></div>
            <div>Edad: <input type="text" name="edad" size="30" ></div>
            <div>Altura: <input type="text" name="altura" size="30" ></div>
            <div>Dirección: <input type="text" name="direccion" size="30" ></div>
            <div>CP: <input type="text" name="cp" size="30" ></div>
            <div><input type="submit" value="Añadir contacto"></div>

            <%
            } else {
                DireccionAnot direc = unCon.getDireccion();
            %>
            <div>Nombre: <input type="text" name="nombre" size="30" value="<%=unCon.getNombre()%>"></div>
            <div>Teléfono: <input type="text" name="telf" size="30" value="<%=unCon.getTelefono()%>"></div>
            <div>Edad: <input type="text" name="edad" size="30" value="<%=unCon.getEdad()%>"></div>
            <div>Altura: <input type="text" name="altura" size="30" value="<%=unCon.getAltura()%>"></div>
            <div>Dirección: <input type="text" name="direccion" size="30" value="<%=direc.getCalle()%>"></div>
            <div>CP: <input type="text" name="cp" size="30" value="<%=direc.getCodigopostal()%>"></div>
            <div><input type="submit" value="Añadir contacto"></div>


            <%
                }
            %>


        </form>

    </body>
</html>

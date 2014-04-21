<%-- 
    Document   : removeContact
    Created on : 06-feb-2014, 13:44:19
    Author     : alexis
--%>

<%@page import="java.util.Iterator"%>
<%@page import="datos.Contacto"%>
<%@page import="utilbbdd.AgendaTreeSet"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>

<%
    HttpSession miSesion = request.getSession();
%> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi agenda hacker - Eliminar</title>
    </head>
    <body>
        <h1>Eliminar Contactos</h1>
        
        <%
            if (request.getSession().getAttribute("miAgenda") == null) {
        %>
        NO HAY CONTACTOS
        <%
        } else {
        %>

        <%
            AgendaTreeSet miAgenda = (AgendaTreeSet) miSesion.getAttribute("miAgenda");
        %>
        <%--  <%=miAgenda.MostrarTodo()%>  --%>
        
        <SELECT NAME="conCombo" SIZE=30 > 
        <%
            Iterator<Contacto> it = miAgenda.obtenerContactos().iterator();
            Contacto unCon;
            //String mostrarContactos;
            while (it.hasNext()) {
                unCon = it.next();
                %>
                <OPTION VALUE="<%=unCon.getTelefono()%>"><%=unCon.getNombre()%></OPTION>
                <%
            }
        %>
        
        </SELECT> 
        
        
        
        <hr>
        <%
                }
            }
        %>


        <br>
        <br>

        <div><a href="./index.html">Página principal</a></div>
        
    </body>
</html>

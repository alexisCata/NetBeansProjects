
<%@page import="datos.Contacto"%>
<%@page import="utilbbdd.AgendaTreeSet"%>
<%@page import="java.util.Iterator"%>

<%
    HttpSession miSesion = request.getSession();
%>  

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi agenda hacker - Mostrar</title>
    </head>
    <body>
        <h1>Mostrar Contactos</h1>
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

        <%
            Iterator<Contacto> it = miAgenda.obtenerContactos().iterator();
            String mostrarContactos;
            while (it.hasNext()) {

                mostrarContactos = it.next().toString();
        %>
        <%=mostrarContactos%>
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

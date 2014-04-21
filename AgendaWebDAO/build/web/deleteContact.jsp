<%-- 
    Document   : removeContact
    Created on : 06-feb-2014, 13:44:19
    Author     : alexis
--%>

<%@page import="java.util.Collection"%>
<%@page import="java.util.Iterator"%>
<%@page import="datos.Contacto"%>
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
            Collection<Contacto> contactos = (Collection<Contacto>) miSesion.getAttribute("contactos");
        %>
        <form action="ServDeleteDAO" method="post" >
            <div>
        <SELECT NAME="conCombo" > 
        <%
            Iterator<Contacto> it = contactos.iterator();
            Contacto unCon;
            
            while (it.hasNext()) {
                unCon = new Contacto();
                unCon = it.next();
                %>
                <OPTION VALUE="<%=unCon.getTelefono()%>"><%=unCon.getNombre()%></OPTION>
                <%
            }
        %>
        
        </SELECT> 
        </div>
        <div><input type="submit" value="Eliminar contacto"></div>
        </form>
        
        
        <hr>
        
        <br>
        <br>

        <div><a href="./index.html">Página principal</a></div>
        
    </body>
</html>

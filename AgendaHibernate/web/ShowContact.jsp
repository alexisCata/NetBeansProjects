<%-- 
    Document   : ShowContact
    Created on : 10-feb-2014, 9:56:05
    Author     : alexis
--%>

<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="entidades.ContactoH"%>

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
        <h1>Mostrar Contactos Hibernate</h1>
      
        <%
            List<ContactoH> contactos = (List<ContactoH>) miSesion.getAttribute("listaContactos");
        %>
     <table border="1">
            <tr>
                <td bgcolor="red" align=center width="200px">Nombre</td>
                <td bgcolor="red" align=center width="200px">Teléfono</td>
                <td bgcolor="red" align=center width="200px">Edad</td>
                <td bgcolor="red" align=center width="200px">Altura</td>
            </tr>
            <%
                Iterator<ContactoH> it = contactos.iterator();
                ContactoH unContacto;
                String nom, telf, edad, altura;
                Integer indice = 1;
                while (it.hasNext()) {
                    unContacto = new ContactoH();
                    unContacto = it.next();
                    nom = unContacto.getNombre();
                    telf = unContacto.getTelefono();
                    edad = String.valueOf(unContacto.getEdad());
                    altura = unContacto.getAltura();
                    
                    if (indice % 2 == 0) {
                        
                    
            %>
            <tr>
                <td bgcolor="#FCD035" width="30"><%=nom%></td>
                <td bgcolor="#FCD035" width="30"><%=telf%></td>
                <td bgcolor="#FCD035" width="30"><%=edad%></td>
                <td bgcolor="#FCD035" width="30"><%=altura%></td>
            </tr>
            <%
                }
                    else{
                       %>
                        <tr>
                <td bgcolor="##FCD53E" width="30"><%=nom%></td>
                <td bgcolor="##FCD53E" width="30"><%=telf%></td>
                <td bgcolor="##FCD53E" width="30"><%=edad%></td>
                <td bgcolor="##FCD53E" width="30"><%=altura%></td>
            </tr>
                        
                        <%
                    }
                        indice ++;
                
                
                
                }
            %>

        </table>

        <br>
        <br>

        <div><a href="./index.html">Página principal</a></div>

    </body>
</html>

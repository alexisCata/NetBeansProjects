<%-- 
    Document   : ShowContact
    Created on : 10-feb-2014, 9:56:05
    Author     : alexis
--%>

<%@page import="entidades.DireccionAnot"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="entidades.ContactoAnot"%>

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
            List<ContactoAnot> contactos = (List<ContactoAnot>) miSesion.getAttribute("listaContactos");
        %>
     <table border="1">
            <tr>
                <td bgcolor="red" align=center width="80px">Nombre</td>
                <td bgcolor="red" align=center width="80px">Teléfono</td>
                <td bgcolor="red" align=center width="80px">Edad</td>
                <td bgcolor="red" align=center width="80px">Altura</td>
                <td bgcolor="red" align=center width="200px">Dirección</td>
                <td bgcolor="red" align=center width="80px">Modificar</td>
                <td bgcolor="red" align=center width="80px">Eliminar</td>
            </tr>
            <%
                Iterator<ContactoAnot> it = contactos.iterator();
                ContactoAnot unContacto;
                DireccionAnot direc;
                String nom, telf, edad, altura, direccion;
                Integer indice = 1;
                Integer id = 0;
                while (it.hasNext()) {
                    unContacto = new ContactoAnot();
                    unContacto = it.next();
                    id = unContacto.getId();
                    nom = unContacto.getNombre();
                    telf = unContacto.getTelefono();
                    edad = String.valueOf(unContacto.getEdad());
                    altura = unContacto.getAltura();
                    direc = unContacto.getDireccion();
                    direccion = direc.getCalle() + " - " + direc.getCodigopostal();
                    
                    if (indice % 2 == 0) {
                        
                    
            %>
            <tr>
                <td bgcolor="#FCD035" ><%=nom%></td>
                <td bgcolor="#FCD035" ><%=telf%></td>
                <td bgcolor="#FCD035" ><%=edad%></td>
                <td bgcolor="#FCD035" ><%=altura%></td>
                <td bgcolor="#FCD035" ><%=direccion%></td>
                <td bgcolor="#FCD035" ><a href="./ServUpdateHib?id=<%=id%>">Modificar</a></td>
                <td bgcolor="#FCD035" ><a href="./ServDeleteHib?id=<%=id%>">Eliminar</a></td>
                
            </tr>
            <%
                }
                    else{
                       %>
                        <tr>
                <td bgcolor="##FCD53E" ><%=nom%></td>
                <td bgcolor="##FCD53E" ><%=telf%></td>
                <td bgcolor="##FCD53E" ><%=edad%></td>
                <td bgcolor="##FCD53E" ><%=altura%></td>
                <td bgcolor="##FCD53E" ><%=direccion%></td>
                <td bgcolor="##FCD53E" ><a href="./ServUpdateHib?id=<%=id%>">Modificar</a></td>
                <td bgcolor="##FCD53E" ><a href="./ServDeleteHib?id=<%=id%>">Eliminar</a></td>
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

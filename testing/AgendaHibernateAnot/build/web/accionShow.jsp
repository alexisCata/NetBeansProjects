<%-- 
    Document   : accionShow
    Created on : 10-feb-2014, 12:40:50
    Author     : alexis
--%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.List"%>
<%@page import="entidades.ContactoAnot"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<%
    HttpSession miSesion = request.getSession();
    String accion = (String) miSesion.getAttribute("accion"); //recuperamos parametros

%> 

<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>
            <% if (accion.equals("upd")) {
            %>
            Mi agenda hacker - Modificar Hibernate
            <%
            } else if (accion.equals("del")) {
            %>
            Mi agenda hacker - Eliminar Hibernate
            <%
                }
            %>
        </title>
    </head>
    <body>
        <h1>
            <% if (accion.equals("upd")) {
            %>
            Modificar Contactos Hibernate
            <%
            } else if (accion.equals("del")) {
            %>
            Eliminar Contactos Hibernate
            <%
                }
            %>
        </h1>

        
        <%
            List<ContactoAnot> contactos = (List<ContactoAnot>) miSesion.getAttribute("listaContactos");
        %>
        <% if (accion.equals("upd")) {
            %>
            <form action="ServUpdateHib" method="post" >
            <%
            } else if (accion.equals("del")) {
            %>
            <form action="ServDeleteHib" method="post" >
            <%
                }
            %>
        
        
            <div>
                <SELECT NAME="id" > 
                    <%
                        Iterator<ContactoAnot> it = contactos.iterator();
                        ContactoAnot unCon;

                        while (it.hasNext()) {
                            unCon = new ContactoAnot();
                            unCon = it.next();
                    %>
                    <OPTION VALUE="<%=unCon.getId()%>"><%=unCon.getNombre()%></OPTION>
                        <%
                            }
                        %>

                </SELECT> 
            </div>
            
            
            <% if (accion.equals("upd")) {
            %>
            <div><input type="submit" value="Modificar contacto"></div>
            <%
            } else if (accion.equals("del")) {
            %>
            <div><input type="submit" value="Eliminar contacto"></div>
            <%
                }
            %>
            
            
            
            
            
        </form>


        <hr>

        <br>
        <br>

        <div><a href="./index.html">Página principal</a></div>

    </body>
</html>

<%@page import="java.util.Collection"%>
<%@page import="datos.Contacto"%>
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
            Collection<Contacto> contactos = (Collection<Contacto>) miSesion.getAttribute("contactos");
        %>

        <table border="1">
            <tr>
                <td bgcolor="#90C140" align=center width="200px">Nombre</td>
                <td bgcolor="#90C140" align=center width="200px">Teléfono</td>
                <td bgcolor="#90C140" align=center width="200px">Edad</td>
                <td bgcolor="#90C140" align=center width="200px">Altura</td>
            </tr>
            <%
                Iterator<Contacto> it = contactos.iterator();
                Contacto unContacto;
                String nom, telf, edad, altura;
                Integer indice = 1;
                while (it.hasNext()) {
                    unContacto = new Contacto();
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

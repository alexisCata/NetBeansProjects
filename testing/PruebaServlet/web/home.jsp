<%-- 
    Document   : home
    Created on : 06-feb-2014, 10:18:34
    Author     : alexis
--%>

<% 
HttpSession mise = request.getSession();
%>            

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Mi primer JSP folluo</title>
    </head>
    <body>
        <h1>Mi primer JSP follúo</h1>
        -------
        Directa
        -------
        <div>
        Nombre: <%=mise.getAttribute("nombre")%>
        Teléfono: <%=mise.getAttribute("telf")%>
        </div>
        -------
        OUT
        -------
        <div>
        <% 
        out.println("Nombre: " + mise.getAttribute("nombre"));
        out.println("Teléfono: " + mise.getAttribute("telf"));
        %>
        </div>
        --------
        Forma OK
        --------
        <div>
            <%
            String nombre = (String) mise.getAttribute("nombre");
            %>
            Nombre: <%=nombre%>
        </div>    
        <div>
            <%
            String telf = (String) mise.getAttribute("telf" );
            %>
            Teléfono: <%=telf%>
        </div>
        ----------
        Con $
        ----------
        <div>
        Nombre: ${nombre}
        Teléfono: ${telf}
        </div>
            
            
    </body>
</html>

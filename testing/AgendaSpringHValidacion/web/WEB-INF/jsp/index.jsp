<%@page import="java.util.ArrayList"%>
<%@page import="java.util.HashMap"%>
<%@page import="java.util.Iterator"%>
<%@page import="java.util.Map"%>
<%@page import="AgendaSpringH.controladores.ContactoEntidad"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Welcome to Spring Web MVC project</title>
    </head>

    <body>
        <% 
            ContactoEntidad nombre = (ContactoEntidad) request.getAttribute("contacto");
            ContactoEntidad nombre2 = (ContactoEntidad) request.getAttribute("contacto2");
            ContactoEntidad nombre3 = (ContactoEntidad) request.getAttribute("contacto3");
            ArrayList<ContactoEntidad> lista = (ArrayList<ContactoEntidad>) request.getAttribute("lista");
            
            System.out.println(nombre);
            System.out.println(nombre2);
            System.out.println(nombre3);
            out.print("<table width=\"100%\" border=\"1\" cellpadding=\"0\" cellspacing=\"0\" bordercolor=\"purple\">");
            out.print("<th>Id</th><th>Nombre</th><th>Telefono</th><th>Email</th>");
            Map<String, ContactoEntidad> mapa = new HashMap();
            mapa.put("contacto", nombre);
            mapa.put("contacto2", nombre2);
            mapa.put("contacto3", nombre3);
            ContactoEntidad contacto;
            
            //Iterator<ContactoEntidad> it = mapa.values().iterator();
            Iterator<ContactoEntidad> it = lista.iterator();
            while(it.hasNext()){
                contacto = it.next();
                out.print("<tr><td>"+contacto.getId()+"</td><td>"+contacto.getNombre()+"</td><td>"+contacto.getTelefono()+"</td><td>"+contacto.getEmail()+"</td></tr>");
            }
            out.println("</table>");
        %>
        <!-- ${contacto} Esto imprime tambien un contacto -->
        <br/>
        <p>Hello! This is the default welcome page for a Spring Web MVC project.</p>
        <p><i>To display a different welcome page for this project, modify</i>
            <tt>index.jsp</tt> <i>, or create your own welcome page then change
                the redirection in</i> <tt>redirect.jsp</tt> <i>to point to the new
                welcome page and also update the welcome-file setting in</i>
            <tt>web.xml</tt>.</p>
    </body>
</html>

<%-- 
    Document   : mostrar_contactos
    Created on : 14-feb-2014, 13:39:45
    Author     : juan
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>JSP Page</title>
    </head>
    <body>
        <h3>Contactos</h3>
        <c:if  test="${!contactList.isEmpty()}">
            <table class="data">
                <tr>
                    <th>Nombre</th>
                    <th>Edad</th>
                    <th>Altura</th>
                    <th>Telefono</th>
                    <th>&nbsp;</th>
                </tr>
                <c:forEach items="${contactList}" var="contact">
                    <tr>
                        <td>${contact.nombre}</td>
                        <td>${contact.edad}</td>
                        <td>${contact.altura}</td>
                        <td>${contact.telefono}</td>
                        <td><a href="update/${contact.id}"><spring:message code="label.updatecontact"/></a></td>
                        <td><a href="delete/${contact.id}"><spring:message code="label.deletecontact"/></a></td>
                        <hr />
                    </tr>
                </c:forEach>
            </table>
        </c:if>
    </body>
</html>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <title>Spring 3 MVC Series - Contact Manager</title>
        <style type="text/css">
            body {
                font-family: sans-serif;
            }
            .data, .data td {
                border-collapse: collapse;
                width: 50%;
                border: 1px solid #aaa;
                margin: 2px;
                padding: 2px;
            }
            .data th {
                font-weight: bold;
                background-color: #5C82FF;
                color: white;
            }
        </style>
    </head>
    <body>
        <h3>Contactos</h3>
        <c:if test="${!empty contactList}">
            <table class="data">
                <tr>
                    <th><spring:message code="label.firstname"/></th>
                    <th><spring:message code="label.email"/></th>
                    <th><spring:message code="label.telephone"/></th>
                    <th><spring:message code="label.street"/></th>
                    <th><spring:message code="label.postalcode"/></th>
                    <th>&nbsp;</th>
                    <th>&nbsp;</th>
                </tr>
                <c:forEach items="${contactList}" var="contact">
                    <tr>
                        <td>${contact.lastname}, ${contact.firstname} </td>
                        <td>${contact.email}</td>
                        <td>${contact.telephone}</td>
                        <td>${contact.address.street}</td>
                        <td>${contact.address.postalcode}</td>
                        <td><a href="delete/${contact.id}">Eliminar</a></td>
                        <td><a href="modify/${contact.id}">Modificar</a></td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
        <a href="./index.html">Volver</a><br />
    </body>
</html>

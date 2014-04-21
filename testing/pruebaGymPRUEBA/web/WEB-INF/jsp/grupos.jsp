<%-- 
    Document   : grupos
    Created on : 22-feb-2014, 12:29:16
    Author     : alexis
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head><title>GYM</title>
    </head>
    <body>
        <h1>Control entrenamientos</h1>
        <hr>

        <c:if test="${!empty gruposList}">
            <table class="data">
                <tr>
                    <th><spring:message code="label.grupo"/></th>
                    <th>&nbsp;</th>
                    <th>&nbsp;</th>
                </tr>
                <c:forEach items="${gruposList}" var="GrupoMuscular">
                    <tr>
                        <td>${GrupoMuscular.grupo} </td>
                        <td><a href="borraGr/${GrupoMuscular.id}">Eliminar</a></td>
                        <td><a href="modGr/${GrupoMuscular.id}">Modificar</a></td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
        <hr>
        <div><a href="./nuevogrupo">Nuevo grupo</a></div>
        <hr>
        <div><a href="./inicio">Volver al inicio</a></div>
    </body>
</html>

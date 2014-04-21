<%-- 
    Document   : ejercicios
    Created on : 23-feb-2014, 10:11:01
    Author     : alexis
--%>
<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <link href='<c:url value="/resources/css/bootstrap-theme.min.css" />' rel="stylesheet" type="text/css" />
        <link href='<c:url value="/resources/css/bootstrap-theme.css" />' rel="stylesheet" type="text/css" />
        <link href='<c:url value="/resources/css/bootstrap.css" />' rel="stylesheet" type="text/css" />   
        <script type='text/javascript' src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GYM</title>
    </head>
    <body>
        <div class="container" align="center">        
        
        <h1>Control entrenamientos</h1>
        <hr>

        <c:if test="${!empty ejerciciosList}">
            <table class="table-bordered">
                <tr>
                    <th><spring:message code="label.ejercicio"/></th>
                    <th><spring:message code="label.descripcion"/></th>
                    <th><spring:message code="label.grupo"/></th>
                    <th>&nbsp;</th>
                    <th>&nbsp;</th>
                </tr>
                <c:forEach items="${ejerciciosList}" var="ejercicio">
                    <tr>
                        <td>${ejercicio.ejercicio} </td>
                        <td>${ejercicio.descripcion} </td>
                        <td>${ejercicio.grupoMuscular.grupo} </td>
                        <td><a href="borraEj/${ejercicio.id}">Eliminar</a></td>
                        <td><a href="modEj/${ejercicio.id}">Modificar</a></td>
                    </tr>
                </c:forEach>
            </table>
        </c:if>
        <hr>
        <div><a href="./nuevoejercicio">Nuevo ejercicio</a></div>
        <hr>
        <div><a href="./inicio">Volver al inicio</a></div>
        </div>
    </body>
</html>

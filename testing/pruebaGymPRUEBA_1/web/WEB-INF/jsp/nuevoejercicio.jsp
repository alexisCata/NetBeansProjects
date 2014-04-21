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
        <h3>Nuevo ejercicio</h3>

        <form:form method="post" action="nuevoejercicio" commandName="ejercicio">
            <table>
                <tr>
                    <td><form:label path="grupoMuscular.id"><spring:message code="label.grupo"/></form:label></td>            
                        <td>
                        <form:select path="grupoMuscular.id"  class="form-control" required="autofocus">
                            <form:option value="" label="--Elegir--"/>
                                <c:forEach items="${gruposList}" var="GrupoMuscular">
                                    <form:option value="${GrupoMuscular.id}" label="${GrupoMuscular.grupo}"/>
                                </c:forEach> 
                            <%-- <form:options items="${gruposList}" />--%>
                        </form:select>   
                    </td> 
                    <td><font color="red"><form:errors path="grupoMuscular.id" /></font></td>
                </tr>         
                <tr>
                    <td><form:label path="ejercicio"><spring:message code="label.ejercicio"/></form:label></td>
                    <td><form:input path="ejercicio"  class="form-control" required="autofocus"/></td> 
                    <td><font color="red"><form:errors path="ejercicio" /></font></td>
                </tr>
                <tr>
                    <td><form:label path="descripcion"><spring:message code="label.descripcion"/></form:label></td>
                    <td><form:input path="descripcion"  class="form-control" required="autofocus"/></td> 
                    <td><font color="red"><form:errors path="descripcion" /></font></td>
                </tr>

<tr>
                        <td colspan="2" align="center">
                            <button class="btn btn-primary" type="submit"><spring:message code="label.add"/></button>
                        </td>
                    </tr>

            </table> 
        </form:form>
        </div>
        <a href="./inicio">Volver al inicio</a>

    </body>
</html>

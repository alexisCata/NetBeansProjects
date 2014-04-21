<%-- 
    Document   : modgrupo
    Created on : 22-feb-2014, 13:33:41
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
        <h3>Modificar grupo muscular</h3>

    
        <form:form method="post" action="../mod/${grupo.id}" commandName="grupo">
        <table>
            <tr>
                <td><form:label path="grupo"><spring:message code="label.grupo"/></form:label></td>
            <td><form:input path="grupo" /></td> 
            <td><font color="red"><form:errors path="grupo" /></font></td>
            </tr>
            <tr>
                <td colspan="2">
                    <input type="submit" value="<spring:message code="label.mod"/>"/>
                </td>
            </tr>

            
        </table> 
    </form:form>

    <a href="./inicio">Volver al inicio</a>
        </div>
</body>
</html>

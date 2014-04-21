<%-- 
    Document   : home
    Created on : 14-feb-2014, 13:20:01
    Author     : juan
--%>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>Añadir nuevo contacto</title>
    </head>
    <body>
        <h2><spring:message code="label.menu"/></h2>
 
        <form:form method="post" action="add" commandName="contactoForm">

            <table>
                <tr>
                    <td><form:label path="nombre"></form:label><spring:message code="label.firstname"/></td>
                    <td><form:input path="nombre" /></td>
                </tr>
                <tr>
                    <td><form:label path="edad"><spring:message code="label.edad"/></form:label></td>
                    <td><form:input path="edad" /></td>
                </tr>
                <tr>
                    <td><form:label path="altura"><spring:message code="label.altura"/></form:label></td>
                    <td><form:input path="altura" /></td>
                </tr>
                <tr>
                    <td><form:label path="telefono"><spring:message code="label.telephone"/></form:label></td>
                    <td><form:input path="telefono" /></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="<spring:message code="label.addcontact"/>"/>
                    </td>
                </tr>
            </table>

        </form:form>
    </body>
</html>

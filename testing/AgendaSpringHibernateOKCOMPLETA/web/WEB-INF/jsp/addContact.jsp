<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Spring 3 MVC Series - Contact Manager | viralpatel.net</title>
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
        <td><form:label path="telefono"><spring:message code="label.telephone"/></form:label></td>
        <td><form:input path="telefono" /></td>
    </tr>
    <tr>
        <td><form:label path="apellido"><spring:message code="label.lastname"/></form:label></td>
        <td><form:input path="apellido" /></td>
    </tr>
    <tr>
        <td><form:label path="direccion.calle"><spring:message code="label.calle"/></form:label></td>
        <td><form:input path="direccion.calle" /></td>
    </tr>
    <tr>
        <td><form:label path="direccion.codigopostal"><spring:message code="label.codigopostal"/></form:label></td>
        <td><form:input path="direccion.codigopostal" /></td>
    </tr>
    <tr>
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.addcontact"/>"/>
        </td>
    </tr>
</table> 
</form:form>
 
     
<hr>
<div><a href="./index">Página principal</a></div>
 
</body>
</html>

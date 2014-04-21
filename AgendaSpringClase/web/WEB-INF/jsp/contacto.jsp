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
        <td colspan="2">
            <input type="submit" value="<spring:message code="label.addcontact"/>"/>
        </td>
    </tr>
</table> 
</form:form>
 
     
<h3>Contacts</h3>
<c:if  test="${!empty contactList}">
<table class="data">
<tr>
    <th>Nombre</th>
    <th>Apellido</th>
    <th>Telefono</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${contactList}" var="contact">
    <tr>
        <td>${contact.nombre}, ${contact.apellido} </td>
        <td>${contact.apellido}</td>
        <td>${contact.telefono}</td>
        <td><a href="delete/${contact.id}"><spring:message code="label.deletecontact"/></a></td>
    </tr>
</c:forEach>
</table>
</c:if>
 
</body>
</html>

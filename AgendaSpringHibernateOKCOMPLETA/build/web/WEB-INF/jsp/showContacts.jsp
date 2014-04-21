<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
<head>
    <title>Spring 3 MVC Series - Contact Manager | viralpatel.net</title>
</head>
<body>
 
     
<h3>Contacts</h3>
<c:if  test="${!empty contactList}">
<table class="data">
<tr>
    <th>Nombre</th>
    <th>Apellido</th>
    <th>Telefono</th>
    <th>Calle</th>
    <th>C.P.</th>
    <th>&nbsp;</th>
</tr>
<c:forEach items="${contactList}" var="contact">
    <tr>
        <td>${contact.nombre}, ${contact.apellido} </td>
        <td>${contact.apellido}</td>
        <td>${contact.telefono}</td>
        <td>${contact.direccion.calle}</td>
        <td>${contact.direccion.codigopostal}</td>
        <td><a href="delete/${contact.id}"><spring:message code="label.deletecontact"/></a></td>
    </tr>
</c:forEach>
</table>
</c:if>
 
<hr>
<div><a href="./index">Página principal</a></div>
        

</body>
</html>

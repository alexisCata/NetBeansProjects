<%-- 
    Document   : buscar_contacto.jsp
    Created on : 17-feb-2014, 9:24:25
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
        <title>JSP Page</title>
    </head>
    <body>
        <h1>Buscar contacto por telefono</h1>
        
        <c:if  test="${!contactList.isEmpty()}">
            <form:form method="post" action="update" commandName="contactoForm">
                <select class="data" name="telefono">
                    <c:forEach items="${contactList}" var="contact">
                            <option value="${contact.telefono}">${contact.nombre}</option>
                    </c:forEach>
                </select>
                <input type="submit" value="<spring:message code="label.seleccionar"/>"/>
            </form:form>
        </c:if>
        
    </body>
</html>

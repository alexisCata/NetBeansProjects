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
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GYM</title>
    </head>
    <body>
        <h1>Registro</h1>

        <form:form method="post" action="registro" commandName="usuario">
            <table>
                <tr>
                    <td><form:label path="accesoUsuario.login"><spring:message code="label.login"/></form:label></td>
                    <td><form:input path="accesoUsuario.login" /></td> 
                    <td><font color="red"><form:errors path="accesoUsuario.login" /></font></td>
                </tr>
                <tr>
                    <td><form:label path="accesoUsuario.password"><spring:message code="label.password"/></form:label></td>
                    <td><form:input type="password" path="accesoUsuario.password" /></td>
                    <td><font color="red"><form:errors path="accesoUsuario.password" /></font></td>
                </tr>
                <tr>
                    <td><form:label path="nombre"><spring:message code="label.nombre"/></form:label></td>
                    <td><form:input path="nombre" /></td> 
                    <td><font color="red"><form:errors path="nombre" /></font></td>
                </tr>
                <tr>
                    <td><form:label path="apellidos"><spring:message code="label.apellidos"/></form:label></td>
                    <td><form:input path="apellidos" /></td> 
                    <td><font color="red"><form:errors path="apellidos" /></font></td>
                </tr>            
                <tr>
                    <td><form:label path="sexo"><spring:message code="label.sexo"/></form:label></td>
                    <td>Hombre: <form:radiobutton path="sexo" value="H"/> <br/>
                        Mujer: <form:radiobutton path="sexo" value="M"/> </td>
                    <td><font color="red"><form:errors path="sexo" /></font></td>
                </tr>       
                <tr>
                    <td><form:label path="edad"><spring:message code="label.edad"/></form:label></td>
                        <td>
                        <form:select path="edad">
                            <form:option value="" label="--Elegir--"/>
                            <form:options items="${edad}"/>
                        </form:select>
                    </td> 
                    <td><font color="red"><form:errors path="edad" /></font></td>
                </tr>

                <tr>
                    <td><form:label path="altura"><spring:message code="label.altura"/></form:label></td>
                    <td><form:select path="altura">
                            <form:option value="" label="--Elegir--"/>
                            <form:options items="${altura}"/>
                        </form:select>
                    </td> 
                    <td><font color="red"><form:errors path="altura" /></font></td>
                </tr>
                <tr>
                    <td><form:label path="peso"><spring:message code="label.peso"/></form:label></td>
                    <td><form:select path="peso">
                            <form:option value="" label="--Elegir--"/>
                            <form:options items="${peso}"/>
                        </form:select></td> 
                    <td><font color="red"><form:errors path="peso" /></font></td>
                </tr>




                <tr>
                    <td colspan="2">
                        <input type="submit" value="<spring:message code="label.registrar"/>"/>
                    </td>
                </tr>



            </table> 
        </form:form>

        <a href="./index">Volver</a>
    </body>
</html>

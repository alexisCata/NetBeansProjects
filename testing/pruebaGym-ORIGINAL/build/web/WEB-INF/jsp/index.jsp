<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GYM</title>
    </head>
    <body>
        <h1>Control entrenamientos</h1>
        <hr>
        <h1>Acceso</h1>
        <form action="login" method="post" >
            <!-- <div><a href="./ServCargaLista?accion=sho">Datos</a></div> 
            <div>Usuario: <input type="text" name="usuario" size="30" ></div>
            <div><input type="submit" value="Acceder"></div>
            -->

            <form:form method="post" action="login" commandName="accesoUsuario">
                <table>
                    <tr>
                        <td><form:label path="login"><spring:message code="label.login"/></form:label></td>
                        <td><form:input path="login" /></td> 
                        <td><font color="red"><form:errors path="login" /></font></td>
                    </tr>
                    <tr>
                        <td><form:label path="password"><spring:message code="label.password"/></form:label></td>
                        <td><form:input type="password" path="password" /></td>
                        <td><font color="red"><form:errors path="password" /></font></td>
                    </tr>
                    <tr>
                        <td colspan="2">
                            <input type="submit" value="<spring:message code="label.acceso"/>"/>
                        </td>
                    </tr>

                    <c:if  test="${!empty error}">
                    <tr>    
                        <td colspan="2">
                        <spring:message code="label.erroracceso"/>
                        </td>
                    </tr>
                    </c:if>

                </table> 
            </form:form>

        </form>
    </body>
</html>

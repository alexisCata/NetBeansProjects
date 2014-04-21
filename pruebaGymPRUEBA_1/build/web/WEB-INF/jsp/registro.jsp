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
        <link href='<c:url value="/resources/css/bootstrap-theme.min.css" />' rel="stylesheet" type="text/css" />
        <link href='<c:url value="/resources/css/bootstrap-theme.css" />' rel="stylesheet" type="text/css" />
        <link href='<c:url value="/resources/css/bootstrap.css" />' rel="stylesheet" type="text/css" />   
        <script type='text/javascript' src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <title>GYM</title>
    </head>
    <body>


            <div class="container" align="center">        
                <h1 class="form-signin-heading">Registro</h1>
                <form:form method="post" action="registro" commandName="usuario">
                    <table>
                        <tr>
                            <td><form:label path="accesoUsuario.login"><spring:message code="label.login"/></form:label></td>
                            <td><form:input class="form-control"  path="accesoUsuario.login" required="autofocus"/></td> 
                            <td><font color="red"><form:errors path="accesoUsuario.login" /></font></td>
                        </tr>
                        <tr>
                            <td><form:label path="accesoUsuario.password"><spring:message code="label.password"/></form:label></td>
                            <td><form:input class="form-control"  type="password" path="accesoUsuario.password" required="autofocus"/></td>
                            <td><font color="red"><form:errors path="accesoUsuario.password" /></font></td>
                        </tr>
                        <tr>
                            <td><form:label path="nombre"><spring:message code="label.nombre"/></form:label></td>
                            <td><form:input class="form-control"  path="nombre" required="autofocus"/></td> 
                            <td><font color="red"><form:errors path="nombre" /></font></td>
                        </tr>
                        <tr>
                            <td><form:label path="apellidos"><spring:message code="label.apellidos"/></form:label></td>
                            <td><form:input class="form-control"  path="apellidos" required="autofocus"/></td> 
                            <td><font color="red"><form:errors path="apellidos" /></font></td>
                        </tr>     

                        <tr>
                            <td><form:label path="sexo"><spring:message code="label.sexo"/></form:label></td>
                            <td>Hombre: <form:radiobutton path="sexo" value="H" required="autofocus"/> 
                                Mujer: <form:radiobutton path="sexo" value="M" required="autofocus"/> </td>
                            <td><font color="red"><form:errors path="sexo" /></font></td>
                        </tr>      

                        <tr>
                            <td><form:label path="edad"><spring:message code="label.edad"/></form:label></td>
                                <td>
                                <form:select class="form-control"  path="edad" required="autofocus" >
                                    <form:option value="" label="--Elegir--"/>
                                    <form:options items="${edad}"/>
                                </form:select>
                            </td> 
                            <td><font color="red"><form:errors path="edad" /></font></td>
                        </tr>

                        <tr>
                            <td><form:label path="altura"><spring:message code="label.altura"/></form:label></td>
                            <td><form:select class="form-control"  path="altura" required="autofocus" >
                                    <form:option value="" label="--Elegir--"/>
                                    <form:options items="${altura}"/>
                                </form:select>
                            </td> 
                            <td><font color="red"><form:errors path="altura" /></font></td>
                        </tr>
                        <tr>
                            <td><form:label path="peso"><spring:message code="label.peso"/></form:label></td>
                            <td><form:select class="form-control"  path="peso" required="autofocus">
                                    <form:option value="" label="--Elegir--"/>
                                    <form:options items="${peso}"/>
                                </form:select></td> 
                            <td><font color="red"><form:errors path="peso" /></font></td>
                        </tr>


                        <tr>
                            <td colspan="3" align="center">
                                <button class="btn btn-primary"  type="submit"><spring:message code="label.registrar"/></button>
                            </td>
                        </tr>

                    </table> 
                </form:form>

            </div>
        
        <a href="./index">Volver</a>


    </body>
</html>

<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>

<%@page contentType="text/html" pageEncoding="UTF-8"%>
<!DOCTYPE HTML PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN"
    "http://www.w3.org/TR/html4/loose.dtd">

<html>
    <head>
        <link href='<c:url value="/resources/css/bootstrap-theme.min.css" />' rel="stylesheet" type="text/css" />
        <link href='<c:url value="/resources/css/bootstrap-theme.css" />' rel="stylesheet" type="text/css" />
        <link href='<c:url value="/resources/css/bootstrap.css" />' rel="stylesheet" type="text/css" />   
        <script type='text/javascript' src="<c:url value="/resources/js/bootstrap.min.js" />"></script>
        <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
        <meta name="viewport" content="width=device-width, initial-scale=1">
        <title>GYM</title>
    </head>
    <body>

        <div class="container" align="CENTER">        
            <h1>CONTROL ENTRENAMIENTOS</h1>
            <hr>
            

            <form:form method="post" action="login" commandName="accesoUsuario" class="form-signin" role="form">
                <table>
                    <tr>
                        <td><form:input path="login" class="form-control" placeholder="Usuario" required="autofocus"/></td> 
                        <td><font color="red"><form:errors path="login" /></font></td>
                    </tr>
                    
                    <tr>

                        <td><form:password path="password" class="form-control" placeholder="Contraseña" required="autofocus"/></td>
                        <td><font color="red"><form:errors path="password" /></font></td>
                    </tr>

                    <tr>
                        <td colspan="2">
                            <button class="btn btn-primary btn-block" type="submit"><spring:message code="label.acceso"/></button>
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



        </div>
            <div>
                <a href="./registro">Registro</a>
            </div>

    </body>
</html>

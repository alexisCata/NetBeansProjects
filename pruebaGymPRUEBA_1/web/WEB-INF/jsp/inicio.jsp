<%-- 
    Document   : inicio
    Created on : 21-feb-2014, 9:52:56
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
        <!-- <div><a href="./ServCargaLista?accion=sho">Datos</a></div> -->
        <div><a href="./datos">Datos</a></div>
        <hr>
        <div><a href="./entrenos">Entrenamientos</a></div>
        <hr>
        <div><a href="./gestion">Gestion</a></div>
        <hr>
        </div>
    </body>
</html>

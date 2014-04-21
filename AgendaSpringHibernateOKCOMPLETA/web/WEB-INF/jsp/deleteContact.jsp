<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>Spring 3 MVC Series - Contact Manager | viralpatel.net</title>
    </head>
    <body>


        <h3>Eliminar Contacts</h3>
        
            <form action="deleteTelef" method="post" >
                <div><spring:message code="label.telephone"/><input type="text" name="telf" size="30" ></div>
                <div><input type="submit" value="<spring:message code="label.deletecontact"/>"/></div>
            </form>       

        <hr>
        <div><a href="./index">Página principal</a></div>

    </body>
</html>

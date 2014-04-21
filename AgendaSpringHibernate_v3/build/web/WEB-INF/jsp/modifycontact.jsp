<%@taglib uri="http://www.springframework.org/tags" prefix="spring"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<%@taglib uri="http://java.sun.com/jsp/jstl/core" prefix="c"%>
<html>
    <head>
        <title>Spring 3 MVC Series - Contact Manager</title>
        <style type="text/css">
            body {
                font-family: sans-serif;
            }
            .data, .data td {
                border-collapse: collapse;
                width: 80%;
                border: 1px solid #aaa;
                margin: 2px;
                padding: 2px;
            }
            .data th {
                font-weight: bold;
                background-color: #5C82FF;
                color: white;
            }
        </style>
    </head>
    <body>
        <h2><spring:message code="label.title"/></h2>
        <form:form method="post" action="../modify/${contact.id}" commandName="contact">
            <table>
                <tr>
                    <td><form:label path="firstname"><spring:message code="label.firstname"/></form:label></td>
                    <td><form:input path="firstname" /></td> 
                    <td><font color="red"><form:errors path="firstname" /></font></td>
                </tr>
                <tr>
                    <td><form:label path="lastname"><spring:message code="label.lastname"/></form:label></td>
                    <td><form:input path="lastname" /></td>
                    <td><font color="red"><form:errors path="lastname" /></font></td>
                </tr>
                <tr>
                    <td><form:label path="email"><spring:message code="label.email"/></form:label></td>
                    <td><form:input path="email" /></td>
                    <td><font color="red"><form:errors path="email" /></font></td>
                </tr>
                <tr>
                    <td><form:label path="telephone"><spring:message code="label.telephone"/></form:label></td>
                    <td><form:input path="telephone" /></td>
                    <td><font color="red"><form:errors path="telephone" /></font></td>
                </tr>
                <tr>
                    <td><form:label path="address.street"><spring:message code="label.street"/></form:label></td>
                    <td><form:input path="address.street" /></td>
                    <td><font color="red"><form:errors path="address.street" /></font></td>
                </tr>
                <tr>
                    <td><form:label path="address.postalcode"><spring:message code="label.postalcode"/></form:label></td>
                    <td><form:input path="address.postalcode" /></td>
                    <td><font color="red"><form:errors path="address.postalcode" /></font></td>
                </tr>
                <tr>
                    <td colspan="2">
                        <input type="submit" value="<spring:message code="label.modifycontact"/>"/>
                    </td>
                </tr>
            </table> 
        </form:form>
        <a href="../index.html">Volver</a><br />
    </body>
</html>
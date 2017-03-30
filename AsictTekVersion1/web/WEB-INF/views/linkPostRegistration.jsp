<%@ taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<%--
  Created by IntelliJ IDEA.
  User: Daniel
  Date: 1/28/2017
  Time: 11:56 AM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
     <title>Add New LinkPost</title>
    <script src="/resources/js/jquery/jquery-3.1.1.min"></script>




</head>
<body>
<%@include file="menu.jsp"%>
<form:form method="POST" modelAttribute="link"  >
    <form:input type="hidden" path="linkId" id="linkId"/>
    <table>
        <tr>
            <td><label id="linkName">Name:</label> </td>
            <td><form:input path="linkName"   id="linkName" cssClass="w3-input"/> </td>
        </tr>
        <tr>
            <td><label id="linkDescription">description</label></td>
            <td><form:input path="linkDescription" id="linkDescription" cssClass="w3-input"/> </td>
       </tr>
        <tr>
            <td colspan="3">
                <c:choose>
                    <c:when test="${edit}">
                        <input type="submit" id="submitForm" value="Update"  />
                    </c:when>
                    <c:otherwise>
                        <input type="submit" id="registerForm" value="Register"  />
                    </c:otherwise>
                </c:choose>
            </td>
        </tr>
        <img src="/resources/images/company_logo.jpg">
    </table>
    <br>
    <br>

</form:form>

</body>
</html>

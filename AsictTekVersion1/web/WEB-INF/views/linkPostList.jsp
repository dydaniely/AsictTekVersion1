<%@ page import="java.util.Date" %>
<%@taglib prefix="spring" uri="http://www.springframework.org/tags/form" %>
<%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%@taglib prefix="fmt" uri="http://java.sun.com/jsp/jstl/fmt" %>
<%--
  Created by IntelliJ IDEA.
  User: Daniel
  Date: 1/28/2017
  Time: 5:09 PM
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>registered Links list</title>
    <link rel="stylesheet" href="http://www.w3schools.com/lib/w3.css">
    <script src="/resources/js/jquery/chosen_v1.6.2/chosen.jquery.js"> </script>
    <script>
        function showQuote(linkId){
        var quoteValue=document.getElementById("quote");
          if(linkId.isEmpty()){
              quoteValue.style.display='block'}
              else
          {
              quoteValue.style.display='none';
          }
        }
    </script>

</head>
<body>
<%@include file="menu.jsp"%>
<header class="w3-container w3-light-gray">
   <h3>Registered list</h3>
</header>
<table class="w3-table">
    <tr>
        <th>Id</th>
        <th>Link Post Name</th>
        <th>Link Post Description</th>
    </tr>
    <c:if test="${listsLink.size()>1}">
       <h3><c:out value="${listsLink.size()} links are listed "/></h3>
    </c:if>
    <c:set var="today" value="<%= new Date()%>"/>

   <br/>Today's Date is <fmt:formatDate  type="date" value="${today}"/>
    <br/> Time: <fmt:formatDate value="${today}" type="time" />

    <c:forEach items= "${listsLink}" var="links">
        <tr>
        <td>${links.linkId}</td>
        <td>${links.linkName}</td><b></b>
        <td>${links.linkDescription}</td>
        <td><a class="w3-btn w3-dark-gray" href="<c:url value="/NewLinkPost/edit-${links.linkId}-Links"/>"/>Edit</td>
        <td><a class="w3-btn w3-dark-gray" href="<c:url value="/NewLinkPost/delete-${links.linkId}-Links"/>"/>Delete</td>
        <td><input type="button" id="showMe" value="ShowMe" onclick="showQuote(${links.linkId})" class="w3-btn w3-dark-gray"></td>
        </tr>
    </c:forEach>
    <div>
     <tr>
         <td><a class="w3-btn w3-light-gray"  href="<c:url value='/NewLinkPost/linkPostRegistration'/>"/> Add New LinkPost</td>
     </tr>
    </div>
</table>

</body>
</html>

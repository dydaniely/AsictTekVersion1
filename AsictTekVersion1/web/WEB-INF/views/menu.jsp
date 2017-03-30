<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: Daniel
  Date: 1/28/2017
  Time: 11:24 AM
  To change this template use File | Settings | File Templates.
--%>

<%@ page contentType="text/html;charset=UTF-8" language="java" %>

<html>

<head>
    <meta http-equiv="Content-Type" content="text/html; charset=iso-8859-1" />
    <title>Acist information technology </title>
<link rel="stylesheet" href="/resources/js/jquery-ui-1.12.1/jquery-ui-1.12.1/jquery-ui.css"/>
    <script src="/resources/js/jquery-ui-1.12.1/jquery-ui-1.12.1/jquery-ui.js"/>
    <script src="/resources/js/jquery-ui-1.12.1/jquery-ui-1.12.1/jquery-ui.min.js"/>
    <link href="<c:url value="/resources/css/w3.css" />" rel="Stylesheet" type="text/css" />
    <link href="<c:url value="/resources/css/css.css"/>" rel="Stylesheet" type="text/css"/>
    <script>
        $(function () {
            $("#menu").menu)
          });
        </script>
    <style>
        .ui-menu{width:150px;}
    </style>
</head>

<body>


     <ul id="menu">
        <h4 class="w3-black"/>
       <li> <div> <a href="/Acist" class="w3-text-white w3-btn">Home</a> </div></li>

         <li> <div> <a href="#" class="w3-text-white w3-btn">About Us</a> </div></li>
         <li> <div><a href="#" class="w3-text-white w3-btn">News</a></div></li>
         <li> <div><a href="#" class="w3-text-white w3-btn">Contact Us</a></div></li>
         <li> <div><a href="/Acist/NewLinkPost/NewLinkPost" class="w3-text-white w3-btn">Link</a> </td> <b></b></div></li>
         <li> <div><a href="/Acist/NewQuotes/QuoteList" class="w3-text-white w3-btn">Quote</a></div></li>
         <li> <div><a href="/Acist/login" class="w3-text-white w3-btn">logout</a> </div></li>

     </ul>



</body>

</html>


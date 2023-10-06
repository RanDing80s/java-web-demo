<%--
  Created by IntelliJ IDEA.
  User: dingran
  Date: 2023/10/6
  Time: 13:45
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Foo Demo</title>
</head>
<body>
<%
   String lang = (String) request.getAttribute("lang");
%>
</body>
<div>
  <strong><%= lang %></strong>
</div>
</html>

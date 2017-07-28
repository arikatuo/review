<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/7/19
  Time: 8:40
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>

<body>

<% String name=request.getParameter("username");%>
name=<%=name%>
<% String buttonName=request.getParameter("submit");%>
按钮名字<%=buttonName%>
</body>


</html>

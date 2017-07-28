<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/7/18
  Time: 18:06
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%
<%String name= (String) request.getAttribute("username");%>
<%session.setAttribute("name",name); %>
<%String name2=request.getParameter("username");%>
<form action="test_2.jsp" method="post">
    <input type="submit" value="submut" >
</form>
s=${name}
s=${name2}
</body>
</html>

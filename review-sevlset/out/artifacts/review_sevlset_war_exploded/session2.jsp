<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/7/19
  Time: 8:50
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>
<%String name=request.getParameter("thename");%>
<%session.setAttribute("name",name);%>

<form action="session3.jsp" method="post">
    <input type="text" name="food">
    <input type="submit" value="Enter" name="submit">
</form>
</body>
</html>

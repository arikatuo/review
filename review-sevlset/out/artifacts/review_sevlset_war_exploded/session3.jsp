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
<%String food = request.getParameter("food");%>
<%String name = request.getParameter("thename");%>
<%String name2= (String) session.getAttribute("name");%>

<%=food%>
<%=name%>
<%=name2%>
</body>
</html>

<%--
  Created by IntelliJ IDEA.
  User: dell
  Date: 2017/8/11
  Time: 9:52
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<form action="bookServlet?method=getBooks">
    <input type="text" size="1" name="minPrice"/>
    <input type="text" size="1" name="maxPrice"/>
    <input type="submit" name="submit"/>
</form>

</body>
</html>

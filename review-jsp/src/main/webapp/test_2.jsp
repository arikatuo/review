<%@ page import="java.util.Enumeration" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<%--
  Created by IntelliJ IDEA.
  User: sumimasah
  Date: 2017/9/19
  Time: 11:08
  To change this template use File | Settings | File Templates.
--%>
<%@ page contentType="text/html;charset=UTF-8" language="java" %>
<html>
<head>
    <title>Title</title>
</head>
<body>

<% String str = (String) request.getAttribute("name") + "haha";%>
<% String head = (String) request.getHeader("name");%>


<c:out value=" ${param.name}"></c:out>
<%=str%>
<%=head%>
<c:out value=" ${pageScope.name}"></c:out>
<c:out value=" ${requestScope.name}"></c:out>
<c:out value=" ${sessionScope.name}"></c:out>


<%
    Enumeration enu = request.getHeaderNames();//取得全部头信息
    while (enu.hasMoreElements()) {//以此取出头信息
        String headerName = (String) enu.nextElement();
        String headerValue = request.getHeader(headerName);//取出头信息内容
%>
<h5><%=headerName%><font color="red">--></font>
    <font color="blue"><%=headerValue%>
    </font></h5>
<%
    }
%>
</body>
</html>

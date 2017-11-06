<!-- useBox.jsp文件 -->
<%@ page language="java" contentType="text/html; charset=gb2312" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>用EL使用JavaBean</title>
</head>
<body>
<%
  bean.Box box=new bean.Box();
  box.setLength(40);
  box.setWidth(20);
  box.setHeight(30);
  request.setAttribute("box", box);
%>
盒子的表面积为:${box.area }<br>
<c:set var="volum" value="volum" />
盒子的容积为:${box[volum] }<br>
盒子的容积为:${ }<br>
</body>
</html>

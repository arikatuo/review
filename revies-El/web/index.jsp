<!-- useBox.jsp�ļ� -->
<%@ page language="java" contentType="text/html; charset=gb2312" %>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>

<html>
<head>
  <title>��ELʹ��JavaBean</title>
</head>
<body>
<%
  bean.Box box=new bean.Box();
  box.setLength(40);
  box.setWidth(20);
  box.setHeight(30);
  request.setAttribute("box", box);
%>
���ӵı����Ϊ:${box.area }<br>
<c:set var="volum" value="volum" />
���ӵ��ݻ�Ϊ:${box[volum] }<br>
���ӵ��ݻ�Ϊ:${ }<br>
</body>
</html>

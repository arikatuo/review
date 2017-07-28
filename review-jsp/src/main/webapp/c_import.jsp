<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core"%>
<html>
<head>
    <title>c:import 标签实例</title>
</head>
<body>
<c:import var="data" url="http://www.runoob.com"/>
<c:out value="${data}"/>
</body>
</html>
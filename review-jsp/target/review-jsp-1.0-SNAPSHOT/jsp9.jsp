<%@page import="org.apache.jasper.servlet.JspServlet"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
         pageEncoding="UTF-8"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
    <meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
    <title>Insert title here</title>
</head>
<body>
这个是index5.jsp!

<%
    String className = config.getInitParameter("className");
    String url = config.getInitParameter("url");
    String user = config.getInitParameter("user");
    String pwd = config.getInitParameter("pwd");
%>


<%=className %> <br/>
<%=url %> <br/>
<%=user %> <br/>
<%=pwd %> <br/>
</body>
</html>
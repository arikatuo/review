<%@ page language="java"  pageEncoding="gb2312"%>
<jsp:useBean id="user" scope="page" class="com.hy.TestBean">
    <jsp:setProperty name="user" property="age" value="112"></jsp:setProperty>
</jsp:useBean>
<jsp:setProperty name="user" property="*"/>
����������,param���Բ���д,����param��Ӧ�����ύҳ��ı�name
<jsp:setProperty property="userName" name="user" param="userName"/>
<jsp:setProperty property="password" name="user" param="password"/>

<html>
<body>
ע��ɹ�:<br>
<hr>
ʹ��Bean�����Է���<br>
�û���: <%=user.getUserName()%><br>
����: <%=user.getPassword()%><br>
����: <%=user.getAge()%><br>
<hr>
ʹ��getProperty<br>
�û���:<jsp:getProperty name="user" property="userName"/><br>
����:  <jsp:getProperty name="user" property="password"/><br>
����:  <jsp:getProperty name="user" property="age"/>
�ͻ�������:<%=request.getRemoteAddr() %>
</body>
</html>
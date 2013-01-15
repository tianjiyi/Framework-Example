<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags" %>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>S2SHLogin</title>
</head>
<body>
	<h1>Welcome to S2SHLoginExample</h1>
	<s:form action="loginAction">
	<s:textfield name="user.name" label="Name" value="" /><br></br>
	<s:password  name="user.password" label="Password" value=""></s:password><br></br>
	<s:submit method="login" value="LogIn"/>
	<s:submit method="addUser" value="SignUp"/>
	</s:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
	pageEncoding="ISO-8859-1"%>
<%@ taglib prefix="s" uri="/struts-tags"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Basic Struts 2 Application - Welcome</title>
</head>
<body>
	<h1>Welcome To Ampd</h1>
	
	<s:form action="loginUser">
	<s:label>User</s:label><s:textfield name="userName"></s:textfield>
	<s:label>Password</s:label><s:password name="password"></s:password>
	
   <s:submit value="Submit" />
	</s:form>
	
</body>
</html>
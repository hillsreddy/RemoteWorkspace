<%-- <%@ taglib uri="/struts-tags" prefix="s"%> --%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html PUBLIC "-//W3C//DTD HTML 4.01 Transitional//EN" "http://www.w3.org/TR/html4/loose.dtd">
<html>
<head>
<link rel="stylesheet" type="text/css" href="css/style.css">
<script src="js/login.js"></script>
<meta http-equiv="Content-Type" content="text/html; charset=ISO-8859-1">
<title>Registration</title>
</head>
<body>
<!-- <s:form name="registrationForm">
	<s:textfield name="email" value="" maxlzength="20" onfocus="defaultText();"></s:textfield>
	<s:password name="password" value="" maxlength="8" onfocus="defaultText();"></s:password>
	<s:select name="gender" list="{M:Male,F:Female}"></s:select>
	<s:checkbox name="study" value="MCA"></s:checkbox>
	<s:submit onclick="submitForm();"></s:submit>
</s:form> -->
<form action="/GetRecords/Login" id="loginForm">
<input type="text" name="email"/></br>
<input type="text" name="pwd"/></br>
<div class="loginButton" style="cursor: pointer;" onclick="submit();">Login</div>
</form>
<jsp:include page="/WEB-INF/pages/navigation.jsp"></jsp:include>
</body>
</html>

<%@ page language="java" contentType="text/html; charset=UTF-8" pageEncoding="UTF-8"%>
<%@ taglib prefix="spring" uri="http://www.springframework.org/tags" %>
<!DOCTYPE html>
<html>
<head>
<meta http-equiv="Content-Type" content="text/html; charset=UTF-8">
<title>Welcome</title>
</head>
<body>
	<spring:message code="view.message" var="viewMessage" />
	${viewMessage} ${message}
	<br />
	<spring:url value="?lang=en" var="urlEnglish" />
	<spring:url value="?lang=bs" var="urlBosnian" />
	<a href="${urlEnglish}">EN</a>
	<a href="${urlBosnian}">BS</a>
</body>
</html>
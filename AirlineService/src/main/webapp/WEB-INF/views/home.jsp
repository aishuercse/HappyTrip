<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<%@taglib uri="http://www.springframework.org/tags/form" prefix="form"%>
<!DOCTYPE html>
<html xmlns:th="https://www.thymeleaf.org">
<head>
<meta charset="ISO-8859-1">
<title>Airline service</title>
</head>
<body>
<h1>Welcome to Airline Service Portal</h1>
<form:form action="/login" modelAttribute="login" method="post">
    	<p>Id: <form:input type="text" path="userId" /></p>
        <p>Password: <form:input type="password" path="password" /></p>
        <p><input type="submit" value="Submit" /> <input type="reset" value="Reset" /></p>
    </form:form>
</body>
</html>
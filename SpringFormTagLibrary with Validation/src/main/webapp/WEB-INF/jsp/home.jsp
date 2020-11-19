<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
    <%@taglib prefix="form" uri="http://www.springframework.org/tags/form" %>
  
<!DOCTYPE html>
<html>
<head>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style type="text/css">
.error{
color: red;
}

</style>
</head>
<body>
<h1>Login page!</h1>
<form:form action="login" method="post"  modelAttribute="bean">
User name :</br>
<form:input  path="username"/><form:errors path="username" cssClass="error"></form:errors></br>
<form:input  path="password"/><form:errors path="password" cssClass="error"></form:errors></br>
Gender :</br>
<form:radiobutton path="gender" value="male"/>male<form:errors path="gender" cssClass="error"></form:errors>
<form:radiobutton path="gender" value="female"/>female<br>
Cards :</br>
<form:checkbox path="cards" value="Credit cart"/>Credit-Card</br>
<form:checkbox path="cards" value="Master cart"/>Master-Card</br>
<form:checkbox path="cards" value="Visa cart"/>Credit Card</br>
<form:errors path="cards" cssClass="error"></form:errors></br>

<form:select path="city">
<form:option value="new Delhi"></form:option>
<form:option value="mumbai"></form:option>
<form:option value="puna"></form:option>
<form:option value="patna"></form:option>
<form:option value="hydrabad"></form:option>
</form:select>

<input type="submit" value="Login!">
</form:form>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:forTokens items="hello-my-world" delims="-" var ="del">
<c:out value="${del}"></c:out>
</c:forTokens>

<c:url value="/login.html" var="loginPage">
<c:param name="userName" value="Admin"></c:param>
</c:url>

<a href="${loginPage}">click here</a>
</body>
</html>
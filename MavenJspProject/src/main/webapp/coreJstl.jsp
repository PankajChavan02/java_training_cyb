<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<c:if test="${15>=10}" var="ref" scope="request">
</c:if>

<c:out value="Ref : " ${requestScope.ref}"></c:out>
<c:out value="Hello world"></c:out>


<br>
<br>
<c:forEach var="i" begin="1" end="10">
Value : <c:out value='${i}' ></c:out>
</c:forEach>
<br>
<br>

<c:forEach var="i" items="1,2,3,4,5,6">
<h1>${i}</h1>
</c:forEach>

<% String name ="Narendra Modi"; %>
<c:out value="${name}" escapeXml="flase"></c:out>

<c:import url="login.html" ></c:import>

<%-- <c:redirect url="login.html"></c:redirect> --%>  
</body>
</html>
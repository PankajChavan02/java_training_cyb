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
<form action="${pageContext.request.contextPath}/actionToSinglePage.jsp">
<input type="checkbox" name="choice" value="c">c
<input type="checkbox" name="choice" value="c++">c++
<input type="checkbox" name="choice" value="java">java
<input type="checkbox" name="choice" value="python">python
<input type="submit" value="Choose">
</form>


<c:forEach items="${paramValues.choice}" var="lang">
<c:out value="${lang}"></c:out>
</c:forEach>


</body>
</html>
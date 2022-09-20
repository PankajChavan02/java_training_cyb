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
<c:set var="amount" value="10000" scope="page"></c:set>
<c:out value="${pageScope.amount}"/>
<c:choose>
<c:when  test="${pageScope.amount}>=5000"><c:out value="You are rich"></c:out></c:when>
<c:when test="${pageScope.amount}>3000"><c:out value="You are middle class"></c:out></c:when>
<c:otherwise><c:out value="You are below poorverty line"></c:out></c:otherwise>
</c:choose>

</body>
</html>
<%@page import="com.cybage.bean.User"%>
<%@page import="java.util.List"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<h1>Welcome to employee site</h1>



<table>
<tr>
<th>
Name
</th>
<th>
Address
</th>
<th>
Email
</th>
</tr>


<c:forEach var ="employee" items="${requestScope.employeeList}" begin="0" end="10">
<tr>
<td>
<c:out value="${employee.name} "></c:out>

</td>
<td>
<c:out value="${employee.address} "></c:out>

</td>
<td>
<c:out value="${employee.email}"></c:out>

</td>
</tr>
</c:forEach>

</table>
</body>
</html>
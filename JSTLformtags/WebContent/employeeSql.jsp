<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="sql" uri="http://java.sun.com/jsp/jstl/sql" %>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<br>
<form action="${pageContext.request.contextPath}/employeeSql.jsp" method="POST">
<br>
Id: <input type="number" name="id"><br>
Name: <input type="text" name="name"><br>
designation: <input type="text" name="designation"><br>
Joining date : <input type="text" name="dob"><br>
<input type="submit" values="Submit"><br><br>
</form>






<sql:setDataSource var="dataSource" driver="com.mysql.jdbc.Driver"
url="jdbc:mysql://localhost:3306/newdatabase"
user="root"
password="mymanager"
/>



<c:choose>
<c:when test="${not empty param.id &&  not empty param.name && not empty param.designation && not empty param.dob}">

<sql:update var="employee" dataSource="${dataSource}">
insert into employee values (?,?,?,?)
<sql:param value="${param.id}"></sql:param>
<sql:param value="${param.name}"></sql:param>
<sql:param value="${param.designation}"></sql:param>
<sql:param value="${param.dob}"></sql:param>
</sql:update>
</c:when>
</c:choose>



<sql:query var="employees" dataSource="${dataSource}">
select * from employee;
</sql:query>


<table border="1">
<tr>
<th>Id</th>
<th>Name</th>
<th>Designation</th>
<th>Date of Joining</th>
</tr>


<c:forEach var="employee" items="${employees.rows}">
<tr>
<td><c:out value="${employee.employee_id}"></c:out></td>
<td><c:out value="${employee.name}"></c:out></td>
<td><c:out value="${employee.designation}"></c:out></td>
<td><c:out value="${employee.dob}"></c:out></td>
</tr>

</c:forEach>
</table>

</body>
</html>
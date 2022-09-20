<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
Name : <input type="text" name="username" >
<% String name =  request.getParameter("username"); 
request.setAttribute("name", name);
%>
<%out.println(request.getAttribute("name")); %>
</body>
</html>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
     <%@page errorPage="errorPage1.jsp" %>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% int number1 = Integer.valueOf(request.getParameter("number1"));
int number2 = Integer.valueOf(request.getParameter("number2"));
int result = number1/number2;
%>
<%="result "+result %>

</body>
</html>
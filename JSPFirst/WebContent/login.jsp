<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<% String name = request.getParameter("userName");
   String password = request.getParameter("pwd");
   
   if (name.equals("admin") && password.equals("1234")){
	   session.setAttribute("userName", name);
	   %>
	   <jsp:forward page="welcome.jsp">
	    <jsp:param value="Good afternoon" name="greeting"/>
	   </jsp:forward>
	   <%	  
   }else {
	   %>
	   <% out.println("Incorrect credentials please try again"); %>
	   <jsp:include page="login.html">
	   <jsp:param value="Good afternoon" name="greeting"/>
	   </jsp:include>
	   <!--<%@include file="login.html"  %>  --> 	
	   <%    
   }
   
%>

</body>
</html>
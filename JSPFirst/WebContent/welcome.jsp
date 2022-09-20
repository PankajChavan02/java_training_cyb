<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>

<% String greeting = request.getParameter("greeting");
 out.println(greeting);
%>

<% Integer hitCount = (Integer)application.getAttribute("count");
   if(  (hitCount == null) || hitCount == 0){
	   %>
	   <%="Welcome "+session.getAttribute("userName")%>
	   <%session.invalidate(); %>
	   <% 
	   hitCount=1;
	   out.println("Visit Count : "+hitCount);
	   
   }else{
	   %>
	   <%="Welcome "+session.getAttribute("userName")%>
	   <%session.invalidate(); %>
	   <%hitCount = hitCount + 1;
	   out.println("Visit Count : "+hitCount);
   }
   
   application.setAttribute("count", hitCount);
%>


<br>
<a href="login.html">logout</a>

</body>
</html>
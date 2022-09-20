<%@page import="org.w3c.dom.Document"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
    <%@ taglib prefix="c" uri="http://java.sun.com/jsp/jstl/core" %>
<!DOCTYPE html>
<html>
<head>
    <meta charset='utf-8'>
    <meta http-equiv='X-UA-Compatible' content='IE=edge'>
    <title>Page Title</title>
    <meta name='viewport' content='width=device-width, initial-scale=1'>
    <link href="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-EVSTQN3/azprG1Anm3QDgpJLIm9Nao0Yz1ztcQTwFspd3yD65VohhpuuCOmLASjC" crossorigin="anonymous">
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.bundle.min.js" integrity="sha384-MrcW6ZMFYlzcLA8Nl+NtUVF0sA7MsXsP1UyJoMp4YLEuNSfAP+JcXn/tWtIaxVXM" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/@popperjs/core@2.9.2/dist/umd/popper.min.js" integrity="sha384-IQsoLXl5PILFhosVNubq5LC7Qb9DXgDA9i+tQ8Zj3iwWAwPtgFTxbJ8NT4GN1R8p" crossorigin="anonymous"></script>
    <script src="https://cdn.jsdelivr.net/npm/bootstrap@5.0.2/dist/js/bootstrap.min.js" integrity="sha384-cVKIPhGWiC2Al4u+LWgxfKTRIcfu0JTxR+EQDz/bgldoEyl4H0zUF0QKbrJ0EcQF" crossorigin="anonymous"></script>
    <script src="https://code.jquery.com/jquery-3.6.0.js" integrity="sha256-H+K7U5CnXl1h5ywQfKtSj8PCmoN9aaq30gDh27Xc0jk=" crossorigin="anonymous"></script>
</head>
<body>

    <div class="container">
        <div class="row text-center">
            <h1>Product Table</h1>
            <div class="col-md-12 justify-content-center mt-5">
            <% String productNameVar = null; %> 
            
            <form action="${pageContext.request.contextPath}/SearchProduct" method="POST">
                <input type="text" name="productName" placeholder="enter name " onchange="${product}">
                <button class="btn btn-primary" type="submit" >Search</button>
                </form>
                <br><br>
                               
            
            <table class="table table-striped">
                <thead>
                    <th>Product Id</th>
                    <th>Product name</th>
                    <th>Price</th>
                    <th>Category</th>
                </thead>
                <c:forEach var="product" items="${productList}">
                 <tr>
                    <td><c:out value="${product.id}"></c:out></td>
                    <td><c:out value="${product.name}"></c:out></td>
                    <td><c:out value="${product.price}"></c:out></td>
                    <td><c:out value="${product.category}"></c:out></td>
                </tr>
             
                </c:forEach>
               

            </table>
              <button class="btn btn-primary" ><a style="color: white;" href="${pageContext.request.contextPath}/login.jsp">Logout</a></button>
  
        </div>
        </div>
    </div>
    
    
    
   
    
</body>
</html>>
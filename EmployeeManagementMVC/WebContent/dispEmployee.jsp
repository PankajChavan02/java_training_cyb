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
            <h1>Employee Table</h1>
            <div class="col-md-12 justify-content-center mt-5">
            
            <table class="table table-striped">
                <thead>
                    <th>Employee Id</th>
                    <th>Employee name</th>
                    <th>Date of Joining</th>
                    <th>Salary</th>
                    <th>Edit</th>
                    <th>Delete</th>
                </thead>
                               
                <c:forEach var="employee" items="${listEmployee}">
                <tr>
                <td><c:out value="${employee.employeeId}"/></td>
                <td><c:out value="${employee.employeeName}"/></td>
                <td><c:out value="${employee.dateOfJoining}"/></td>
                <td><c:out value="${employee.salary}"/></td>
                <td></td>
                <td><button class="btn btn-danger btn-sm" name="delete" value="${employee.employeeId}" onclick="click(e)">Delete</button></td>
                </tr>
                </c:forEach>
                         
                
                
               

            </table>
        </div>
        </div>
    </div>
   
   
    
</body>
</html>
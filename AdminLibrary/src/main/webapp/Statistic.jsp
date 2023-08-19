<%@page import="DtoPackage.dtoStatistic"%>
<%@page import="java.util.ArrayList"%>
<%@ page language="java" contentType="text/html; charset=ISO-8859-1"
    pageEncoding="ISO-8859-1"%>
<!DOCTYPE html>
<html>
<head>
<link href="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/css/bootstrap.min.css" rel="stylesheet" integrity="sha384-9ndCyUaIbzAi2FUVXJi0CjmCapSmO7SnpJef0486qhLnuZ2cdeRhO02iuK6FUUVM" crossorigin="anonymous">
<script src="https://cdn.jsdelivr.net/npm/bootstrap@5.3.0/dist/js/bootstrap.bundle.min.js" integrity="sha384-geWF76RCwLtnZ8qwWowPQNguL3RmwHVBC9FhGdlKrxdiJJigb/j/68SIy3Te4Bkz" crossorigin="anonymous"></script>
<meta charset="ISO-8859-1">
<title>Insert title here</title>
<style >
body{
background-image: url("https://cdn.pixabay.com/photo/2019/09/16/12/45/book-4480899_1280.jpg");
background-attachment:fixed;

}
h1{
background-color: white;
}
*{
padding: 0px;
margin: 0}
table{
margin-top: -10px;}
</style>
</head>
<body>
<%
		ArrayList<dtoStatistic> d1=(ArrayList)request.getAttribute("s1");
		ArrayList<dtoStatistic> d2=(ArrayList)request.getAttribute("s2");
%>
<h1 style="text-align: center">Issue Book</h1>
<table class="table">

<thead>
<tr>
<th scope="col">Student Id</th>
<th scope="col">Student Name</th>
<th scope="col">Book Id</th>
<th scope="col">Book Name</th>
<th scope="col">Issue Date</th>
<th scope="col">Due Date</th>
</tr>
</thead>
<tbody>
<% for(dtoStatistic d:d1){ %>

<tr>
<td><%=d.getsId() %></td>
<td><%=d.getsName() %></td>
<td><%=d.getbId() %></td>
<td><%=d.getbName() %></td>
<td><%=d.getIssueDate() %></td>
<td><%=d.getDueDate() %></td>
</tr>
<%} %>
</tbody>
</table>
<br><br>
<hr>
<br><br>
<h1 style="text-align: center">Return Book</h1>
<table class="table">
<thead>
<tr>
<th>Student Id</th>
<th>Student Name</th>
<th scope="col">Book Id</th>
<th scope="col">Book Name</th>
<th scope="col">Issue Date</th>
<th scope="col">Due Date</th>
</tr>
</thead>
<tbody>
<% for(dtoStatistic d:d2){ %>

<tr>
<td><%=d.getsId() %></td>
<td><%=d.getsName() %></td>
<td><%=d.getbId() %></td>
<td><%=d.getbName() %></td>
<td><%=d.getIssueDate() %></td>
<td><%=d.getDueDate() %></td>
</tr>
<%} %>
</tbody>
</table>
</body>
</html>
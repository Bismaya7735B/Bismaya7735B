<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
<style type="text/css">
body{
margin-top:15%;
margin-left:28%;
background-color:lime;
align-content: center;
}
p{
margin-left:14%;
}
table{
border-color:orange;
border-style:solid;
border-radius: 5px;
}
</style>
</head>
<body>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
PreparedStatement pst=con.prepareStatement("select * from studentmgmt ");
ResultSet rst=pst.executeQuery();
%>
<table border="2" >
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Age</th>
<th>Password</th>
<th>Mobile</th>
<th>Action1</th>
<th>Action2</th>
</tr>
<%
while(rst.next()){
	int id=rst.getInt("id");
	String name=rst.getString("name");
	String email=rst.getString("email");
	int age=rst.getInt("age");
	String password=rst.getString("password");
	long mobile=rst.getLong("mobile");

%>
<tr>
<td><%=id %></td>
<td><%=name %></td>
<td><%=email %></td>
<td><%=age %></td>
<td><%=password %></td>
<td><%=mobile %></td>
<td><a href="edit.jsp?id=<%=id %>">edit</a></td>
<td><a href="delete.jsp?id=<%=id %>">delete</a></td>
</tr>
<%} %>
</table>
<p>Togo to Homepage<a href="home.html">click here</a></p>
</body>
</html>
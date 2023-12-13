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
<style >
.t{
		color:purple;
		margin-left:25%;
		margin-right:auto;
		widith:50%;
		padding:30px;
		font-size: larger;
		font-family: cursive;
		text-align: center;
		display: table;
	}
</style>
</head>
<body>
<%
String name1=request.getParameter("name");
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
PreparedStatement pst=con.prepareStatement("select * from studentmgmt where name = ?");
pst.setString(1, name1);
ResultSet rst=pst.executeQuery();
%>
<%! int id,age; String name,email,password; long mobile; %>

<%
if(rst.next()){
	 id=rst.getInt("id");
  name=rst.getString("name");
	 email=rst.getString("email");
	 age=rst.getInt("age");
	 password=rst.getString("password");
	 mobile=rst.getLong("mobile");

%>
<div class="t">
<table border="2" >
<tr>
<th>Id</th>
<th>Name</th>
<th>Email</th>
<th>Age</th>
<th>Password</th>
<th>Mobile</th>
</tr>
<tr>
<td><%=id %></td>
<td><%=name %></td>
<td><%=email %></td>
<td><%=age %></td>
<td><%=password %></td>
<td><%=mobile %></td>
</tr>
</table>
</div>
<%} 
else{
	out.print("<h2>"+"data not found"+"</h2>");
}
%>

<p style="color: orange;">Togo to Homepage <a href="home.html" style="color: red;text-decoration: none">click here</a></p>
<jsp:include page="search.html"/>
</body>
</html>
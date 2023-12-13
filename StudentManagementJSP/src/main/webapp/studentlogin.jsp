<%@page import="java.sql.ResultSet"%>
<%@page import="java.sql.PreparedStatement"%>
<%@page import="java.sql.Connection"%>
<%@page import="java.sql.DriverManager"%>
<%@page import="java.sql.Connection"%>
<%@ page language="java" contentType="text/html; charset=UTF-8"
    pageEncoding="UTF-8"%>
<!DOCTYPE html>
<html>
<head>
<meta charset="UTF-8">
<title>Insert title here</title>
</head>
<body>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
PreparedStatement pst=con.prepareStatement("select * from studentmgmt where email=?");
pst.setString(1, request.getParameter("email"));
ResultSet rst=pst.executeQuery();
if(rst.next()){
	if(request.getParameter("password").equals(rst.getString("password"))){
	%>	
	<jsp:forward page="home.html"/>
	<%
	}
	else{
		%>
		<h1>Invalid Password</h1>
			<jsp:include page="login.html"/>
			<% 
	}
}
else{
	%>
	<h1>Invalid Email</h1>
		<jsp:include page="login.html"/>
		<% 

}
%>
</body>
</html>
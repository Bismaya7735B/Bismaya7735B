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
</head>
<body>
<%
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
PreparedStatement pst=con.prepareStatement("insert into studentmgmt (name,email,age,password,mobile) values(?,?,?,?,?)");
pst.setString(1, request.getParameter("name"));
pst.setString(2, request.getParameter("email"));
pst.setInt(3, Integer.parseInt(request.getParameter("age")));
pst.setString(4, request.getParameter("password"));
pst.setLong(5, Long.parseLong(request.getParameter("mobile")));
pst.executeUpdate();
%>
<h1><%= "Registration Successfull"%></h1>
<jsp:include page="login.html"/>
</body>
</html>
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
int id1=Integer.parseInt(request.getParameter("id"));
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
PreparedStatement pst=con.prepareStatement("delete from studentmgmt where id=?");

pst.setInt(1, Integer.parseInt(request.getParameter("id")));
pst.executeUpdate();

%>
<jsp:forward page="display.jsp"></jsp:forward>
</body>
</html>
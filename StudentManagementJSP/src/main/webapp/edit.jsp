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
font-size:large;
font-family:cursive;
text-align: center;
background-color: fuchsia;
}
</style>
</head>
<body>
<%
int id1=Integer.parseInt(request.getParameter("id"));
Class.forName("com.mysql.cj.jdbc.Driver");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
PreparedStatement pst=con.prepareStatement("select * from studentmgmt where id=? ");
pst.setInt(1, id1);
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
}
%>
<form action="update.jsp">
<input type="hidden" name="id" value="<%=id%>">
Name: <input type="text" name="name" value="<%=name%>"><br><br>
Email: <input type="text" name="email" value="<%=email%>"><br><br>
Age: <input type="text" name="age"value="<%=age%>"><br><br>
Password: <input type="password" name="password"value="<%=password%>"><br><br>
Mobile: <input type="text" name="mobile"value="<%=mobile%>"><br><br>
<input type="submit" value="update">
</form>
</body>
</html>
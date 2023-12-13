package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

import com.mysql.cj.protocol.Resultset;

public class FetchDemoEmp {
Scanner sc=new Scanner(System.in);
Connection con;
PreparedStatement pst;
ResultSet rs;
boolean flag=true;
FetchDemoEmp(){
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void insertData() {
	try {
		do {
		pst=con.prepareStatement("insert into emp1 values(?,?,?,?)");
		System.out.println("Enter eid,ename,email,password");
		int eid=sc.nextInt();
		String ename=sc.next();
		String email=sc.next();
		String password=sc.next();
		pst.setInt(1, eid);
		pst.setString(2, ename);
		pst.setString(3, email);
		pst.setString(4, password);
		pst.execute();
		System.out.print("Enter 1 to insert more data:");
		int exit=sc.nextInt();
		if(exit!=1) {
			flag=false;
		}
		}
		while(flag);
		System.out.println("All data inserted successfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void verifyMailPassword() {
	System.out.print("Enter email:");
	String email=sc.next();
	System.out.print("Enter password:");
    String password=sc.next();
    try {
		pst=con.prepareStatement("select * from emp1 where email=(?)");
		pst.setString(1, email);
		rs=pst.executeQuery();
		if(rs.next()) {
			if(password.equals(rs.getString("password"))) {
				System.out.println("Welcome to JDBC Homepage");
			}
			else
				System.out.println("Invalid password");
		}
		else 
			System.out.println("Invalid username");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void deleteData() {
	System.out.print("Enter eid:");
	int eid=sc.nextInt();
	try {
		con.prepareStatement("delete from emp1 where eid=(?)");
		pst.setInt(1, eid);
		pst.executeUpdate();
		System.out.println("Data deleted successfully");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

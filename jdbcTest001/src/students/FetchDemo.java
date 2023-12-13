package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class FetchDemo {
	Scanner sc=new Scanner(System.in);
Connection con;
PreparedStatement pst;
ResultSet rs;
boolean flag=true;
FetchDemo(){
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void insert() {
	try {
		pst=con.prepareStatement("insert into user values(?,?,?,?)");
		System.out.println("Enter id,name,email,password");
		
		 
		do {
		int id=sc.nextInt();
		String name=sc.next();
		String email=sc.next();
		String password=sc.next();
		pst.setInt(1, id);
		pst.setString(2, name);
		pst.setString(3, email);
		pst.setString(4, password);
		pst.execute();
		System.out.print("Enter 1 to insert more data or any integer to exit:");
		int exit=sc.nextInt();
		if(exit!=1) {
			flag=false;
		}
		}
		while(flag);
		System.out.println("All data inserted successfully");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void verifyData() {
	
	try {
		do {
		System.out.print("Enter email:");
		String email=sc.next();
		System.out.print("Enter password:");
		String password=sc.next();
		
		
	pst=con.prepareStatement("select * from user where email=(?)");
		pst.setString(1, email);
		rs=pst.executeQuery();
		if(rs.next()) {
			if(password.equals(rs.getString("password")))
			{
				System.out.println("Welcome to JDBC Homepage");
			}
			else
				System.out.println("Invalid password");
		}
		else
			System.out.println("Invalid username");
		System.out.print("Enter 1 to verify again or any integer to exit:");
		int exit=sc.nextInt();
		if(exit!=1) {
			flag=false;
		}
		}
		while(flag);
	System.out.println(".....Thank U.........");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void delete() {
	
	try {
		do {
			fetching();	
			System.out.println("Enter id:");
			int id=sc.nextInt();	
		pst=con.prepareStatement("delete from user where id=(?)");
		pst.setInt(1, id);
		pst.executeUpdate();
		System.out.print("Enter 1 to delete more data or any integer to exit:");
		int exit=sc.nextInt();
		if(exit!=1) {
			flag=false;
		}
		}
		while(flag);
		System.out.println("Data deleted successfully");
		System.out.println(".....Thank U.........");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void updateData() {
	
	try {
		do {
			fetching();
			System.out.print("Enter id:");
			int id=sc.nextInt();
			System.out.print("Please choose 1 for Updating name,any other integer for updating email:");
			int choose=sc.nextInt();
			if(choose==1) {
		pst=con.prepareStatement("update user set name=(?) where id=(?)");
		System.out.print("Enter name:");
		String name=sc.next();
		pst.setString(1, name);
		pst.setInt(2, id);
			}
			else {
				pst=con.prepareStatement("update user set email=(?) where id=(?)");
				System.out.print("Enter email:");
				String email=sc.next();
				pst.setString(1, email);
				pst.setInt(2, id);
			}
		pst.executeUpdate();
		System.out.print("Enter 1 to update more records or any integer to exit:");
		int exit=sc.nextInt();
		if(exit!=1) {
			flag=false;
		}
		}
		while(flag);
		System.out.println("Data updated successfully");
		System.out.println(".....Thank U.........");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void fetching() {
	try {
		pst=con.prepareStatement("select * from user");
		boolean execute=pst.execute();
		if(execute) {
			rs=pst.getResultSet();
			System.out.println("Id\tName\t\tEmail");
			System.out.println("........................................");
			while(rs.next()) {
				
				System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+"\t"+rs.getString(3));
			}
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void closeConnection() {
	try {
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

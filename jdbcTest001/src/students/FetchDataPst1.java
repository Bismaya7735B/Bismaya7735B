package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class FetchDataPst1 {
	static Scanner c=new Scanner(System.in);
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
		PreparedStatement pst=con.prepareStatement("select * from person where age>(?)");
		boolean flag=true;
		do {
		System.out.println("Enter age:");
		int age=c.nextInt();
		pst.setInt(1,age);
		ResultSet rs=pst.executeQuery();
		System.out.println("Id\tName\tEmail     \tGender\tAge");
		System.out.println(".............................................");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
		}
		System.out.println();
		System.out.print("Enter 1 to select more data:");
		int exit=c.nextInt();
		if(exit!=1) {
			flag=false;
		}
		}
		while(flag);
		con.close();
		System.out.println("All data selected");
		System.out.println("...........Thank You...........");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

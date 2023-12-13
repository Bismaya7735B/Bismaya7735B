package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
//performing update operation on database using preparedstatement...
public class Pst4 {
	static Scanner s=new Scanner(System.in);
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
		PreparedStatement pst=con.prepareStatement("update student set name=(?) where roll =(?)");
		boolean flag=true;
		do {
		
		System.out.println("Enter name:");
		String name=s.next();
		System.out.println("Enter roll:");
		int roll=s.nextInt();
		pst.setInt(2, roll);
		pst.setString(1, name);
		pst.executeUpdate();
		System.out.println("Enter 1 to update more data");
		int exit=s.nextInt();
		if(exit!=1) {
			flag=false;
		}
		}
		while(flag);
		con.close();
		System.out.println("All data updated");
		System.out.println(".......Thank You.......");
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

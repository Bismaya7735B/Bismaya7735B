package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class Pst {
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
			
			PreparedStatement pst=con.prepareStatement("insert into person values(?,?,?,?,?)");
			System.out.println("Enter id,name,email,gender,age");
			int id=s.nextInt();
			String name=s.next();
			String email=s.next();
			String gender=s.next();
			int age=s.nextInt();
			pst.setInt(1,id);
			pst.setString(2,name);
			pst.setString(3, email);
			pst.setString(4, gender);
			pst.setInt(5, age);
			
			boolean execute=pst.execute();
			System.out.println(execute);
			
			con.close();
			System.out.println("all data saved");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

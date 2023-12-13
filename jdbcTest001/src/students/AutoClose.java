package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

public class AutoClose {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try(Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
				Scanner sc=new Scanner(System.in);
				PreparedStatement pst=con.prepareStatement("select * from user");
				ResultSet rs=pst.executeQuery()) 
				{
			while(rs.next()) {
				System.out.println(rs.getInt(1));
			}
				}
		catch(Exception e) {
			e.printStackTrace();
		}
	}

}

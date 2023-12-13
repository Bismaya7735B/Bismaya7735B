package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;
//perform delete operation using preparedstatement
public class pst3 {
	static Scanner s= new Scanner(System.in);
	public static void main(String[] args) {
		
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
			
			PreparedStatement pst=con.prepareStatement("delete from person where id=(?)");
			boolean flag=true;
			do {
			System.out.println("Enter id");
			int id=s.nextInt();
			pst.setInt(1,id);
			
			int execute=pst.executeUpdate();
			
			
			
			
			System.out.println("Press 1 to enter delete more data");
			int exit=s.nextInt();
			if(exit !=1)
			{
				flag=false;
			}
			System.out.println("number of rows affected are:"+execute);
			}
			while(flag);
			con.close();
			System.out.println("all data deleted");
			System.out.println(".......Thank You.......");
		} catch (Exception e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
}

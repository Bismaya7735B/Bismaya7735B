package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class PreparedStatement2 {
	public static void main(String[] args) {
		//Scanner s= new Scanner(System.in);
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
			PreparedStatement pst=con.prepareStatement("insert into student values(?,?,?,?,?)");
			pst.setInt(1,7);
			pst.setString(2,"Adi");
			pst.setString(3, "adi@gmail.com");
			pst.setString(4, "male");
			pst.setInt(5, 22);
			
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

package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class BatchPst {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pst = null;
		ResultSet rst = null;

		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			con = DriverManager.getConnection("jdbc:mysql://localhost:3306/myfirst", "root", "root");
			pst = con.prepareStatement("insert into user values(?,?,?,?)");
			Scanner os = new Scanner(System.in);

			while (true) {
				System.out.println("enter id, name,email,password");
				int id = os.nextInt();
				String name = os.next();
				String email = os.next();
				String password = os.next();

				pst.setInt(1, id);
				pst.setString(2, name);
				pst.setString(3, email);
				pst.setString(4, password);

				pst.addBatch();
				System.out.println("data is inserted");
				System.out.println("press 1 to insert data again");
				int exit = os.nextInt();
				if(exit != 1)
					break;
			}
			pst.executeBatch();
			

		} catch (ClassNotFoundException | SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}finally {

			try {
				if(rst != null)
				rst.close();
				if(pst != null)
				pst.close();
				if(con != null)
				con.close();
			} catch (SQLException e) {
				e.printStackTrace();
			}
		}

	}
}

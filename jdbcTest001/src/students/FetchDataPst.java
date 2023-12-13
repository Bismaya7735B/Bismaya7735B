package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
//slecting data from table using preparedstatement
import com.mysql.cj.protocol.Resultset;

public class FetchDataPst {
public static void main(String[] args) {
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
		PreparedStatement pst=con.prepareStatement("select * from person");
		ResultSet rs=pst.executeQuery();
		System.out.println("Id\tName\tEmail      \tGender\tAge");
		System.out.println("...........................................");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+rs.getString(4)+"\t"+rs.getInt(5));
		}
		con.close();
	} catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

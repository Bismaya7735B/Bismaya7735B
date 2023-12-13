package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

import com.mysql.cj.protocol.Resultset;

public class FetchStudentDetails {

	public static void main(String[] args) throws Exception {
String sql="SELECT * from STUDENT ";
//step-1
Class.forName("com.mysql.cj.jdbc.Driver");
//step-2
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
//step-3
Statement st=con.createStatement();
//step-4
ResultSet rs=st.executeQuery(sql);
//to move the cursor to the next line
rs.next();
//to fetch the data from individual column or row
System.out.println("roll");
System.out.println(rs.getInt(1));
System.out.println(rs.getInt("roll"));

System.out.println("name");
System.out.println(rs.getString(2));
System.out.println(rs.getString("name"));

System.out.println("email");
System.out.println(rs.getString(3));
System.out.println(rs.getString("email"));

System.out.println("gender");
System.out.println(rs.getString(4));
System.out.println(rs.getString("gender"));


//step-5
con.close();
	}

}

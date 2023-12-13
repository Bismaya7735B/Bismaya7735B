package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.Statement;

public class FetchAllStudentData {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
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
		System.out.println("Roll\tName\t\tEmail   \t\tAge\t\tPassword");
		System.out.println("...................................................................");
		while(rs.next()) {
			/*System.out.println("roll: "+ rs.getInt(1));
			System.out.println("name: "+ rs.getString(2));
			System.out.println("email: "+ rs.getString(3));
			System.out.println("gender: "+ rs.getString(4));
			System.out.println("age: "+ rs.getInt(5));
			System.out.println("............................................");*/
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+"\t"+rs.getString(3)+"\t"+"\t"+rs.getString(4)+"\t"+"\t"+rs.getString(5));
		}

		//step-5
		con.close();
	}

}

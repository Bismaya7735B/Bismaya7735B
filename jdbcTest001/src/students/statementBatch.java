package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Arrays;

public class statementBatch {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con=null;
Statement st=null;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
	st=con.createStatement();
	st.addBatch("insert into user values(6,'uy','kj@gmail.com','kj123')");
	st.addBatch("update user set name='dc' where id=3");
	st.addBatch("update user set email='dc@gmail.com' where name='dc'");
	st.addBatch("delete from user where name='uy'");
	int arr[]=st.executeBatch();
	System.out.println(Arrays.toString(arr));
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
finally {
try {
		if(st!=null)
			st.close();
		if(con!=null)
			con.close();
			} catch (SQLException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		
}
	}

}

package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
public class studentsavedeatasils {

	public static void main(String[] args)throws Exception {
		// TODO Auto-generated method stub
String sql="INSERT INTO STUDENT VALUES(5,'bismaya','bismaya3@gmail.com','male',22)";
Class.forName("com.mysql.cj.jdbc.Driver");
//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb", "root", "Bismaya7735@");
Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
Statement st=con.createStatement();
st.execute(sql);
con.close();
System.out.println("all data saved");
	}

}

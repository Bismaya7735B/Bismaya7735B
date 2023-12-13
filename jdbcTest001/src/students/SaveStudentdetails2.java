package students;

import java.io.FileInputStream;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Properties;

public class SaveStudentdetails2 {

	public static void main(String[] args) throws Exception{
		// TODO Auto-generated method stub
		String sql="INSERT INTO STUDENT VALUES(3,'abc','hd10@gmail.com')";
		Class.forName("com.mysql.cj.jdbc.Driver");
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb", "root", "Bismaya7735@");
		FileInputStream fis=new FileInputStream("db.properties");
		Properties p=new Properties();
		p.load(fis);
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb",p);
		Statement st=con.createStatement();
		st.execute(sql);
		con.close();
		System.out.println("all data saved");
	}

}

package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

public class Demo2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Connection con=null;
PreparedStatement pst=null;
ResultSet rst=null;
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
	pst=con.prepareStatement("select * from user");
	rst=pst.executeQuery();
	System.out.println("Id\tName\tEmail\t\tPassword");
	while(rst.next()) {
		System.out.println(rst.getInt(1)+"\t"+rst.getString(2)+"\t"+rst.getString(3)+"\t"+rst.getString(4));
	}
} catch (ClassNotFoundException | SQLException e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
finally {
	//we have to provide if condition because if an exception arises then our variables became null 
	//and performing any operation using null gives NullPoinnterException,in order to avoid this if 
	//our variable is not null then only we've to close the ResultSet,PreparedStatement and Connection object
	try {
		if(rst!=null)
		rst.close();
		if(pst!=null)
		pst.close();
		if(con!=null)
		con.close();
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
	}

}

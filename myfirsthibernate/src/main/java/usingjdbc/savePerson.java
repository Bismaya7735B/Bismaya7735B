package usingjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;

public class savePerson {
public static void main(String[] args) {
	Person p=new Person();
	p.setId(2);
	p.setName("Satya");
	p.setAge(23);
	p.setMobile(773456789);
	
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernatepractice?user=root&password=Bismaya7735@");
		PreparedStatement pst=con.prepareStatement("insert into person values (?,?,?,?)");
		pst.setInt(1, p.getId());
		pst.setString(2, p.getName());
		pst.setInt(3, p.getAge());
		pst.setLong(4, p.getMobile());
		pst.execute();
		con.close();
		System.out.println("data inserted succesfully..");
			}
	catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}

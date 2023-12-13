package usingjdbc;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.util.Scanner;

public class saveLaptops {
	static Scanner sc=new Scanner(System.in);
	static boolean flag=true;
public static void main(String[] args) {
	while(flag) {
	laptops lp=new laptops();
	System.out.println("Enter Brand,Color,Price:");
	lp.setBrand(sc.next());
	lp.setColor(sc.next());
	lp.setPrice(sc.nextDouble());
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/hibernatepractice?user=root&password=Bismaya7735@");
		PreparedStatement pst=con.prepareStatement("insert into laptops values(?,?,?)");
		pst.setString(1, lp.getBrand());
		pst.setString(2, lp.getColor());
		pst.setDouble(3, lp.getPrice());
		pst.executeUpdate();
		System.out.println("data inserted successfully...");
		System.out.print("press 1 to enter more data any other integer to insert data:");
		int exit=sc.nextInt();
		if(exit!=1)
		{
			flag=false;
		}
		con.close();
		
	}
	 catch (Exception e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
}
}

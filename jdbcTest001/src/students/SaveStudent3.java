package students;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.Statement;
import java.util.Scanner;

public class SaveStudent3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
try {
	Class.forName("com.mysql.cj.jdbc.Driver");
	Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
	Statement st=con.createStatement();
	boolean flag=true;
	do
	{
	System.out.println("Enter roll,name,email,gender,age");
	int roll=s.nextInt();
	String name=s.next();
	String email=s.next();
	String gender=s.next();
	int age=s.nextInt();
	st.execute("insert into student values("+roll+",'"+name+"','"+email+"','"+gender+"','"+age+"')");
	System.out.println("If you want to enter more data press 1");
	int i=s.nextInt();
	if(i!=1) {
		flag=false;
	}
	
	}
	while(flag);
	con.close();
	System.out.println("all data saved");
	System.out.println(".......Thank You.......");
	
	
} catch (Exception e) {
	// TODO Auto-generated catch block
	e.printStackTrace();
}
	}

}

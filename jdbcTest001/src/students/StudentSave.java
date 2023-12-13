package students;
//using scanner class to take input from user
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.Scanner;

public class StudentSave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		//String sql="INSERT INTO STUDENT VALUES(5,'bismaya','bismaya3@gmail.com','male',22)";
		try {
			Class.forName("com.mysql.cj.jdbc.Driver");
			Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
		Statement st=con.createStatement();
		System.out.println("Enter roll,name,email,gender,age");
		int roll=sc.nextInt();
		String name=sc.next();
		String email=sc.next();
		String gender=sc.next();
		int age=sc.nextInt();
			st.execute("INSERT INTO STUDENT VALUES("+roll+",'"+name+"','"+email+"','"+gender+"','"+age+"')");
			con.close();
			System.out.println("all data saved");
		} catch (ClassNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		//Connection con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb", "root", "Bismaya7735@");
 catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
	}

}

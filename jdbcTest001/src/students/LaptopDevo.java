package students;


import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class LaptopDevo {
static Scanner sc=new Scanner(System.in);
Connection con;
PreparedStatement pst;
ResultSet rs;
boolean flag=true;
public LaptopDevo() {
	// TODO Auto-generated constructor stub
	try {
		Class.forName("com.mysql.cj.jdbc.Driver");
		con=DriverManager.getConnection("jdbc:mysql://localhost:3306/badaldb?user=root&password=Bismaya7735@");
	} catch (ClassNotFoundException | SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void insert() {
	try {
		pst=con.prepareStatement("insert into laptop values(?,?,?,?,?)");
		
		do {
			System.out.println("Enter id,brand,color,price,warranty");
		int id=sc.nextInt();
		String brand=sc.next();
		String color=sc.next();
		double price=sc.nextDouble();
		int warranty=sc.nextInt();
		pst.setInt(1, id);
		pst.setString(2, brand);
		pst.setString(3, color);
		pst.setDouble(4, price);
		pst.setInt(5, warranty);
		
		pst.addBatch();
		System.out.println("Data entered...");
		System.out.print("Press 1 to enter more data any integer to insert data:");
		int e=sc.nextInt();
		if(e!=1) {
			flag=false;
		}
		
		}
		
		while(flag);
		pst.executeBatch();
		System.out.println("All data inserted successfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}

public void delete() {
	try {
		do {
		display();
		pst=con.prepareStatement("delete from laptop where id=(?)");
		System.out.print("Enter id:");
		int id=sc.nextInt();
		pst.setInt(1, id);
		
		pst.executeUpdate();
		System.out.print("Enter 1 to delete more data or any integer to save changes:");
		int e=sc.nextInt();
		if(e!=1) {
			flag=false;
		}
		
		}
		while(flag);
		System.out.println("Data deleted successfully");
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void display() {
	try {
		pst=con.prepareStatement("select * from laptop");
		boolean execute=pst.execute();
		if(execute) {
		rs=pst.getResultSet();
		System.out.println("Id\tBrand\tColor\t\tPrice\tWarranty");
		System.out.println("..................................................");
		while(rs.next()) {
			System.out.println(rs.getInt(1)+"\t"+rs.getString(2)+"\t"+rs.getString(3)+"\t"+"\t"+rs.getDouble(4)+"\t"+"\t"+rs.getInt(5));
		}
		}
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
}
public void displayWithId() {
	try {
		do {
		pst=con.prepareStatement("select * from laptop where id=?");
		System.out.print("Enter id:");
		int id=sc.nextInt();
		pst.setInt(1, id);
		boolean execute=pst.execute();
		if(execute) {
			rs=pst.getResultSet();
			System.out.println("Brand\tColor\t\tPrice\t\tWarranty");
			System.out.println("..................................................");
			while(rs.next()) {
				System.out.println(rs.getString(2)+"\t"+rs.getString(3)+"\t"+"\t"+rs.getDouble(4)+"\t"+"\t"+rs.getInt(5));
			}
		}
		System.out.print("Press 1 to display again or any integer to exit:");
		int e=sc.nextInt();
		if(e!=1) {
			flag=false;
		}
		}
		while(flag);
	} catch (SQLException e) {
		// TODO Auto-generated catch block
		e.printStackTrace();
	}
	
}
public void updateWithId() {
	try {
		do{
			display();
	System.out.print("Enter id:");
	int id=sc.nextInt();
	System.out.print("Choose 1 for updating color,2 for price any integer for warranty:");
	int choose=sc.nextInt();
	if(choose==1) {
		pst=con.prepareStatement("update laptop set color=(?) where id=(?)");
		System.out.print("Enter color:");
		String color=sc.next();
		pst.setString(1, color);
		pst.setInt(2, id);
		
		} 
	else if(choose==2) {
		pst=con.prepareStatement("update laptop set price=(?) where id=(?)");
		System.out.print("Enter price:");
		double price=sc.nextDouble();
		pst.setDouble(1, price);
		pst.setInt(2, id);
		
	}
	else
		{pst=con.prepareStatement("update laptop set warranty=(?) where id=(?)");
	System.out.print("Enter warranty:");
	int warranty=sc.nextInt();
	pst.setInt(1, warranty);
	pst.setInt(2, id);

		}
	pst.executeUpdate();
	System.out.print("Enter 1 to update more data or any integer to exit:");
	int e=sc.nextInt();
	if(e!=1) {
		flag=false;
	}
	}
		
	while(flag);
	
	System.out.println("All data updated successfully");	
	}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
public void updateWithBrand() {
	try {
		do {
			display();
	System.out.print("Enter brand:");
	String brand=sc.next();
	System.out.print("Choose 1 for updating color,2 for price any integer for warranty:");
	int choose=sc.nextInt();
	if(choose==1) {
		pst=con.prepareStatement("update laptop set color=(?) where brand=(?)");
		System.out.print("Enter color:");
		String color=sc.next();
		pst.setString(1, color);
		pst.setString(2, brand);
		pst.addBatch();
		} 
	else if(choose==2) {
		pst=con.prepareStatement("update laptop set price=(?) where brand=(?)");
		System.out.print("Enter price:");
		double price=sc.nextDouble();
		pst.setDouble(1, price);
		pst.setString(2, brand);
		pst.addBatch();
		
	}
	else {
		pst=con.prepareStatement("update laptop set warranty=(?) where brand=(?)");
	System.out.print("Enter warranty:");
	int warranty=sc.nextInt();
	pst.setInt(1, warranty);
	pst.setString(2, brand);
	pst.addBatch();
		}
	pst.executeBatch();
	System.out.print("Enter 1 to update more data or any integer to exit:");
	int e=sc.nextInt();
	if(e!=1) {
		flag=false;
	}
	}
	while(flag);
		
	System.out.println("All data updated successfully");	
	}catch (SQLException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	
}
public void closeCon() {
	try {
		if(rs!=null)
		rs.close();
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

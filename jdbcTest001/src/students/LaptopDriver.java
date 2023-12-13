package students;

import java.util.Scanner;

public class LaptopDriver {
	static Scanner sc=new Scanner(System.in);
	static	boolean flag=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
LaptopService ls=new LaptopService();
do {
	System.out.println("******************Home Page*********************");
	System.out.println("1,for inserting data");
	System.out.println("2,for updating by id ");
	System.out.println("3,for updating by brand");
	System.out.println("4,deleting data");
	System.out.println("5,for displaying data");
	System.out.println("6,for displaying data by id");
	System.out.println("7,for closing connection");
	System.out.println("8,for exiting from the home page");
	
	System.out.print("Please select one option:");
	int option=sc.nextInt();
	switch(option) {
	case 1://insert data
		ls.insertData();
		break;
	case 2://update data by id
		ls.updatedataById();
		break;
	case 3://update by brand
		ls.updateBybrand();
		break;
	case 4://delete data
		ls.deleteData();
		break;
	case 5://display data
		ls.displayData();
		break;
	case 6://display data by id
		ls.displayById();
		break;
	case 7://closing connection
		ls.closeConnection();
		System.out.println("All connections closed ");
		break;
	case 8://for exiting
		
		System.out.println("Are you sure?");
		System.out.print("Press 1 to exit any integer to continue:");
		int exit=sc.nextInt();
		if(exit==1) {
			flag=false;
		}
		break;
	}
	
}
while(flag);
System.out.println("All operations performed successfully");
System.out.println(".......Thank u.....Visit Again..........");
	}

}

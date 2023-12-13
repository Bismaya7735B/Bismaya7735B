package students;

import java.util.Scanner;

public class Driver {
	static Scanner sc=new Scanner(System.in);
static	boolean flag=true;
static FetchDemo f=new FetchDemo();
public static void main(String[] args) {
	do {
	System.out.println(".............Home Page...............");
	System.out.println("Enter insert to Insert data");
	System.out.println("Enter verify to Verify mail&password");
	System.out.println("Enter delete to Delete data");
	System.out.println("Enter update to Update data");
	System.out.println("Enter fetch to Display data");
	System.out.println("Enter exit to Exit From The Page");
	System.out.print("Please choose from the following options:"); 
	String option=sc.next();
	
	switch (option) {
	case "insert": f.insert();
		break;
	case "verify":f.verifyData();
	break;
	case "delete":f.delete();
	break;
	case "update":f.updateData();
	break;
	case "fetch":f.fetching();
	break;
	case "exit"://to exit
		System.out.println("Are you sure?"); 
		System.out.print("Press 1 to exit any other digit to continue:");
		int e=sc.nextInt();
		if(e==1) {
			flag=false;
		}
		break;
	default:
		System.out.println("Please enter valid input...");;
	}	
	}
while(flag);
	System.out.println("All operations performed successfully....");
	System.out.println(".....Visit Again.......");
	f.closeConnection();
	//FetchDemo f1=new FetchDemo();
	
/*while(flag) {
		System.out.println(".............Home Page...............");
		System.out.println("1 for insert data");
		System.out.println("2 for fetch or display data");
		System.out.println("3 for verify mail&password");
		System.out.println("4 for delete data");
		System.out.println("5 for update data");
		System.out.println("6 for exit ");
		System.out.print("Select your choice:");
		int choice=sc.nextInt();
		switch(choice) {
		case 1://insert data
			f1.insert();
			break;
		case 2://fetch or display data
			f1.fetching();
			break;
		case 3://verify mail&password
			f1.verifyData();
			break;
		case 4://delete data
			f1.delete();
			break;
		case 5://update data
			f1.updateData();
			break;
		case 6://exit
			System.out.println("Are you sure \n press 1 to exit any other digit to continue");
			int exit=sc.nextInt();
			if(exit==1) {
				flag=false;
			break;	
			}
		}
	}
	System.out.println("All operations performed successfully");
	System.out.println("......Visit Again.........");*/
}
}

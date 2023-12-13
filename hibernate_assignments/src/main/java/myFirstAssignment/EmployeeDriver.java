package myFirstAssignment;

import java.util.Scanner;

public class EmployeeDriver {
static Scanner sc=new Scanner(System.in);
static boolean flag=true;
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		EmployeeRepository emr=new EmployeeRepository();
		do {
			System.out.println("******************Home Page*********************");
			System.out.println("1,for inserting data");
			System.out.println("2,for fetching  data by Id ");
			System.out.println("3,for deleting  data by Id ");
			System.out.println("4,for updating  data by Id ");
			System.out.println("5,for fetchinging  all data  ");
			System.out.println("6,for exit ");
			System.out.print("Please select one option:");
			int option=sc.nextInt();
			switch(option) {
			case 1://insert and savedata
				emr.saveEmployee();
				break;
			case 2://fetch data
				emr.fetchEmployeeById();
				break;
			
			case 3://delete data by id
				emr.deleteEmployeeById();
				break;
			case 4://update data by id	
				emr.updateEmployeeById();
				break;
			case 5://fetch all data 	
				emr.fetchAllEmployeeData();
				break;	
			case 6://for exiting
				
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
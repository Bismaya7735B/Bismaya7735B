package students;

import java.util.Scanner;

public class Driver2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
Scanner sc=new Scanner(System.in);
FetchDemoEmp f=new FetchDemoEmp();
System.out.println("Enter 1,2 or 3");
int s=sc.nextInt();
switch(s) {
case 1:System.out.println("TO insert data");
f.insertData();
break;
case 2:System.out.println("To verify mail & password");
f.verifyMailPassword();
break;
case 3:System.out.println("To delete data");
f.deleteData();
break;
}
	}

}

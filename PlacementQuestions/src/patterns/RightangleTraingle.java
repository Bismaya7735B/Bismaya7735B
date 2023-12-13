package patterns;

import java.util.Scanner;

public class RightangleTraingle {
public static void main(String[] args) {
Scanner sc=new Scanner(System.in);
System.out.println("Enter no of rows in a:");
int a=sc.nextInt();
rightAngleTiangle(a);
}
public static void rightAngleTiangle(int n) {
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i+j>=n-1) {
				System.out.print("*");
			}
			else {
				System.out.print(" ");
			}
			
		}
		System.out.println();
	}
}
}

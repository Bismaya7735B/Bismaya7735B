package patterns;

import java.util.Scanner;

public class HollowDiamond {
public static void main(String[] args) {
	HollowDiamond hd=new HollowDiamond();
	Scanner sc = new Scanner(System.in);
	System.out.println("Enter value for a:");
	int a=sc.nextInt();
	hd.hollowDiamond(a);
}
public void hollowDiamond(int x) {
	
	for(int i=0;i<x;i++) {
		for(int j=x;j>i;j--) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			if( j==0 || j==(i)) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
	for(int i=x;i>0;i--) {
		for(int j=i;j<x;j++) {
			System.out.print(" ");
		}
		for(int j=0;j<i;j++) {
			if(j==0 || j==(i-1) ) {
				System.out.print("* ");
			}
			else {
				System.out.print("  ");
			}
		}
		System.out.println();
	}
}
}


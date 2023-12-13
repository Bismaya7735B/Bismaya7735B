package patterns;

import java.util.Scanner;

public class InvertedTriangle {
public static void main(String[] args) {
	InvertedTriangle inv=new InvertedTriangle();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no. of rows in row:");
	int row=sc.nextInt();
	inv.invertedTriangle(row);
}
public int invertedTriangle(int n) {
	for(int i=n;i>0;i--) {
		for(int j=i;j<n;j++) {
			System.out.print(" ");
		}
		for(int j=0;j<i/*(2*i-1)*/;j++) {
			System.out.print("* ");
		}
		System.out.println();
	}
	return n;
}
}
//if using j<2*i-1 then don't give extra space after character like this "* "
		//instead that use "*" if you're giving space then also give an extra space in the above for loop
		//which is printing space before characters like this "  "
package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class FirstandSecondLargest {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter the size of the array:");
	int size=sc.nextInt();
	int a[]=new int[size];
	System.out.println("Enter elements in the array:");
	for(int i=0;i<a.length;i++)
	{
		System.out.print("Enter "+i+" index element:");
		a[i]=sc.nextInt();
	}
	System.out.println("The elements are:"+Arrays.toString(a));
	int large1=0,large2=0,large3=0;
	for(int i=0;i<a.length;i++) {
		if(large1<a[i]) {
			large1=a[i];
		}
	}
	System.out.print("The 1st largest element is:"+large1);
	System.out.println();
	for(int i=0;i<a.length;i++) {
		if(large2<a[i]&&large1!=a[i]) {
			large2=a[i];
		}
	}
	System.out.println("The 2nd largest element is:"+large2);
	for(int i=0;i<a.length;i++) {
		if(large3<a[i]&&large1!=a[i]&&large2!=a[i]) {
			large3=a[i];
		}
	}
	System.out.println("The 3rd largest element is:"+large3);
}
}

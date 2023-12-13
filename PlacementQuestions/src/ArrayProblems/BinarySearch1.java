package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;
import java.io.*;
import ArrayProblems.SortArray;
public class BinarySearch1 {
	public  int binarySearch(int arr[],int key) {
		int li=0, hi=arr.length-1;
		while(li <= hi) {
			int mid=li+ (hi-li) / 2;
			if(arr[mid] == key) {
				return mid;
			}
			 if (arr[mid]<key) {
				li=mid+1;
			}
			else {
				hi=mid-1;
			}
			
		}

		return -1;
	}
public static void main(String[] args) {
	Scanner sc = new Scanner(System.in);
	BinarySearch1 ob1=new BinarySearch1();
	SortArray s=new SortArray();
	/*
	 * System.out.println("Enter size of the array:"); int size=sc.nextInt(); int
	 * []a=new int[size]; System.out.println("Enter elements in array"); for(int
	 * i=0;i<a.length;i++) { a[i]=sc.nextInt(); }
	 */
	int a[]= {100,2,33,44,5,6,7,8,99};
	System.out.println("The elements are:"+Arrays.toString(a));
	
    int n=a.length;
	System.out.print("Enter element to find:");
	int key=sc.nextInt();
	System.out.println("Sorted Array..");
	s.sortArray(a);
	int result=ob1.binarySearch(a, key);
	if (result == -1)
		System.out.println(
			"Element is not present in array");
	else
		System.out.println("Element is present at "
						+ "index " + result);

}

}

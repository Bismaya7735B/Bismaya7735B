package ArrayProblems;

import java.util.Arrays;
import java.util.Scanner;

public class LinearSearch {
public static void main(String[] args) {
	int[]x= {12,34,56,78,98,11};
	System.out.println("The elements are:"+Arrays.toString(x));
	Scanner sc = new Scanner(System.in);
	System.out.print("Enter element to find:");
	int element=sc.nextInt();
	int v=linearSearch(x, element);
	}
public static int linearSearch(int []arr,int key) {
	for(int i=0;i<arr.length;i++) {
		if(arr[i]==key) {
			System.out.println(key+" "+"is Found at "+i+" index");
            break;
		}
		else {
			System.out.println(key+" "+"Not Found!");
			break;
		}
		
	}
return key;
}
}

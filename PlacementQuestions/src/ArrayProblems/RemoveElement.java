package ArrayProblems;

import java.util.Arrays;

//Delete an element from an array
public class RemoveElement {
public static void main(String[] args) {
	int [] orgArray= {1,2,3,4,5};
	
	int  elementToRemove=3;
	int[]b=remove(orgArray, elementToRemove);//the array in which new array will be stored after removing element
	System.out.println("original array:"+Arrays.toString(orgArray));
	System.out.println("New array:"+Arrays.toString(b));
}
public static int[] remove(int [] a,int element) {
	int newArray[]=new int[a.length-1];
	int index=0;
	for(int i=0;i<a.length;i++) {
		if(a[i]!=element) {
			newArray[index]=a[i];
			index++;
		}
	}
	return newArray;
}
}

package ArrayProblems;

import java.util.Arrays;

public class RemoveMultipleElements {
public static void main(String[] args) {
	int []originalarray= {1,2,3,4,5,6};
	int []elementToremove= {4,5,3};
	int []afterRemovingArray=removeMultiple(originalarray, elementToremove);
	System.out.println("Original array:"+Arrays.toString(originalarray));
	System.out.println("After removing New array:"+Arrays.toString(afterRemovingArray));
	
}
public static int[] removeMultiple(int []a,int []elementToRemove) {
	int size=a.length-elementToRemove.length;
	int []newArray=new int[size];
	
	int index=0;
	for(int i=0;i<a.length;i++) {
	boolean found=false;
		for(int j=0;j<elementToRemove.length;j++) {
			if(a[i]==elementToRemove[j]) {
				found=true;
		        break;
			}
		}
		if(!found) {
			newArray[index++]=a[i];
		}
	}
	return newArray;
}
}

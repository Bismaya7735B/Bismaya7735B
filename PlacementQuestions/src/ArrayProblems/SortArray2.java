package ArrayProblems;

import java.util.Arrays;
//sort array in decreasing order
public class SortArray2 {
public static void main(String[] args) {
	int x[]= {12,2,6,67,99,11};
	sortArrayDecreasingOrder(x);
}
public static void sortArrayDecreasingOrder(int []arr) {
	int t=0;
	for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
	}
	System.out.println(Arrays.toString(arr));
}
}
/*       
 way-1:
 for(int i=0;i<arr.length;i++) {
		for(int j=i;j<arr.length;j++) {
			if(arr[i]<arr[j]) {
				t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
	}
way-2:
for(int i=0;i<arr.length;i++) {
		for(int j=0;j<arr.length;j++) {
			if(arr[i]>arr[j]) {
				t=arr[i];
				arr[i]=arr[j];
				arr[j]=t;
			}
		}
	}  
  
  
  
  */

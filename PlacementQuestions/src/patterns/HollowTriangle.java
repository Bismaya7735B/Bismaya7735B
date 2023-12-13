package patterns;

import java.util.Scanner;

public class HollowTriangle {
public static void main(String[] args) {
HollowTriangle h1=new HollowTriangle();
Scanner sc=new Scanner(System.in);
System.out.println("Enter the value for a:");
int a=sc.nextInt();
h1.hollowTriangle(a);
}
public void hollowTriangle(int x) {
	for(int i=0;i<x;i++) {
		for(int j=x;j>i;j--) {
			System.out.print(" ");
		}
		for(int j=0;j<=i;j++) {
			if(i==x-1 || j==0 || j==(i)) {
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
/*                                
 
     * 
    * * 
   *   * 
  *     * 
 * * * * *  */

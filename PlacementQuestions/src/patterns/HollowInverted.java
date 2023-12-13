package patterns;

import java.util.Scanner;

public class HollowInverted {
public static void main(String[] args) {
HollowInverted h1=new HollowInverted();
Scanner sc=new Scanner(System.in);
System.out.println("Enter value for a:");
int a=sc.nextInt();
h1.hollowInvertedTriangle(a);
}
public void hollowInvertedTriangle(int x) {
	for(int i=x;i>0;i--) {
		for(int j=i;j<x;j++) {
			System.out.print(" ");
		}
		for(int j=0;j<i;j++) {
			if(j==0 || j==(i-1) || i==x) {
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
 
* * * * * 
 *     * 
  *   * 
   * * 
    *     */
 
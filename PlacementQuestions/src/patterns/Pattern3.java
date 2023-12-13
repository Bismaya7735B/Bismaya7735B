package patterns;

import java.util.Scanner;

public class Pattern3 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	Pattern3 p1=new Pattern3();
	System.out.println("Enter value for x:");
	int x=sc.nextInt();
	p1.playStorePattern(x);
}
	public void playStorePattern(int a) {
		for(int i=0;i<=a;i++) {
			for(int j=0;j<=i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
		for(int i=a;i>0;i--) {
			for(int j=0;j<i;j++) {
				System.out.print(j+" ");
			}
			System.out.println();
		}
	}
}
/*
0 
0 1 
0 1 2 
0 1 2 3 
0 1 2 3 4 
0 1 2 3 4 5 
0 1 2 3 4 
0 1 2 3 
0 1 2 
0 1 
0 
 
 
 */
 
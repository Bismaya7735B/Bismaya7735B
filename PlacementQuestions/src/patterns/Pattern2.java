package patterns;

import java.util.Scanner;

public class Pattern2 {
public static void main(String[] args) {
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no of rows in row:");
	int row=sc.nextInt();
	Pattern2 p1=new Pattern2();
	p1.patterns(row);
}
public void patterns(int n) {
	
	for(int i=0;i<n;i++) {
		for(int j=0;j<n;j++) {
			if(i==0 || i==n-1 || i==j || i== n-j-1) {
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
 # Define the size of the pattern
n = 10

# Use nested loops to print each line of the pattern
for i in range(n):
    for j in range(n):
        # Print an asterisk if we're on the first or last row, or if we're on the diagonal
        if i == 0 or i == n-1 or i == j or i == n-j-1:
            print("* ", end="")
        else:
            print("  ", end="")
    print()


* * * * * * * * * * 
  *             *   
    *         *     
      *     *       
        * *         
        * *         
      *     *       
    *         *     
  *             *   
* * * * * * * * * * 

  
 
  */
 
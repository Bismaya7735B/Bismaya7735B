package patterns;

import java.util.Scanner;

public class Diamond {
public static void main(String[] args) {
	InvertedTriangle inv=new InvertedTriangle();
	Triangle t=new Triangle();
	Scanner sc=new Scanner(System.in);
	System.out.print("Enter no. of rows in rows:");
	int rows=sc.nextInt();
	t.triangle(rows);
	inv.invertedTriangle(rows);
}
}
/*   
 
           
         * 
        * * 
       * * * 
      * * * * 
     * * * * * 
    * * * * * * 
   * * * * * * * 
  * * * * * * * * 
 * * * * * * * * * 
* * * * * * * * * * 
 * * * * * * * * * 
  * * * * * * * * 
   * * * * * * * 
    * * * * * * 
     * * * * * 
      * * * * 
       * * * 
        * * 
         * 

  
  
  */
 
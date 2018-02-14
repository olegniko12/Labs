//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab11c
{
   public static void main( String args[] )
   {
	   while (true) {
		   Scanner sc = new Scanner(System.in);
		   
		   System.out.print("Please input a letter: ");
		   String inputC = sc.next();

		   System.out.print("\nNow input how many layers of a triangle you'd like: ");
		   int inputI = sc.nextInt();

		   TriangleThree tT = new TriangleThree(inputI, inputC);
		   
		   System.out.println("\n");
	   }
	   
	   

	}
}
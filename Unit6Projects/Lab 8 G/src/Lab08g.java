//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab08g
{
	public static void main ( String[] args )
	{
		while (true) {
			
			int totalSum = 0, odds = 0, evens =0;
			
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Please input a number: ");
			int a = sc.nextInt();
			
			System.out.print("Please input another number: ");
			int b = sc.nextInt();
			
			for (int i = a; i<=b; i++) {
				totalSum += i;
				
				if (i % 2 == 0) {
					evens++;
				} else {
					odds++;
				}
				
			}
			
			System.out.println("Total sum: " + totalSum + "\nNumber of odds: "+odds+"\nNumber of evens: "+evens);
			System.out.println("\n");
			
		}
		
		
		
					
	}
}
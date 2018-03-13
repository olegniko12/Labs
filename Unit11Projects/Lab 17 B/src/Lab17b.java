//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab17b
{
	public static void main( String args[] )
	{
	WordPrinter wp = new WordPrinter();
		
   	Scanner sc = new Scanner(System.in);
   	String choice="";
		do{
			out.print("\nEnter the word to display :: ");
			String word = sc.next();
	
			out.print("Enter the times to display :: ");
 			int times = sc.nextInt();
 			
 			wp.printWord(word, times);

			System.out.print("\nDo you want to enter more sample input? ");
			choice=sc.next();			
		}while(choice.toUpperCase().equals("Y"));		
	}
}
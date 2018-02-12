//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab09f
{
	public static void main( String args[] )
	{
		
		
			while (true) {

				System.out.print("Please input a sentence to analyze: ");
				
				Scanner sc = new Scanner(System.in);
				
				String inputStr = sc.next();
				
				System.out.print("Input a letter you'd like to remove: ");
				
				char takeOut = sc.next().charAt(0);
				
				LetterRemover lr = new LetterRemover(inputStr, takeOut);

			}
	}
}
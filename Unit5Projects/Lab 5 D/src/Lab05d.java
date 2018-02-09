//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab05d
{
	public static void main ( String[] args )
	{
		Scanner keyboard = new Scanner(System.in);
		
		out.print("Enter a character :: ");
		char letter = keyboard.next().charAt(0);
		CharacterAnalyzer CA = new CharacterAnalyzer();
		
		out.println("The ASCII value of " + letter + " is: " + CA.characterAnalyzer(letter));   //A

		out.println("\n" + );
		
		
		
		
		
		
		
		

	}
}
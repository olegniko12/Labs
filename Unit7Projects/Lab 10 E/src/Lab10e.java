//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class Lab10e
{
	public static void main(String args[])
	{
		while (true) {

			Scanner sc = new Scanner(System.in);
			char response;
			
			System.out.print("Input the amount of numbers you'd like in the game: ");
			new GuessingGame(sc.nextInt());
			
			System.out.print("\n");
			
		}
		
	}
}
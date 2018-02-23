//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

public class GuessingGame
{
	private int upperBound;
	private double randomNum;

	public GuessingGame(int stop)
	{
		upperBound = stop;
		randomNum = Math.round(Math.random() * Math.floor(upperBound));
		playGame();
	}

	public void playGame()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Guess a number from 0 to " +upperBound + " (Inclusive of 0 and "+ upperBound + ").");

		int guesses=0;
		
		while (true) {
			
			guesses++;
			
			double d = (double) sc.nextInt();
			if (d == randomNum) {
				System.out.println("Good job! You guessed it in " + guesses + " tries. This means that " + 100/guesses + "% of your guesses were right.");
				break;
			} else if (d<0 || d>upperBound){
				System.out.println("Please input a valid number that is between 0 and " + upperBound + ": ");
			} else {
				System.out.println("Sorry, that was wrong, try again.");
			}
		}
		
		

	}

	public String toString(String input)
	{
		String output = input;
		return output;
	}
}
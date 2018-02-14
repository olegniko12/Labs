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
		System.out.println(randomNum);
		playGame();
	}

	public void playGame()
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.println("Guess a number from 0 to " +upperBound + ".");

		
		
		while (true) {
			
			double d = (double) sc.nextInt();
			if (d == randomNum) {
				System.out.println("Good job! You guessed it!");
				break;
			} else if (d<0 || d>upperBound){
				System.out.println("Please input a valid number that is between 0 and " + upperBound + ": ");
			} else {
				System.out.println("Sorry, that was wrong.");
				break;
			}
		}
		


	}

	public String toString()
	{
		String output="";
		return output;
	}
}
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;


public class Lab14i
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in);
		
		System.out.print("Please input a number or Roman Numeral to 'translate': ");
		String input = sc.nextLine();
		
		RomanNumeral rN = new RomanNumeral(Integer.parseInt(input));
		System.out.println(rN.toString());
		
	}
}
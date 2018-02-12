//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.lang.Math;

public class Prime
{
	private int number;

	public Prime()
	{


	}

	public Prime(int num)
	{
		
		if (isPrime(num)) {
			System.out.println("The number '" + num + "' is prime.");
		} else {
			System.out.println("The number '" + num + "' is not prime.");
		}
		
	}

	public boolean isPrime(int num)
	{
		for (int i = 2; i<num; i++) {
			if (num%i==0) {
				return false;
			}			
		}
		return true;
	}

}
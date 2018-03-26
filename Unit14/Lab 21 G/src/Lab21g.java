//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Lab21g
{
	public static void main(String args[])
	{
		AtCounter aC = new AtCounter();

		aC.countAts(0,0);
		
		out.println(aC);
		
		aC = new AtCounter();

		aC.countAts(2,5);
		
		out.println(aC);
		
		aC = new AtCounter();

		aC.countAts(5,0);
		
		out.println(aC);
		
		aC = new AtCounter();

		aC.countAts(9,9);
		
		out.println(aC);
		
		aC = new AtCounter();

		aC.countAts(3,9);
		
		out.println(aC);
	}
}
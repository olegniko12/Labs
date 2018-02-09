//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class CharacterAnalyzer
{
	private char theChar;
	private int asciiValue;

	int ascii;
	
	public CharacterAnalyzer()
	{


	}

	public int characterAnalyzer(char c)
	{
		theChar = c;
		
		ascii = (int) theChar;
		
		if (ascii >= 97 && ascii <= 122) {
			isLower(c);
		}
		
		return ascii;
	}


	public boolean isUpper(char c)
	{



		return false;
	}

	public boolean isLower(char c)
	{



		return false;
	}
	
	public boolean isNumber( )
	{



		return false;
	}	

}
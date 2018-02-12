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

	public String characterAnalyzer(char c)
	{
		String whatType;
		
		if (ascii >= 97 && ascii <= 122) {
			return isLower(c);
		} else if (ascii >= 65 && ascii <= 90){
			return isUpper(c);
		} else if (ascii >= 48 && ascii <= 57) {
			return isNumber(c);
		}
		
		return "The character '"+c+"' is a symbol.";
	}


	public String isUpper(char c)
	{
		return "The character '"+c+"' is an uppercase letter.";
	}

	public String isLower(char c)
	{
		return "The character '"+c+"' is an lowercase letter.";
	}
	
	public String isNumber(char c)
	{
		return "The character '"+c+"' is a number.";
	}	
	
	public int getAscii(char c) {
		theChar = c;
		
		ascii = (int) theChar;
		
		
		
		return ascii;
	}

}
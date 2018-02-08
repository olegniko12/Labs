//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class StringChecker
{
	private String word;

	public StringChecker()
	{


	}

	public StringChecker(String s)
	{
		word = s;
		System.out.println(word);
	}

   public void setString(String s)
   {
   	word=s;
   	System.out.println(word);
   }

	public boolean findLetter(String c)
	{
		if (word.contains(c)){
			return true;
		}
		return false;
	}

	public boolean findSubString(String s)
	{
		if (word.contains(s)){
			return true;
		}
		return false;

	}

 	public String toString()
 	{
 		return "\n\n";
	}
}
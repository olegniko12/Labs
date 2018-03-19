//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Word implements Comparable<Word>
{
	private String word;

	public Word( String s)
	{
		word =s;

	}

	private int numVowels()
	{
		String vowels = "AEIOUaeiou";
		
		char[] vowelArray = vowels.toCharArray();
		
		int vowelCount=0;

		char[] tempArray = word.toLowerCase().toCharArray();

		for (char c: tempArray){
			for(char v: vowelArray){
				if (c==v){
					vowelCount++;
				}
			}
		}
		
		return vowelCount;
	}

	public int compareTo(Word rhs)
	{
		if (rhs.numVowels() > numVowels()) {
			return -1;
		} else if (rhs.numVowels() == numVowels()) {
			if (word.compareTo(rhs.toString())>0){
				return 1;
			} else if (word.compareTo(rhs.toString())==0){
				return 0;
			}
			return -1;
		}
		
		return 1;
	}

	public String toString()
	{
		return word;
	}
}
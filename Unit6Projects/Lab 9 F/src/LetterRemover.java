//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.util.ArrayList;

public class LetterRemover
{
   private String sentence;
   private char lookFor;

	public LetterRemover(String str, char to)
	{
		setRemover(str, to);
		System.out.println(removeLetters());
	}

	//add in second constructor
	
	
	
	public void setRemover(String s, char rem)
	{
		sentence = s;
		lookFor = rem;
	}

	public String removeLetters()
	{
		String cleaned=sentence;
		char remover = lookFor;
		
		String[] sArray = cleaned.split(" ");
		ArrayList<String> sList = new ArrayList<String>();
		
		System.out.println("Sentence being analyzed: " + sentence + "\nCharacter being removed: " + lookFor);
		
		for (int i = 0; i<sArray.length; i++) {
			char[] cArray = sArray[i].toCharArray();
			ArrayList<Character> cList = new ArrayList<Character>();
			
			for (char c: cArray) {
				if (c != remover) {
					cList.add(c);
				}
			}
			
			String newWord = "";
			
			for (char c: cList) {
				newWord += (c + "");
			}
			
			sList.add(newWord);
			
		}
		
		cleaned = "";
		
		for (String s: sList) {
			cleaned+= (s + " ");
		}
		
		return cleaned;
	}

	public String toString()
	{
		return sentence + " - letter to remove " + lookFor;
	}
}
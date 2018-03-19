//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;
import java.util.Arrays;
import static java.lang.System.*;

public class Lab18e
{
	public static void main( String args[] ) throws IOException
	{

		Scanner sc = new Scanner(new File("H:\\Labs\\Labs\\Unit12Projects\\Lab 18 E\\src\\lab18e.dat"));
		
		int listLength = sc.nextInt();
		sc.nextLine();
		
		ArrayList<Word> wordList = new ArrayList<Word>(listLength);
		
		while (sc.hasNext()){
			Word tempWord = new Word(sc.nextLine());
			wordList.add(tempWord);
		}

		out.println(wordList); //Unsorted

		for (Word w: wordList){
			for (int i = 0; i < wordList.size()-1; i++){
				int compare = wordList.get(i).compareTo(wordList.get(i+1));
				
				if (compare < 0) {
					
				} else if (compare == 0){
					
				}
				
				else if (compare > 0){
					Word tempWord = wordList.get(i+1);
					wordList.set(i+1, wordList.get(i));
					wordList.set(i, tempWord);
				}
				
			}
			
		}
		
		for (Word w: wordList){
			out.println(w.toString());
		}
		//S O R T E D
		




	}
}
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.Arrays;
import java.util.ArrayList;
import static java.lang.System.*;

public class Lab18d
{
	public static void main( String args[] ) throws IOException
	{
		Scanner file = new Scanner(new File("H:\\Labs\\Labs\\Unit12Projects\\Lab 18 D\\src\\lab18d.dat"));

		int size = file.nextInt();
		file.nextLine();
		
		ArrayList<Word> wordList = new ArrayList<Word>();
		
		for (int i = 0; i < size; i++){
			wordList.add(new Word(file.nextLine()));
		}

		for (Word w: wordList){
			out.println(w);
		}
		
		for (int i = 0; i<wordList.size(); i++){
			
		}









	}
}
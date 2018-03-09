//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import static java.lang.System.*;

public class Histogram
{
	private ArrayList<Integer> count;
	private ArrayList<Character> letters;
	private String fileName;

	Scanner file = null;
	
	public Histogram()
	{
		InitializeLists();

		

	}

	public Histogram(char[] values, String fName)
	{
		InitializeLists();
		
		for(char c: values) {
			letters.add(c);
			count.add(0);
		}

		out.println("search letters = "+letters);

	}
	
	private void InitializeLists() {
		
		letters = new ArrayList<Character>();
		count = new ArrayList<Integer>(letters.size());
	}
	
	public void loadAndAnalyzeFile() throws IOException
	{
		 
		file = new Scanner(new File("H:\\Labs\\Labs\\Unit10Projects\\Lab 16 E\\src\\lab16e1.dat"));
		
		String tempString = new String();
		
		while (file.hasNext()){
			tempString += file.next();
		}

		char[] charArray = tempString.toCharArray();
		
		int currentIndex = 0;
		
		for (char d: letters) {
			for (char c: charArray) {
				if (c==d){
					count.set(currentIndex,count.get(currentIndex)+1);
				}
			}
			System.out.println("There are " + count.get(currentIndex) +" " + letters.get(currentIndex));
			currentIndex++;
		}
		

	}

	public char mostFrequent()
	{

		return '#';
	}

	public char leastFrequent()
	{


		return '#';
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}
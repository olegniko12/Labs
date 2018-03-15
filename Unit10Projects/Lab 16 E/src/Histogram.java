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
		
		fileName = fName;

		out.println("search letters = "+letters);

	}
	
	private void InitializeLists() {
		
		letters = new ArrayList<Character>();
		count = new ArrayList<Integer>(letters.size());
	}
	
	public void loadAndAnalyzeFile() throws IOException
	{
		 
		file = new Scanner(new File("H:\\Labs\\Labs\\Unit10Projects\\Lab 16 E\\src\\lab16e3.dat"));
		
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
			currentIndex++;
		}
		

	}

	public char mostFrequent()
	{
		int mostIndex = 0;
		int highestAmount = 0;
		for (int i = 0; i<count.size(); i++){
			if(count.get(i) > highestAmount){
				mostIndex = i;
				highestAmount = count.get(i);
			}
		}
		return letters.get(mostIndex);
	}

	public char leastFrequent()
	{
		int mostIndex = 0;
		int leastAmount = Integer.MAX_VALUE;
		for (int i = 0; i<count.size(); i++){
			if(count.get(i) < leastAmount){
				mostIndex = i;
				leastAmount = count.get(i);
			}
		}
		return letters.get(mostIndex);
	}

	public String toString()
	{
	   return fileName
	   + "\n" + letters
	   + "\n" + count + "\n\n\n";
	}
}
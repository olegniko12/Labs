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

		
		



		out.println("search letters = "+letters);
	}
	
	private void InitializeLists() {
		count = new ArrayList<Integer>();
		letters = new ArrayList<Character>();
	}
	
	public void loadAndAnalyzeFile(String fileName) throws IOException
	{
		 
		file = new Scanner(new File(fileName));
		
		





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
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  - 

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Random;

import static java.lang.System.*;

public class MadLib
{
	private ArrayList<String> verbs;
	private ArrayList<String> nouns;
	private ArrayList<String> adjectives;
	
	Scanner file = null;
	
	public MadLib()
	{
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		
		loadNouns();
		loadVerbs();
		loadAdjectives();
	}

	public MadLib(String fileName)
	{
		
		try{
			file = new Scanner(new File(fileName));
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
		verbs = new ArrayList<String>();
		nouns = new ArrayList<String>();
		adjectives = new ArrayList<String>();
		
		loadNouns();
		loadVerbs();
		loadAdjectives();
		getRandomVerb();
		getRandomAdjective();
		getRandomNoun();
		
	}

	public void loadNouns()
	{
		try{
			file = new Scanner(new File("H:\\Labs\\Labs\\Unit10Projects\\Lab 16 D\\src\\nouns.dat"));
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
		while (file.hasNext()){
			nouns.add(file.next());
		}
		
	}
	
	public void loadVerbs()
	{
		try{
			file = new Scanner(new File("H:\\Labs\\Labs\\Unit10Projects\\Lab 16 D\\src\\verbs.dat"));
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
		while (file.hasNext()){
			verbs.add(file.next());
		}
	}

	public void loadAdjectives()
	{
		try{
			file = new Scanner(new File("H:\\Labs\\Labs\\Unit10Projects\\Lab 16 D\\src\\adjectives.dat"));
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
		while (file.hasNext()){
			adjectives.add(file.next());
		}
	}

	public String getRandomVerb()
	{
		String randomVerb = new String();
		
		int randomPos = GenerateRandomInt(verbs.size());
		
		randomVerb = verbs.get(randomPos);
		
		System.out.println("Verb chosen: " + randomVerb);
		
		return randomVerb;
	}
	
	public String getRandomNoun()
	{
		String randomNoun = new String();
		
		int randomPos = GenerateRandomInt(nouns.size());
		
		randomNoun = nouns.get(randomPos);
		
		System.out.println("Noun chosen: " + randomNoun);
		
		return randomNoun;
	}
	
	public String getRandomAdjective()
	{
		String randomAdj = new String();
		
		int randomPos = GenerateRandomInt(adjectives.size());
		
		randomAdj = adjectives.get(randomPos);
		
		System.out.println("Adjective chosen: " + randomAdj);
		
		return randomAdj;
	}
	
	public int GenerateRandomInt(int limitOne) {
		int randomInt = 0;
		Random random = new Random();		
		randomInt = random.nextInt(limitOne);		
		return randomInt;
	}
	
	public String CreateStory() {
		
		try{
			file = new Scanner(new File("H:\\Labs\\Labs\\Unit10Projects\\Lab 16 D\\src\\story.dat"));
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!");
		}
		
		String newStory = new String();
		
		while (file.hasNext()){
			String tempString = file.next();
			
			if (tempString.equals("#")) {
				tempString = getRandomNoun();
			} else if (tempString.equals("@")) {
				tempString = getRandomVerb();
			} else if (tempString.equals("&")) {
				tempString = getRandomAdjective();
			}
			
			newStory += (tempString + " ");
		}
				
		return newStory;
	}
//	/"C:\\Users\\nikolaevo8292\\Desktop"
	//Very enjoyable project
	public void SaveString(String filePath, String sentence) {
		try{
			//File newFile = new File("C:\\Users\\nikolaevo8292\\Desktop\\madeStories.dat");
			file = new Scanner(new File("H:\\Labs\\Labs\\Unit10Projects\\Lab 16 D\\src\\story.dat"));
			FileWriter fileWriter = new FileWriter(filePath, true);
			fileWriter.write(sentence);
			fileWriter.write("\r\n");
			fileWriter.flush();
			fileWriter.close();
			out.println("Wrote to file!");
		}
		catch(Exception e)
		{
			out.println("Houston we have a problem!!!!!");
		}
	}

	public String toString()
	{
		String output = CreateStory();
		
		SaveString("C:\\Users\\nikolaevo8292\\Desktop\\madeStories.dat", output);
		
		return output;
	}
}
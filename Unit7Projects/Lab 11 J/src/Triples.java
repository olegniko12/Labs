//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.ArrayList;

public class Triples
{
   private int number;
   
   private ArrayList<Integer> numList;
   private ArrayList<Integer> oddList;
   private ArrayList<Integer> evenList;

	public Triples()
	{
		this(0);
	}

	public Triples(int num)
	{
		

	}

	public void setLists(int num)
	{
		numList = nL;
		oddList = oL;
		evenList = eL;
	}
	
	public void ALoopFun(ArrayList<Integer> numList, ArrayList<Integer> oddList, ArrayList<Integer> evenList[]) {
		for (int i: numList) {
			if (i%2==0) {
				BLoopFun(i, oddList);
			}
		}
	}
	
	public void BLoopFun(int i, ArrayList<Integer> List, ) {
		
	}
	
	public void CLoopFun(int i, ArrayList<Integer> oddList) {
		
	}
	
	private int greatestCommonFactor(int a, int b, int c)
	{
		int max = 0;



		return 1;
	}

	public String toString()
	{
		String output="";






		return output+"\n";
	}
}
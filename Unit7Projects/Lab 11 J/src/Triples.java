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

	public Triples()
	{
		System.out.println();
	}

	public Triples(int num)
	{
		number = num;
		
	}
	
	
	public void ALoopFun(ArrayList<Integer> numList, ArrayList<Integer> oddList, ArrayList<Integer> evenList) {
		for (int i: numList) {
			if (i%2==0) {
				BLoopFun(i, oddList, oddList);
			} else {
				BLoopFun(i, evenList, oddList);
			}
		}
	}
	
	public void BLoopFun(int i, ArrayList<Integer> List, ArrayList<Integer> oddList) {
		for (int x: List) {
			
			if (x > i) {
				
				CLoopFun(i,x,oddList);
			}
		}
	}
	
	public void CLoopFun(int a, int b, ArrayList<Integer> oddList) {
		for (int c: oddList) {
			if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c,2)&& noGCF(a, b, c)) {
				System.out.println("" + a + " " + b + " " + c);
				//REMOVE DOUBLES
			}
		}
	}
	
	private boolean noGCF(int a, int b, int c)
	{
		int d = b%a;
		int e = c%d;
		
		if (d == 1 || e != 0) {
			return true;
		} else if (d!= 1 || e==0) {
			return false;
		}
		return false;
		
	}

	public String toString()
	{
		String output="";






		return output+"\n";
	}
}
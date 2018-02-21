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
   
   private ArrayList<Integer> nL;
   private ArrayList<Integer> oL;
   private ArrayList<Integer> eL;
   private ArrayList<Integer> answerList;
   private ArrayList<Integer> removedInts = new ArrayList<Integer>();

	public Triples()
	{
		System.out.println();
	}

	public Triples(int num)
	{
		number = num;
		
	}
	
	public void SetLists(ArrayList<Integer> nums, ArrayList<Integer> odds, ArrayList<Integer> evens) {
		nL=nums;
		oL=odds;
		eL=evens;
		answerList = odds;
	}
	
	
	public void ALoopFun() {
		for (int i: nL) {
			if (i%2==0) {
				BLoopFun(i, oL);
			} else {
				BLoopFun(i, eL);
			}
		}
	}
	
	public void BLoopFun(int i, ArrayList<Integer> List) {
		for (int x: List) {
			
			if (x > i) {
				CLoopFun(i,x);
			}
		}
	}
	
	public void CLoopFun(int a, int b) {
		for (int c: answerList) {
			if ((Math.pow(a, 2) + Math.pow(b, 2)) == Math.pow(c,2) && noGCF(a, b, c)) {
				System.out.println("Answer: " + a + " " + b + " " + c);
				removedInts.add(a);
				removedInts.add(b);
				
				
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

	public String toString(String output)
	{
		return output+"\n";
		
	}
}
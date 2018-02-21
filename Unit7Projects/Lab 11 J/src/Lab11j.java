//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  -

import static java.lang.System.*;

import java.util.ArrayList;
import java.util.Scanner;

public class Lab11j
{
   public static void main(String args[])
   {
	   
	   Scanner sc = new Scanner(System.in);
	   
	   System.out.print("Please input a number to go up to: ");
	   int maxNum = sc.nextInt();
	   
	   ArrayList<Integer> numList = new ArrayList<Integer>();
	   ArrayList<Integer> oddList = new ArrayList<Integer>();
	   ArrayList<Integer> evenList = new ArrayList<Integer>();
	   
	   for (int i = 1; i<=maxNum; i++) {
		   
		   numList.add(i);
		      
	   }
	   
	   for (int i: numList) {
		   System.out.println("Added " + i + " to numList.");
		   if (i%2==0) {
			   evenList.add(i);
		   } else {
			   oddList.add(i);
		   }
	   }
	   
	   for (int i: evenList) {
		   System.out.println(i + " is an even number.");
	   }
	   
	   for (int i: oddList) {
		   System.out.println(i + " is an odd number.");
	   }
	   
	   Triples triples = new Triples(numList, oddList, evenList);
	   
   }
}
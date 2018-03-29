//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class - 
//Lab  - 

import static java.lang.System.*;
import java.util.Arrays;		//use Arrays.toString() to help print out the array

public class QuickSort
{
	private static int passCount = 0;

	public static void quickSort(Comparable[] list)
	{
		passCount = 0;
		
		String output = "Pass " + passCount + ": [";
		for(Comparable c: list){
			output += c + " ";
		}
		output += "]";
		out.println(output);
		//int split = partition(list, (int) list[0], (int) list[list.length-1]);
		//out.println("Low: " + (int) list[0]);
		//out.println("High: " + (int) list[list.length-1]);
		//quickSort(list, (int) list[0], (int) list[list.length-1]);

		out.println(0);
		out.println(list.length-1);
		quickSort(list, 0, list.length-1);
		out.println("\n\n");

	}


	private static void quickSort(Comparable[] list, int low, int high)
	{
		if(low<high){
			int split = partition(list, low, high);
			quickSort(list, low, split);
			quickSort(list, split+1, high);
		}

		passCount++;
		
		String output = "Pass " + passCount + ": [";
		for(Comparable c: list){
			output += c + " ";
		}
		output += "]";
		
		out.println(output);
	}


	private static int partition(Comparable[] list, int low, int high)
	{
		int pivot = (int) list[low];
		int bot = low-1;
		int top = high+1;
		while (bot<top){
			while(list[--top].compareTo(pivot)>0);
			while(list[++bot].compareTo(pivot)<0);
			if(bot>=top){
				return top;
			}
			Comparable temp = list[bot];
			list[bot] = list[top];
			list[top] = temp;
		}
		
		return top;
	}
}
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Lab16d
{
	public static void main( String args[] )
	{
		Scanner sc = new Scanner(System.in);
		
		while (true) {
			System.out.print("How many senteces would you like to create? ");
			int loopTimes = sc.nextInt();
			
			while (loopTimes > 0) {
				MadLib madLib1 = new MadLib();
				System.out.println(madLib1);
				System.out.println("Loops left: " + loopTimes);
				loopTimes--;
			}
			
			out.println("Done looping!\n");
			
		}
		
		
		
	}
}
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;

public class Lab14d
{
	public static void main( String args[] )
	{
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("How many grades would you like to calculate?\n");
		int gradeNum = sc.nextInt();
		
		float[] gradesArray = new float[gradeNum];
		
		for (int i = 0; i<gradeNum; i++) {
			System.out.print("\nGrade #" + (i+1) + ":\n");
			gradesArray[i] = sc.nextFloat();
		}
		
		Arrays.sort(gradesArray);
		
		System.out.println("\nGrades inputed:");
		
		for (float f: gradesArray) {
			System.out.println(f);
		}
		
		System.out.println();
		
		System.out.println(new Grades(gradesArray));
		
	}
}
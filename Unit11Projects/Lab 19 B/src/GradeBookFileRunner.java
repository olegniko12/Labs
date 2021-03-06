//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.Scanner;

import static java.lang.System.*;
import static java.util.Arrays.*;

import java.io.File;

public class GradeBookFileRunner
{
   public static void main( String args[] ) throws Exception
   {
		out.println("Welcome to the Class Stats program!");
		
		Scanner file = new Scanner(new File("C:\\Users\\OlegNikolaev\\Desktop\\Eclipse Java Projects\\CS Labs\\Labs\\Unit11Projects\\Lab 19 B\\src\\gradebook.dat"));
		// Above is directory of file for scanner
		String className = file.nextLine();
		int classSize = file.nextInt();
		
		Class newClass = new Class(className, classSize);
		
		file.nextLine();
		
		for (int i = 0; i < classSize; i++){
			String tempName = file.nextLine();
			String tempGrade = file.nextLine();
			Student tempStudent = new Student(tempName, tempGrade);
			newClass.addStudent(i, tempStudent);
		}
		out.println (newClass);
		
		newClass.sort();
		
		out.println(newClass);
		
		out.println("Failure List = " + newClass.getFailureList(70));	
		out.println("Highest Average = " + newClass.getStudentWithHighestAverage());
		out.println("Lowest Average = " + newClass.getStudentWithLowestAverage());
								
		out.println(String.format("Class Average = %.2f",newClass.getClassAverage()));	
		
		
	}		
}
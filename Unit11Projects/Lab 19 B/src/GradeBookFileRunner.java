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
		
		Scanner file = new Scanner(new File("H:\\Labs\\Labs\\Unit11Projects\\Lab 19 B\\src\\gradebook.dat"));
		
		String className = file.nextLine();
		int classSize = file.nextInt();
		
		Class newClass = new Class(className, classSize);
		
		for (int i = 0; i < (classSize * 2)-1; i++){
			String tempName = file.nextLine();
			String tempGrade = file.nextLine();
		}
		
		
		
	}		
}
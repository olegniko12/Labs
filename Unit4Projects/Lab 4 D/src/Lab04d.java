//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;
import java.util.Scanner;

public class Lab04d
{
	public static void main ( String[] args )
	{
		
		while (true) {
			Scanner sc = new Scanner(System.in);
			
			System.out.print("Enter a full name: ");
			String s = sc.nextLine();
			Name person = new Name(s);
			person.setName(s);
			System.out.println(person.toString() + "\n\n");
		}
		
	}
}
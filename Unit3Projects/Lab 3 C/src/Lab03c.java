//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;

import java.io.InputStream;

import static java.lang.Math.*;

public class Lab03c
{
	public static void main( String[] args ) 
	{
		Quadratic q = new Quadratic();
	
		Scanner keyboard = new Scanner(System.in);
		
		int a,b,c;
		
		System.out.print("Input integer A: ");
		a = keyboard.nextInt();
		
		System.out.print("Input integer B: ");
		b = keyboard.nextInt();
		
		System.out.print("Input integer C: ");
		c = keyboard.nextInt();
		
		System.out.print("Your three integers are: " + a + " " + b + " " + c);
		
		q.print(a,b,c);
		
		
		
		
	}
}
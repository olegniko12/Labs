//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Lab03d
{
	public static void main( String[] args )
	{
		Scanner sc = new Scanner(System.in);
		
		Distance distance = new Distance();
		
		System.out.print ("Input coordinate X1: ");
		int x1 = sc.nextInt();
		
		System.out.print ("Input coordinate Y1: ");
		int y1 = sc.nextInt();

		System.out.print ("Input coordinate X2: ");
		int x2 = sc.nextInt();
		
		System.out.print ("Input coordinate Y2: ");
		int y2 = sc.nextInt();
		
		System.out.println("The distance between your points is:\n");
		distance.print(x1, y1, x2, y2);
		
	}
}
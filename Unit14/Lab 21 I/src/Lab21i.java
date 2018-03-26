//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import static java.lang.System.*;

public class Lab21i
{
	public static void main( String args[] ) throws IOException
	{
		
		Scanner sc = new Scanner(new File("H:\\Labs\\Labs\\Unit14\\Lab 21 I\\src\\lab21i.dat"));
		
		int dimensions = sc.nextInt();
		sc.nextLine();
		
		Maze newMaze = new Maze(dimensions, sc.nextLine());
		out.println(newMaze);
	}
}
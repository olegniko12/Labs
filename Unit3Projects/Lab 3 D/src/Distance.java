//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Distance
{
	private int xOne,yOne,xTwo,yTwo;
	private double distance;

	public Distance()
	{



	}

	public Distance(int x1, int y1, int x2, int y2)
	{



	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{

		

	}

	public double calcDistance(int x1, int y1, int x2, int y2)
	{
		distance = sqrt( Math.pow((x2-x1), 2) + Math.pow((y2-y1),2) );
		return distance;
	}

	public void print(int x1, int y1, int x2, int y2)
	{
		calcDistance(x1,y1,x2,y2);
		System.out.println(String.format("%.3f", distance));
	}
}
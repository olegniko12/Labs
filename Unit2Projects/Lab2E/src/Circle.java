//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.Math;

public class Circle
{
	private double radius;
	private double area;

	public void setRadius(double rad)
	{
		radius = rad;
	}

	public void calculateArea( )
	{
		area = Math.PI * radius * radius;
		System.out.println(area);
	}

	public void print(double rad)
	{
		setRadius (rad);
		calculateArea();
	}
}
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Line
{
	private int xOne,yOne, xTwo, yTwo;
	private double slope;

	public void CheckLine(int x1, int y1, int x2, int y2)
	{
		setCoordinates(x1, y1, x2, y2);

		print();
	}

	public void setCoordinates(int x1, int y1, int x2, int y2)
	{
		xOne = x1;
		yOne = y1;
		
		xTwo = x2;
		yTwo = y2;
	}

	public double calculateSlope( )
	{			
		slope = (yOne-yTwo)/(xOne-xTwo);
		
		return slope;
	}

	public void print( )
	{
		System.out.println("The slope is: " + calculateSlope());
	}
}
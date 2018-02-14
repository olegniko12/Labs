//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class TriangleThree
{
   private int size;
   private String letter;

	public TriangleThree()
	{
	}

	public TriangleThree(int count, String let)
	{
		setTriangle(let, count);
		triangleManager();
	}

	public void setTriangle( String let, int sz )
	{
		letter = let;
		size = sz;
	}

	public void triangleManager()
	{
		for (int i = 1; i<=size; i++) {
			printTriangle(i);
		}
	}

	public void printTriangle(int n)
	{
		String output="";
		
		for (int i = 0; i<n; i++) {
			
			for (int x = 0; x<n-i; x++) {
				System.out.print("X");
			}
			
			output += letter;
		}
		
		System.out.println(output);
	}
}

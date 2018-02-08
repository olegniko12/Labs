//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Scanner;
import static java.lang.System.*;
import static java.lang.Math.*;

public class Quadratic
{
	private int a, b, c;
	private double rootOne;
	private double rootTwo;

	public Quadratic()
	{
		

	}

	public double Quadratic(int quadA, int quadB, int quadC)
	{
		double root = 0.0;
		
		double discriminant = (quadB^2 - 4*quadA*quadC);
		
		root = (-quadB + sqrt(discriminant))/(quadA*2);
		
		return root;
	}

	public void setEquation(int quadA, int quadB, int quadC)
	{
		a = quadA;
		b = quadB;
		c = quadC;
 	}

	public String calcRoots(int quadA, int quadB, int quadC)
	{
		double discriminant = (quadB^2 - 4*quadA*quadC);
		
		if (discriminant >= 0) {
			rootOne = (-quadB + sqrt(discriminant))/(quadA*2);

			rootTwo = (-quadB - sqrt(discriminant))/(quadA*2);

			return ("\n\nThe answers are:\nRoot One: " + rootOne + "\nRoot Two: " + rootTwo);
		}
		return ("\n\nThe entered integers are unusuable with a quadratic equation");
	}

	public void print(int quadA, int quadB, int quadC)
	{
		System.out.println(calcRoots(quadA, quadB, quadC));
	}
}
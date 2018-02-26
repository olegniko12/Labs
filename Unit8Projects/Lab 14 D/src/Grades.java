//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.lang.System;
import java.lang.Math;
import java.util.Scanner;

public class Grades
{
	float[] gradeArray;

	public Grades() {
		
	}

	public Grades(float[] array) {
		SetArray(array);
		toString();
	}

	public void SetArray(float[] array) {
		gradeArray = array;
	}
	

	private double getSum()
	{
		double sum=0.0;

		for (float f: gradeArray) {
			sum += (double) f;
		}

		return sum;
	}

	public double getAverage()
	{
		double average=0.0;

		average = (getSum()/gradeArray.length);

		return average;
	}


	public String toString() {
		return "The average is approximately " + getAverage();
	}



}
//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Grades
{
	private ArrayList<Double> grades = new ArrayList<Double>();
	
	public Grades()
	{
		setGrades("");
	}
	
	public Grades(String gradeList)
	{
		String[] inputList = gradeList.split("- ");
		String newGrades = inputList[1];
		setGrades(newGrades);		
	}
	
	public void setGrades(String gradeList)
	{
		String[] tempList = gradeList.split(" ");
		
		for (String s: tempList) {
			grades.add(new Double(s).doubleValue());
		}

	}
	
	public double getSum()
	{
		double sum=0.0;

		for (Double d: grades){
			sum += d;
		}

		return sum;
	}
	
	public double getLowGrade()
	{
		double low = Double.MAX_VALUE;

		for (Double d: grades){
			if (d < low) {
				low = d;
			}
		}
		
		return low;
	}
	
	public double getHighGrade()
	{
		double high = Double.MIN_VALUE;

		for (Double d: grades){
			if (d>high){
				high = d;
			}
		}

		return high;
	}
	
	public int getNumGrades()
	{
		return grades.size();
	}
	
	public String toString()
	{
		String output="";

		for (Double d: grades) {
			output += (d + " ");
		}

		return output;
	}	
}
//� A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import java.util.Arrays;
import java.util.ArrayList;
import java.util.Scanner;
import static java.lang.System.*;
import static java.util.Arrays.*;

public class Student
{
	private String myName;
	private ArrayList<Double> grades = new ArrayList<Double>();
	private Grades myGrades;
	
	public Student()
	{
		setName("");
		setGrades("");
	}
	
	public Student(String name, String gradeList)
	{
		setName(name);
		setGrades(gradeList);
		myGrades = new Grades(gradeList);
	}
	
	public void setName(String name)
	{
		myName = name;
	}	
	
	public void setGrades(String gradeList)
	{
		if (!gradeList.equals("")){
			String[] inputList = gradeList.split("- ");
			String newGrades = inputList[1];
			
			String[] tempList = newGrades.split(" ");
			
			for (String s: tempList) {
				grades.add(new Double(s).doubleValue());
			}
		}
		
	}

	public String getName()
	{
		return myName;
	}
	
	public int getNumGrades()
	{
		return myGrades.getNumGrades();
	}

	public double getSum()
	{
		return myGrades.getSum();
	}
	
	public double getAverage()
	{
		return getSum()/getNumGrades();
	}

	public double getAverageMinusLow()
	{
		return ( (getSum() - getLowGrade()) / getNumGrades() );
	}
	
	public double getHighGrade()
	{
		return myGrades.getHighGrade();		
	}
	
	public double getLowGrade()
	{
		return myGrades.getLowGrade();	
	}
	
	public String toString()
	{
		return (myName + " = " + myGrades);
	}
	
	public int compareTo(Student s){
		if(getAverage()==s.getAverage()){
			return 0;
		} else if (getAverage()>s.getAverage()){
			return 1;
		} else {
			return -1;
		}
	}
	
	public boolean equals(Student s){
		if(s.equals(toString())){
			return true;
		} else {
			return false;
		}
	}
	
}
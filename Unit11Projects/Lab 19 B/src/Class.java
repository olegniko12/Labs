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

public class Class
{
	private String name;
	private ArrayList<Student> studentList = new ArrayList<Student>();
	
	public Class()
	{
		name="";
		studentList=new ArrayList<Student>();
	}
	
	public Class(String className, int stuCount)
	{
		name = className;
		studentList = new ArrayList<Student>(stuCount);
	}
	
	public void addStudent(int stuNum, Student s)
	{
		studentList.add(s);
		
	}
	
	public String getClassName()
	{
	   return "";	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;



		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return 0.0;
	}

	public double getStudentAverage(String stuName)
	{



		return 0.0;
	}
	
	public String getStudentName(int stuNum)
	{
		return "";
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		String hName ="";






		return hName;
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		String hName ="";		






		return hName;
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";





		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";




		return output;
	}  	
}
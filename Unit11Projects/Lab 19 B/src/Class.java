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
		studentList.add(stuNum,s);
	}
	
	public String getClassName()
	{
	   return name;	
	}
	
	public double getClassAverage()
	{
		double classAverage=0.0;

		for (Student s: studentList){
			classAverage += s.getAverage();
		}

		classAverage /= studentList.size();
		
		return classAverage;
	}
	
	public double getStudentAverage(int stuNum)
	{
		return (studentList.get(stuNum).getAverage());
	}

	public double getStudentAverage(String stuName)
	{
		Student thisStudent = new Student();
		for (Student s: studentList){
			if (s.getName().equals(stuName)){
				thisStudent = s;
			}
		}
		
		return (thisStudent.getAverage());
	}
	
	public String getStudentName(int stuNum)
	{
		return studentList.get(stuNum).getName();
	}

	public String getStudentWithHighestAverage()
	{
		double high = Double.MIN_VALUE;
		/*
		String hName ="";

		for (Student s: studentList){
			double tempValue = s.getAverage();
			if (tempValue > high){
				high = tempValue;
				hName = s.getName();
			}
		}
		return hName;
		*/
		int index = 0;		

		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).compareTo(studentList.get(i))==0)
			{
				index = i;
			}
		}

		return getStudentName(index);
	}

	public String getStudentWithLowestAverage()
	{
		double low = Double.MAX_VALUE;
		//String hName ="";		

		/*
		for (Student s: studentList){
			double tempValue = s.getAverage();
			if (tempValue < low){
				low = tempValue;
				hName = s.getName();
			}
		}
		*/
		
		int index = 0;
		
		for (int i = 0; i < studentList.size(); i++) {
			if(studentList.get(i).compareTo(studentList.get(i))==1)
			{
				index = i;
			}
		}

		//return hName;
		return getStudentName(index);
	}
	
	public String getFailureList(double failingGrade)
	{
		String output="";

		for (Student s: studentList){
			if (s.getAverage()<failingGrade){
				output += s.getName() + " ";
			}
		}



		return output;
	}
	
	public String toString()
	{
		String output=""+getClassName()+"\n";

		for (Student s: studentList){
			output += s + "    " + s.getAverage() + "\n";	
		}

		return output;
	}  	
	
	public void sort(){
		for (int i = 0; i < studentList.size()-1; i++) {
			for (int x = 0; x < studentList.size()-1; x++) {
				if(studentList.get(x).compareTo(studentList.get(x+1))==1)
				{
					Student tempStudent = studentList.get(x);
					studentList.set(x, studentList.get(x+1));
					studentList.set(x+1, tempStudent);						
				}
			}
		}
	}
}
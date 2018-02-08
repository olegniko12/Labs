//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

import static java.lang.System.*;

public class Name
{
	private String name, firstName, lastName;
	
	

	public Name()
	{
		

	}

	public Name(String s)
	{
		name = s;
	}

    public void setName(String s)
    {
	    name = s;
	    splitName(s);
    }
   
    public void splitName (String s) {
   	   String[] stringArr = s.split(" ");
   	   getFirst(stringArr[0]);
   	   getLast(stringArr[1]);
    }
 
    public String getFirst(String s)
    {
    	firstName = s;
 	    return "";
    }

    public String getLast(String s)
    {
    	lastName = s;
	   return "";
    }

     public String toString()
 	 {
 		return "First name: " + firstName + "\nLast Name: " + lastName;
	 }
}
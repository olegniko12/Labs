//© A+ Computer Science  -  www.apluscompsci.com
//Name -
//Date -
//Class -
//Lab  -

public class Fahrenheit
{
	private double celsius;
	
	public double convertToCel (double far) {
		
		double newFloat = 0f;
		
		newFloat = (far - 32);
		
		newFloat = newFloat * 5/9;
		
		return newFloat;
	}
	
	public void print(double far) {
		celsius = convertToCel(far);
		
		System.out.println(far + " degrees fahrenheit will convert to " + celsius + " degrees in celsius.");
	}
	
	
}
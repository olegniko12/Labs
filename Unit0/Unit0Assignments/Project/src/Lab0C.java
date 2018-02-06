import java.util.Scanner;

public class Lab0C {
	public static void main (String[] args) {
		
		Scanner newInput = new Scanner (System.in);
		
		byte bA, bB;
		System.out.print("\nInput a byte:: ");
		bA = newInput.nextByte();
		System.out.print("\nInput a second byte:: ");
		bB = newInput.nextByte();
		
		short sA, sB;
		System.out.print("\nInput a short: ");
		sA = newInput.nextShort();
		System.out.print("\nInput another short: ");
		sB = newInput.nextShort();
		
		int intA, intB;
		System.out.print("\nPlease input an integer: ");
		intA = newInput.nextInt();
		System.out.print("\nInput a second integer: ");
		intB = newInput.nextInt();
		
		long lA, lB;
		System.out.print("\nPlease input a long: ");
		lA = newInput.nextLong();
		System.out.print("\nPlease input another long: ");
		lB = newInput.nextLong();
		
		float fA, fB;
		System.out.print("\nPlease input a float (with a decimal): ");
		fA = newInput.nextFloat();
		System.out.print("\nPlease input another float (with a decimal): ");
		fB = newInput.nextFloat();
		
		double dA, dB;
		System.out.print("\nPlease input a double: ");
		dA = newInput.nextDouble();
		System.out.print("\nPlease input another double: ");
		dB = newInput.nextDouble();
		
		System.out.println("\nHERE ARE YOUR INPUTS:\n\nBytes:\n"+bA+"\n"+bB);
		System.out.println("\nShorts:\n"+sA+"\n"+sB);
		System.out.println("\nIntegers:\n"+intA+"\n"+intB);
		System.out.println("\nLongs:\n"+lA+"\n"+lB);
		System.out.println("\nFloats:\n"+fA+"\n"+fB);
		System.out.println("\nDoubles:\n"+dA+"\n"+dB);
		
	}

}

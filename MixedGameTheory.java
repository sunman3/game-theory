/***************************************
// MixedGameTheory.java
// By Sungmin An 
// Handles mixed cases in the GameTheory
// program. 
****************************************/
import java.util.Scanner;

public class MixedGameTheory{
	
	/* Instance variables. */
	private double a11;
	private double b11;
	private double a12; 
	private double b12;
	private double a21; 
	private double b21; 
	private double a22;
	private double b22;
	private double p;
	private double q; 
	
	
	public void play(){
		Scanner input = new Scanner(System.in);

		/* Take in user inputs and appropriates them 
		   accordingly.
		*/
		System.out.println("Input the rows, separated by " +
			"commas.");
		System.out.println("Example:");
		System.out.println("_______");
		System.out.println("3,9 1,8");
		System.out.println("0,0 2,1");
		System.out.println("-------");
		String row1 = input.nextLine(); 
		String row2 = input.nextLine(); 

		String[] line = row1.split("\\s+");
		String pairs = line[0];
		String[] elements = pairs.split(",");
		a11 = Integer.parseInt(elements[0]);
		b11 = Integer.parseInt(elements[1]);
	
		pairs = line[1];			
		elements = pairs.split(",");
		a12 = Integer.parseInt(elements[0]);
		b12 = Integer.parseInt(elements[1]);

		line = row2.split("\\s+");	
		pairs = line[0];
		elements = pairs.split(",");
		a21 = Integer.parseInt(elements[0]);
		b21 = Integer.parseInt(elements[1]);

		pairs = line[1];
		elements = pairs.split(",");
		a22 = Integer.parseInt(elements[0]);
		b22 = Integer.parseInt(elements[1]);

		// Strategy of A: Make B indifferent. 
		p = (b22-b21)/(b11-b21-b12+b22);

		// Strategy of B: Make A indifferent. 
		q = (a22-a21)/(a11-a21-a12+a22);
		
		/* Outputs answer */ 
		System.out.println("Nash equilibrium is player A(left)"
			+ " choosing his first choice " + p + " proportion of the time and " +
			" player B(top) choosing his first choice " + q + " proportion of time.");

	}
}

import java.util.Scanner;

public class MixedGameTheory{
	public void play(){
		Scanner input = new Scanner(System.in);

		
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
		double a11 = Integer.parseInt(elements[0]);
		double b11 = Integer.parseInt(elements[1]);
	
		pairs = line[1];			
		elements = pairs.split(",");
		double a12 = Integer.parseInt(elements[0]);
		double b12 = Integer.parseInt(elements[1]);

		line = row2.split("\\s+");	
		pairs = line[0];
		elements = pairs.split(",");
		double a21 = Integer.parseInt(elements[0]);
		double b21 = Integer.parseInt(elements[1]);

		pairs = line[1];
		elements = pairs.split(",");
		double a22 = Integer.parseInt(elements[0]);
		double b22 = Integer.parseInt(elements[1]);

		// Strategy of A: Make B indifferent. 
		double p = (b22-b21)/(b11-b21-b12+b22);

		// Strategy of B: Make A indifferent. 
		double q = (a22-a21)/(a11-a21-a12+a22);

		System.out.println("Nash equilibrium is player A(left)"
			+ " choosing his first choice " + p + " proportion of the time and " +
			" player B(top) choosing his first choice " + q + " proportion of time.");

	}
}
import java.util.Scanner;
import java.util.LinkedList;  

public class PureGameTheory{
	
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
		int a11 = Integer.parseInt(elements[0]);
		int b11 = Integer.parseInt(elements[1]);

		pairs = line[1];			
		elements = pairs.split(",");
		int a12 = Integer.parseInt(elements[0]);
		int b12 = Integer.parseInt(elements[1]);

		line = row2.split("\\s+");
		pairs = line[0];
		elements = pairs.split(",");
		int a21 = Integer.parseInt(elements[0]);
		int b21 = Integer.parseInt(elements[1]);

		pairs = line[1];
		elements = pairs.split(",");
		int a22 = Integer.parseInt(elements[0]);
		int b22 = Integer.parseInt(elements[1]);

		LinkedList<String> result = new LinkedList<>();
		if((a11 == a12) && (a11 == a21) && (a11 == a22) &&
			(b11 == b12) && (b11 == b21) && (b11 == b22)){
			System.out.println("Nash equilibrium is all positions.");
			return; 
		}
		if((a11>a21) && (b11>b12)){
			result.add(a11 + ", " + b11);
		}
		if((a21>a11) && (b21>b22)){
			result.add(a21 + ", " + b21);
		}
		if((a12>a22) && (b12>b11)){
			result.add(a12 + ", " + b12);
		}
		if((a22>a12) && (b22>b21)){
			result.add(a22 + ", " + b22);
		}
		
		if(result.size() != 0){
			for(int i = 0; i < result.size(); i++){
				System.out.println("Nash equilibrium " + (i+1) + ": " 
					+ result.get(i));
			}
		}
		else{
			System.out.println("There ain't no Nash equilibrium in there, yo");
		}
	}
}
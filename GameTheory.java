/********************************************
// GameTheory.java
// By Sungmin An
// Main class for GameTheory Program. 
********************************************/

import java.util.Scanner; 
import java.util.InputMismatchException;

public class GameTheory{
	/* Main Method. */
	public static void main(String[] args){
		/* Asks user whether he/she wants to play pure or mixed case. */
		System.out.println("Which game you want to play?");
		System.out.println("Enter 0 for pure, 1 for mixed");

		Scanner input = new Scanner(System.in); 
		try{
			int which = input.nextInt(); 
			/* If user inputs any number other than 0 or 1, throw custom
			   exception.
			*/
			if(!(which == 0 || which == 1)){
				throw new NonExistantException();
			}
			else{
				if(which == 0){
					PureGameTheory game1 = new PureGameTheory();
					game1.play();
				}
				else{
					MixedGameTheory game2 = new MixedGameTheory();
					game2.play();
				}
			}
		}catch(InputMismatchException e){
			System.out.println("Only enter either 0 or 1");
		}catch(NonExistantException e){
			System.out.println("Give only 0 or 1, dumbass!");
		}catch(ArrayIndexOutOfBoundsException e){
			System.out.println("Input the correct format dumbass");
		}catch(NumberFormatException e){
			System.out.println("Input the correct format dumbass");
		}
	}
}

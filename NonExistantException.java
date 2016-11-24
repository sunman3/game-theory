/*************************************************
// NonExistantException.java
// By Sungmin An
// Custom exception needed by GameTheory.java.
*************************************************/

public class NonExistantException extends Exception{
	
	public NonExistantException(String message){
		super(message);
	}

	public NonExistantException(){
		super();
	}
}

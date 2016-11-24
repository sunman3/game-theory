public class NonExistantException extends Exception{
	
	public NonExistantException(String message){
		super(message);
	}

	public NonExistantException(){
		super();
	}
}
package day4.exceptionhandling.exception;

public class MyCustomException extends Exception {

	
	private String message;
	private Throwable throwable;
	public MyCustomException(String message, Throwable throwable) {
		super();
		this.message = message;
		this.throwable = throwable;
	}
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return "Custom Exception: "+message+" \nThrowable Exception: " +throwable;
	}
	
	

}

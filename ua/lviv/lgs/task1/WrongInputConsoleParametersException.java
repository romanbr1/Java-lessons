package ua.lviv.lgs.task1;

public class WrongInputConsoleParametersException extends Exception {
	private String message;
	
	public WrongInputConsoleParametersException(String amount) {
		super(amount);
		this.message = message;
	}

}

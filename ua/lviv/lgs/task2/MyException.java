package ua.lviv.lgs.task2;

public class MyException extends Exception {
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;

	public MyException(String message) {
		super();
		this.message = message;
	}

	public String toString() {
		return message;
	}
}

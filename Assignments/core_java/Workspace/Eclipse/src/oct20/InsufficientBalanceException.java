package oct20;

public class InsufficientBalanceException extends Exception{
	private String message;
	public InsufficientBalanceException() { this.message = ""; }
	public InsufficientBalanceException(String message) { this.message = message; }
	public String toString() {
	return ("Day should be in between 1 to 31." + this.message);
	}
	}
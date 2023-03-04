package bank;

public class InsufficientBalanceException extends RuntimeException {
	private String message;
	
	InsufficientBalanceException(String message)
	{
		this.message=message;
	}
	public String getMessage()
	{
		return message;
	}
}

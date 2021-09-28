package throwDemo;

public class BalanceInsufficentException extends Exception{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	String message;
	public BalanceInsufficentException(String message) {
		this.message = message;
	}
	
	@Override
	public String getMessage() {
		// TODO Auto-generated method stub
		return this.message;
	}

}

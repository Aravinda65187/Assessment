package Task2;

public class InvalidCardNumber extends Exception {
	
	String cn;
	
	
	public InvalidCardNumber(String cn) {
		
		this.cn = cn;
	}

	
	public String Show() {
		return "Invalid Card Number"+cn;
	}
}



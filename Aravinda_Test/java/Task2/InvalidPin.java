package Task2;

public class InvalidPin extends Exception {
	
	String p;
	
	
	
	public InvalidPin(String p) {
		
		this.p = p;
	}
	
	
	
	
	
	

	public String Show() {
		return "INVALID PIN"+p;
	}
}

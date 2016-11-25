package core.java5;

public class Body {

	private String b;
	
	
	public Body(String b) {
		super();
		this.b = b;
	}


	public Body(){}


	public String getB() {
		return b;
	}


	public void setB(String b) {
		this.b = b;
	}


	@Override
	public String toString() {
		return "Кузов [ тип - " + b + "]";
	}
	
	
	
}

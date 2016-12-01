package core.java8;

public class Body {


	private String b;
	
	private String color;
	
	

	public Body(String b, String color) {
		super();
		this.b = b;
		this.color = color;
	}
	
	public Body(){}
	
	public String getB() {
		return b;
	}

	public void setB(String b) {
		this.b = b;
	}

	public String getColor() {
		return color;
	}

	public void setColor(String color) {
		this.color = color;
	}

	@Override
	public String toString() {
		return "Кузов [ тип = " + b + ", Колір = " + color + "]";
	}
	
	
	
}

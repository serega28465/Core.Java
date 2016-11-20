package core.java1;



public class Rectangle {
	
	
	int width;
	int length;

	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
		System.out.println("Прямокутник створено");
	}

	public void info() {
		System.out.println("Площа прямокутника " + width * length + " cm");
		System.out.println("Периметр прямокутника " + (width+length+width+length) + " cm");
	}

}

package core.java1;



public class Rectangle {
	
	public int count;
	
	public int width;
	public int length;

	//конструктор з параметрами
	public Rectangle(int width, int length) {
		this.width = width;
		this.length = length;
		count++;
		System.out.println("Прямокутник створено");
	}
	
	//конструктор без параметрів
	public Rectangle(){
		count++;
	}
	
	static int rectS(int width, int length){
		return width * length;
	}
	
	static int rectP(int width, int length){
		return width+length+width+length;
	}
	
	
	
	public void info() {
		System.out.println("Площа прямокутника = " + rectS(width,length) + " cm");
		System.out.println("Периметр прямокутника = " + rectP(width,length) + " cm");
	}

}

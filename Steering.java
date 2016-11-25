package core.java5;

public class Steering {
	
	private String s;
	
	private double engine;

	
	public Steering(String s, double engine) {
		this.s = s;
		this.engine = engine;
	}
	
	public Steering(){}
	
	public String getS() {
		return s;
	}



	public void setS(String s) {
		this.s = s;
	}



	public double getEngine() {
		return engine;
	}



	public void setEngine(double engine) {
		this.engine = engine;
	}

	@Override
	public String toString() {
		return "Машина [Марка/модель - " + s + ", двигатель - " + engine + "]";
	}




}

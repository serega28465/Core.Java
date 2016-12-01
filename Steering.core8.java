package core.java8;

public class Steering {
	
	private String s;
	
	private double engine;
	
	private String knop;

	public Steering(String s, double engine, String knop) {
		super();
		this.s = s;
		this.engine = engine;
		this.knop = knop;
	}
	
	Steering(){}

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

	public String getKnop() {
		return knop;
	}

	public void setKnop(String knop) {
		this.knop = knop;
	}

	@Override
	public String toString() {
		return "Марка [ Модель = " + s + ", двигун = " + engine +" л "+ ", Кермо = " + knop
				+ " ]";
	}
	
	
}

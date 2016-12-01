package core.java7;

public class Wheels {
	
	private double w;
	
	
	
	public Wheels(double w) {
		this.w = w;
	}



	public Wheels(){}


	public double bw(){
		return w*2;
	}

	public double getW() {
		return w;
	}



	public void setW(double w) {
		this.w = w;
	}



	@Override
	public String toString() {
		return "Колеса [ діаметр - " + w + " sm ]";
	}
	
	
	
}

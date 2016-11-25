package core.java5;

public class Wheels {
	
	private double w;
	
	
	
	public Wheels(double w) {
		this.w = w;
	}



	public Wheels(){}


	public void bw(){
		w+=0.5;
	}

	public double getW() {
		return w;
	}



	public void setW(double w) {
		this.w = w;
	}



	@Override
	public String toString() {
		return "Колёса [ диаметр - " + w + " см ]";
	}
	
	
	
}

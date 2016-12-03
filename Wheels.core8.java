package core.java8;

public class Wheels {
	
	private double w;
	
	private String z;
	


	public Wheels(double w, String z) {
		super();
		this.w = w;
		this.z = z;
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

	

	public String getZ() {
		return z;
	}


	public void setZ(String z) {
		this.z = z;
	}


	@Override
	public String toString() {
		return "Колеса [ діаметр - " + w + " sm , Резина = " + z + " ]";
	}


	
	
	
	
}

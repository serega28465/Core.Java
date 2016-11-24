package core.java3;

public class MyMath {
	
	public static final double pi = (Math.PI);
	public static final double zps = 21.00;
	public static final double nzp = 24.00;
	public static final double My_Const = 23.00;
	
	public static double mult(double pi, double zps){
		return pi*zps;
	}
	
	public static double sum(double zps, double nzp){
		return zps+nzp;
	}
	public static double div(double nzp, double My_Const){
		return nzp/My_Const;
	}
	public static double min(double My_Const, double pi){
		return My_Const-pi;
	}
	
	public static void main (String[] args){
		System.out.println(mult(pi,zps));
		System.out.println(sum(zps,nzp));
		System.out.println(div(nzp,My_Const));
		System.out.println(min(nzp,zps));
	}
}

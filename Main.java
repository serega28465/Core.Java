package core.java5;

public class Main {

	public static void main(String[] args) {
		Car car = new Car(new Steering("���-2106",1.6), new Wheels(36.6), new Body("�����"));
		System.out.println(car);
		car.bw();
		System.out.println(car);
	}

}

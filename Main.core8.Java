package core.java7;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List <Car> cars = new ArrayList<Car>();
		cars.add(new Car(new Steering(" Daewoo Lanos ", 1.6, " має кнопочки :)" ),
				new Wheels(36.0), new Body("Sedan", "Red")));
		cars.add(new Car(new Steering(" Ford Fiesta ", 1.6, " не має кнопочок :(" ),
				new Wheels(35.0), new Body("Hachback", "Синій")));
		cars.add(new Car(new Steering(" Mersedes ", 2.0, " має кнопочки :)" ),
				new Wheels(37.0), new Body("Sedan", "Red")));
		cars.add(new Car(new Steering(" BMW X5 ", 3.4, " має кнопочки :)" ),
				new Wheels(39.0), new Body("Hachback", "Black")));
		cars.add(new Car(new Steering(" Wolkswagen ", 1.8, " не має кнопочок :(" ),
				new Wheels(33.0), new Body("Sedan", "Зелений")));
		cars.add( new Car(new Steering(" Chery ", 1.4, " не має кнопочок :(" ),
				new Wheels(34.0), new Body("Sedan", "Жовтий")));
		
		while(true){
			System.out.println("Натисніть 1, щоб Знайти машини, які мають введений діаметр коліс.");
			System.out.println("Натисніть 2, щоб Знайти машини, які мають введений діаметр коліс та колір кузова.");
			System.out.println("Натисніть 3, щоб Замінити в усіх машинах, які мають червоний колір кузова, кермо на інше.");
			System.out.println("Натисніть 4, щоб Збільшити діаметр коліс вдвічі, якщо кермо має кнопочки.");
			System.out.println("Натисніть 5, щоб Замінити усі машини, які мають колеса діаметром менші за введене значення, на інші машини.");
			System.out.println("Вийти Натисніть 0");
			
			switch(sc.next()){
			
			case"1":{
				System.out.println("Введіть діаметр коліс");
				double diam =(double) sc.nextInt();
					
				for (Car car : cars) {
					
					if(car.getWheels().getW() == diam){
						System.out.println(car);
						}
					}
					break;
				
			/*	for (Car car : cars) {
					System.out.println(car);
				}
			*/	
			}
			case"2":{
				System.out.println("Введіть діаметр коліс");
				double diam =(double) sc.nextInt();
				System.out.println("Enter body color");
				String c = sc.next();
				for (Car car : cars) {
							
				if(car.getBody().getColor().equalsIgnoreCase(c)){
					System.out.println(car);
					}
				}
				break;
			}
			case"3":{
				
				for (Car car : cars) {
							
				if(car.getBody().getColor().equalsIgnoreCase("red")){
					car.getSteering().setKnop("Файне кермо");
					
					System.out.println(car);
					}
				}
				break;
			}
			case"4":{
				for (Car car : cars) {
		
					if(car.getSteering().getKnop().contains("має кнопочки :)")){
						car.getWheels().setW(car.getWheels().bw());
						System.out.println(car);
						}
					}
				break;
			}
			case"5":{
				System.out.println("Введіть діаметр коліс");
				double diam =(double) sc.nextInt();
					
				for (Car car : cars) {
						if(car.getWheels().getW() < diam){
							cars.remove(car);
							cars.add( new Car(new Steering(" Mazda ", 2.4, " Офігенне кермо з кнопочками" ),
									new Wheels(33.0), new Body("Roadstar", "Yellow")));
							System.out.println(car);
							}
					
					}
				break;
			}
			
			default:{
				System.exit(0);
			}
			}
		}
		
		//car.bw();
		//System.out.println(car);
	}

}

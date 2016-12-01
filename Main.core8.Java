package core.java8;



import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List <Car> cars = new ArrayList<Car>();
		cars.add(new Car(new Steering(" Daewoo Lanos ", 1.6, " має кнопочки :)" ),
				new Wheels(36.6), new Body("Sedan", "Червоний")));
		cars.add(new Car(new Steering(" Ford Fiesta ", 1.6, " не має кнопочок :(" ),
				new Wheels(35.0), new Body("Hachback", "Синій")));
		cars.add(new Car(new Steering(" Mersedes ", 2.0, " має кнопочки :)" ),
				new Wheels(37.4), new Body("Sedan", "Білий")));
		cars.add(new Car(new Steering(" BMW X5 ", 3.4, " має кнопочки :)" ),
				new Wheels(39.9), new Body("Hachback", "Чорний")));
		cars.add(new Car(new Steering(" Wolkswagen ", 1.8, " не має кнопочок :(" ),
				new Wheels(33.0), new Body("Sedan", "Зелений")));
		cars.add( new Car(new Steering(" Chery ", 1.4, " не має кнопочок :(" ),
				new Wheels(34.5), new Body("Sedan", "Жовтий")));
		
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
				double diam = sc.nextDouble();
				
				
			/*	for (Car car : cars) {
					System.out.println(car);
				}
			*/	
				break;
			}
			case"2":{
				break;
			}
			case"3":{
				break;
			}
			case"4":{
				break;
			}
			case"5":{
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

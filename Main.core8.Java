package core.java8;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		List <Car> cars = new ArrayList<Car>();
		cars.add(new Car(new Steering(" Daewoo Lanos ", 1.6, " має кнопочки :)", 40.0 ),
				new Wheels(36.0, " Літня"), new Body("Sedan", "Red")));
		cars.add(new Car(new Steering(" Ford Fiesta ", 1.6, " не має кнопочок :(", 41.0 ),
				new Wheels(35.0, "  Літня"), new Body("Hachback", "Синій")));
		cars.add(new Car(new Steering(" Mersedes ", 2.0, " має кнопочки :)" , 44.0),
				new Wheels(37.0, "  Літня"), new Body("Sedan", "Red")));
		cars.add(new Car(new Steering(" BMW X5 ", 3.4, " має кнопочки :)" , 45.0),
				new Wheels(39.0, "  Літня"), new Body("Hachback", "Black")));
		cars.add(new Car(new Steering(" Wolkswagen ", 1.8, " не має кнопочок :(" , 42.0),
				new Wheels(33.0, "  Літня"), new Body("Sedan", "Зелений")));
		cars.add( new Car(new Steering(" Chery ", 1.4, " не має кнопочок :(" , 43.0),
				new Wheels(34.0, "  Літня"), new Body("Sedan", "Жовтий")));
		
		while(true){
			System.out.println("Натисніть 1, щоб Знайти машини, які мають введений діаметр коліс.");
			System.out.println("Натисніть 2, щоб Знайти машини, які мають введений діаметр коліс та колір кузова.");
			System.out.println("Натисніть 3, щоб Замінити в усіх машинах, які мають червоний колір кузова, кермо на інше.");
			System.out.println("Натисніть 4, щоб Збільшити діаметр коліс вдвічі, якщо кермо має кнопочки.");
			System.out.println("Натисніть 5, щоб Замінити усі машини, які мають колеса діаметром менші за введене значення, на інші машини.");
			System.out.println("Натисніть 6, щоб Знайти машини, які використовують введений тип кузова");
			System.out.println("Натисніть 7, щоб Видалити з ліста усі машини, які мають введений колір кузова.");
			System.out.println("Натисніть 8, щоб Замінити усім машинам, діаметр коліс яких лежить у введеному діапазоні шини на зимові.");
			System.out.println("Натисніть 9, щоб Видалити усі машини, які мають введений тип кузова та введений діапазон діаметра керма.");
			System.out.println("Введіть 10, щоб Запам'ятати індекси машин, які мають введений тип кузова.");
			System.out.println("Вийти Натисніть 0");
			
			Iterator<Car> iter = cars.iterator();
			
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
					
				while(iter.hasNext()){
					Car tmp = iter.next();
					if(diam > tmp.getWheels().getW()){
						cars.remove(cars.contains(tmp));
						cars.add(new Car(new Steering(" Mazda - RX8 ", 2.4, " Має дуже файне кермо :)", 40.0 ),
				new Wheels(34.0, " Зимова"), new Body("Roadstar", "Red")));
					}
						
				}
				System.out.println(cars);
				break;
			}
			case"6":{
				System.out.println("Введіть тип кузова");
				String bodytype = sc.next();
				
				while(iter.hasNext()){
					Car tmp = iter.next();
					if(tmp.getBody().getB().equals(bodytype)){
						System.out.println(iter.next());
					}
					
				}
				
				break;
			}
			case"7":{
				System.out.println("Введіть колір кузова");
				String bodycolor = sc.next();
				
				while(iter.hasNext()){
					Car tmp = iter.next();
					if(tmp.getBody().getColor().contains(bodycolor)){
						iter.remove();
						System.out.println(cars);
						
					}
					
				}
				break;
			}
			case"8":{
				System.out.println("Enter min");
				int wmin = sc.nextInt();
				System.out.println("Enter max");
				int wmax = sc.nextInt();
				
			for (Car car : cars) {
				if(car.getWheels().getW()>wmin && car.getWheels().getW()<wmax){
					car.getWheels().setZ(" Зимова");
					System.out.println(car);
				}
			}
				
			break;
					
			}
			
			case "9":{
				System.out.println("Введіть  мінімальний діапазон керма");
				int wmin = sc.nextInt();
				System.out.println("Введіть  максимальний діапазон керма");
				int wmax = sc.nextInt();
				System.out.println("Введіть тип кузова");
				String bodytype = sc.next();
				
				while(iter.hasNext()){
					Car tmp = iter.next(); 
					if(tmp.getBody().getB().equals(bodytype) && tmp.getSteering().getDia()>=wmin && tmp.getSteering().getDia()<=wmax){
						
						iter.remove();
						
						
					}
					
				}
				System.out.println(cars);
				break;
			}
			case "10":{
				System.out.println("Введіть тип кузова");
				String bt = sc.next();
				
				List<Car> listcar = new ArrayList<Car>();
				
				while(iter.hasNext()){
					Car tmp = iter.next();
					if(tmp.getBody().getB().equalsIgnoreCase(bt)){
						listcar.add(tmp);
					}
				}
				System.out.println(listcar);
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

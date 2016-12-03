package core.lesson7;

import core.lesson6.Gender;
import core.lesson6.Person;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Main2 {

	public static void main(String[] args) {

		List<Person> person = new ArrayList<>();
		person.add(new Person (18, "Ivan", Gender.MALE));
		person.add(new Person (19, "Olena", Gender.FEMALE));
		person.add(new Person (20, "Mykola", Gender.MALE));
		person.add(new Person (18, "Ivan", Gender.MALE));
		
		
		Scanner sc = new Scanner(System.in);

		
		while (true) {
			System.out.println("Щоб створити person, натисніть 1");
			System.out.println("Щоб вивести 2");
			System.out.println("Щоб вийти 0");
			System.out.println("Enter 7 to clear from duplicate");
			
			Iterator<Person> iter = person.iterator();
			
			switch (sc.next()) {
			
			case "1":
				System.out.println("Enter name");
				System.out.println("Name");
				String name = sc.next();
				System.out.println("Age");
				int age = sc.nextInt();
				Gender gender = sc.nextInt() == 1 ? Gender.MALE : Gender.FEMALE;
				person.add(new Person(age, name, gender));
				break;
			case "2":
				person.forEach(System.out::println);
				break;
			case "3":
				System.out.println("Enter max age");
				int max = sc.nextInt();
				System.out.println("Enter min age");
				int min = sc.nextInt();
				person.stream()
				.filter((p)->p.getAge()<max)
				.filter((p)-> p.getAge()>min)
				.forEach(System.out::println);
				break;
			case "4":
				System.out.println("Enter age for delete");
				int ad = sc.nextInt();
				if(iter.next().getAge() == ad){
					iter.remove();
					person.forEach(System.out::println);
				}
				break;
			case"5":
				System.out.println("Enter first litera");
				String lit = sc.next();
				iter = person.iterator();
				while(iter.hasNext()){
					Person tmp = iter.next();
					if(tmp.getName().startsWith(lit)){
						iter.remove();
					}
					person.forEach(System.out::println);
				}
				break;
			case"7":
				for (int i = 0; i < person.size(); i++) {
					for (int j = 0; j < person.size(); j++) {
						if(person.get(i).equals(person.get(j))&&i!=j){
							System.out.println(person.get(j) + " " + j);
							System.out.println("Found");
							person.remove(j);
						}
					}
				}
				
				//Set<Person> set = new HashSet<>(persons);
				//persons = new ArrayList<>(set);	
				
				//persons = persons.stream
				//.collect(Collectors.to Set)...
					person.forEach(System.out::println);
					System.exit(0);
				}
				
				break;
			
			

			// Person person = new Person (18, "Ivan", Gender.MALE);
			// Gender gender = Gender.MALE;

			// System.out.println(person);

		}
	}
	
}

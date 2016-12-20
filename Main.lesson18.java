package core.lesson18;

import java.util.ArrayList;
import java.util.List;

import core.lesson14.Gender;
import core.lesson14.Person;
import core.lesson14.Person.Pet;

public class Main {

	public static void main(String[] args) {
		print((int i) -> true);
		System.out.println();	
		print(Main::divBy2);
		System.out.println();
		print((int i) ->i % 3 == 0);
		System.out.println();
		
		List<Person> list = new ArrayList<>();
		list.add(new Person.Builder()
		.pet("Grkewjns").pet("Lskjndfksjnf")
		.pet("Fsldnf").build());
		
		int sum = list.stream()
		.filter((person)->person
		.getPets().size()>=3)
		.map(Person::getPets)
		.flatMap(List::stream)
		.map(Pet::getName)
		.filter(str->str.length()>=10)
		.flatMapToInt(String::chars)
		.reduce(0, Integer::sum);
		System.out.println(list);
		int sum2 = 0;
		for (Person person : list) {
			if(person.getPets().size()>=3){
				for(Pet pet : person.getPets()){
					if(pet.getName().length()>=10){
						for(char ch : pet.getName().toCharArray()){
							sum2+=ch;
						}
					}
				}
			}
		}
		System.out.println(sum+" "+sum2);
	}
	
	
	static boolean divBy2(int i){
		return i % 2 == 0;
	}

	static void print(Filter filter) {
		for (int i = 1; i <= 10; i++) {
			if (filter.accept(i))
				System.out.print(i + " ");

		}
	}

}

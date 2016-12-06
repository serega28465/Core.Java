package core.lesson10;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Controller {
	
	private final List<Person> persons = new ArrayList<>();
	
	//inicialization block
	{
		persons.add(new Person(18, "Ivan", Gender.MALE));
		persons.add(new Person(23, "Mykola", Gender.MALE));
		persons.add(new Person(28, "Petro", Gender.MALE));
		persons.add(new Person(25, "Sergiy", Gender.MALE));
		persons.add(new Person(17, "Artem", Gender.MALE));
		persons.add(new Person(18, "Oksana", Gender.FEMALE));
		persons.add(new Person(23, "Galyna", Gender.FEMALE));
		persons.add(new Person(26, "Irina", Gender.FEMALE));
		persons.add(new Person(21, "Tetyana", Gender.FEMALE));
		persons.add(new Person(25, "Ulia", Gender.FEMALE));
		//contructor for add persons
	}
	
	public List<Person> sortByNameASC(){
	//	List<Person> list = new ArrayList<>(persons);
	//	list.sort(null);
		return persons.stream().sorted().collect(Collectors.toList());
	}

	public List<Person> sortByNameDESC(){
		List<Person> list = new ArrayList<>(persons);
		list.sort(new PersonComparatorByNameDESC());
		return list;
	}
	
	public Stream<Person> sortByAgeASC(){
	return persons.stream().sorted(Comparator.comparing(Person::getAge));
	}
	
	public Stream<Person> sortByAgeDESC(){
		return persons.stream().sorted(Comparator.comparing(Person::getAge).reversed());
		}
	public Stream<Person> sortByGenderASC(){
		return persons.stream().sorted(Comparator.comparing(Person::getGender));
		}

	public Stream<Person> sortByGenderDESC(){
		return persons.stream().sorted(Comparator.comparing(Person::getGender));
	}
	public Stream<Person> sortAllFieldByDESC(){
		return persons.stream().sorted(Comparator.comparing(Person::getName).reversed()
				.thenComparing(Comparator.comparing(Person::getAge).reversed())
				.thenComparing(Comparator.comparing(Person::getGender).reversed()));
	}
	public Stream<Person> sortAllFieldByASC(){
		return persons.stream().sorted((o1 , o2)->o1.getName().compareTo(o2.getName()));
	}
	public List<Person> getPersons() {
		return persons;
	}
	
	
}

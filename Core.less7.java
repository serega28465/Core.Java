package core.lesson9;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

import core.lesson6.Gender;
import core.lesson6.Person;

public class Main {

	public static void main(String[] args) {
		Set<Person> persons = new HashSet<>();
		persons.add(new Person(18, "Ivan", Gender.MALE));
		persons.add(new Person(25, "Petro", Gender.MALE));
		persons.add(new Person(30, "Mykola", Gender.MALE));
		System.out.println(persons);
		persons.add(new Person(30, "Mykola", Gender.MALE));
		System.out.println(persons);
		Set<String> set = new TreeSet<>();
		set.add("Ivan");
		set.add("Petro");
		set.add("Mykola");
		System.out.println(" ");
		System.out.println(set);
	}

}

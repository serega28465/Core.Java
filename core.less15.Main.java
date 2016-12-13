package core.lesson15;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import core.lesson4.Circle;
import core.lesson4.Geometric;
import core.lesson4.Rectangle;

public class Main {

	public static void main(String[] args) {
		MyArrayList<String> list = new MyArrayList();
		list.add("Ivan");
		list.add("Petro");
		list.add("Mykola");
		System.out.println(list);
		for (Object object : list) {
			System.out.println(object);
		}
		List<Geometric> list2 = new ArrayList<>(Arrays.asList(new Rectangle(4, 5), new Circle(5)));
		print(Arrays.asList(new Rectangle(4, 5), new Circle(5)));
	}
	
	static void print(Iterable<? extends Geometric> list){
		for (Geometric geometric : list) {
			geometric.print();
		}
	}
	
	
}

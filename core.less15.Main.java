package core.lesson15;

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

	}

}

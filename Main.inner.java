package core.nasted;

import core.nasted.Collection.ToLast;




public class Main {

	public static void main(String[] args) {
		Collection collection = new Collection();
		collection.add();
		Collection.ToLast tola = collection.new ToLast();
		while(tola.hasNext()){
			
		collection.equals(tola.next());
		}
		System.out.println(collection);
		System.out.println();
		
		//Collection collection2 = new Collection();
		collection.add();
		Collection.ToFirst tofi = collection.new ToFirst();
		int count = 0;
		while(tofi.hasNext()){
			
			count++;
			collection.equals(tofi.next());	
			
		}
		System.out.println(collection);
		
		Collection.local(1, 1);
	}
}

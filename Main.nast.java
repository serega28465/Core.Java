package core.nasted;

import core.nasted.Collection.Nasted;
import core.nasted.Collection.ToLast;

public class Main {

	public static void main(String[] args) {
		Collection collection = new Collection();
		collection.add();
		Collection.ToLast tola = collection.new ToLast();
		while(tola.hasNext()){
			
		collection.equals(tola.next());
		}
		//from first to last
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
		//from last to first
		System.out.println(collection);
		System.out.println();
		
		//local class
		collection.local();
		System.out.println(collection);
		System.out.println();
		
		//Nasted class
		Collection.Nasted nas = new Nasted();
		nas.per(args);
		System.out.println(nas);
		
		//Anonimous class
		collection.anonymous();
		System.out.println(collection);
	}
}

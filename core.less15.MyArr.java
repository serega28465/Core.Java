package core.lesson15;

import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;

public class MyArrayList<T extends Serializable> implements Iterable<T>, Serializable{

	private static final long serialVersionUID = 3292773393176566033L;
	private Object[] array = new Object[4];
	private int size = 0;
	
	public void add(Object e){
		if(array.length-1==size) increase();
		for (int i = 0; i < array.length; i++) {
			if(array[i]==null){
				array[i] = e;
				size++;
				break;
			}
		}
	}
	
	private void increase(){
		Object[] tmp = array;
		array = new Object[tmp.length*3/2+1];
		for (int i = 0; i < tmp.length; i++) {
			array[i] = tmp[i];
		}
	}

	
	
	public String toString() {
		return Arrays.toString(array) + " " + size;
	}

	@Override
	public Iterator<T> iterator() {
		
		return new Iterator<T>(){
			int index = 0;
			@Override
			public boolean hasNext() {
				
				return index<size;
			}

			@Override
			public T next() {
				
				return(T) array[index++];
			}};
	}
	
}

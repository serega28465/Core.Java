package core.nasted;

import java.util.Arrays;

public class Collection {

	private Object[] array = new Object[12];
	int size = 0;
	
	public Collection(Object[] array) {
		this.array = array;
	}

	public Collection() {
		// TODO Auto-generated constructor stub
	}

	public <T> void add(T e){
		if(array.length-1==size) increase();
		for (int i = 0; i < array.length; i++) {
			if(i%2!=0)array[i]=0;
			
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
	
	public String toString(){
		return Arrays.toString(array)+" "+size;
	}
	
	public class ToLast implements Iterator{
		int index = 0;
		@Override
		public boolean hasNext() {
			
			return index<size;
		}

		@Override
		public int next() {
			
			return (int) array[index++];
		}

		
	}
	
//	public class ToFirst implements Iterator{

	//	@Override
	//	public boolean hasNext() {
	//		// TODO Auto-generated method stub
	//		return false;
	//	}

//		@Override
//		public int next() {
			// TODO Auto-generated method stub
//			return ;
	//	}

				
//	}
	
}

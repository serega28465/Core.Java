package core.nasted;

import java.util.Arrays;

import javax.swing.text.StyledEditorKit.ForegroundAction;

public class Collection {

	private static ToFirst ToFirst;
	static Object[] array = new Object[12];
	int size = 12;
	public Collection(Object[] object) {
		super();
		this.array = object;
	}

	public Object[] getObject() {
		return array;
	}

	public void setObject(Object[] object) {
		this.array = object;
	}

	
	
	public Collection(){}
	
	public void add(){
		for (int i = 0; i < array.length; i++) {
			array[i]=(int)(Math.round(Math.random()*7)-1);
		}
	}
	

	@Override
	public String toString() {
		return "Collection [object=" + Arrays.toString(array) + "]";
	}

	/////////////
	//ToLAST
	////////////
	public class ToLast implements Iterator{
		int index = 0;
		Object object = array[index];
		

		public void add(){
			for (int i = 0; i < array.length; i++) {
				array[i]=(int)(Math.round(Math.random()*7)-1);
			}
		}
		
		@Override
		public boolean hasNext() {
			
			return size>index;
		}

		@Override
		public int next() {
			if(index%2!=0)array[index]=0;
			return (int)array[index++];
		}
		void display(){
			System.out.println(array);
		}
		
		@Override
		public String toString() {
			return "ToLast [size=" + size + "]";
		}

		private Collection getOuterType() {
			return Collection.this;
		}
	}
	///////////
	/////to First
	public class ToFirst implements Iterator{
		int index = array.length;
		
		public int getIndex() {
			return index;
		}

		public void setIndex(int index) {
			this.index = index;
		}
		
		
		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + index;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			ToFirst other = (ToFirst) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (index != other.index)
				return false;
			return true;
		}

		@Override
		public String toString() {
			return "ToFirst [index=" + index + "]";
		}

		@Override
		public boolean hasNext() {
			return index<size;
		}

		@Override
		public int next() {
			if(index%2==0)array[index]=0;
			return (int)array[index--];
		}

		private Collection getOuterType() {
			return Collection.this;
		}
		
	}
	
	public static void local(int a1,int a2){
		class Local implements Iterator{
			int index = 12;
			@Override
			public boolean hasNext() {
				
				return index>0;
			}

			@Override
			public int next() {
				if(index%3==0){
					for (int i = 0; i < array.length; i++) {
						if(array.equals(2)){
							System.out.println(array);
						}
					}
				}
				return (int)array[index--];
			}
		
		}
	}
//	Прогнати від останнього до першого елементу масиву. 
//	Перевірити кожен третій елемент масиву від останнього чи він непарний, 
//	якщо так то вивести дані елементи на консоль.

	//Collection(int size){
		
		
	//}
	

	//public static void main(String[] args){
	//	new Collection(12);
		//Collection collection = new Collection();
		//Collection.ToFirst = collection.new ToFirst();
		//for (int i = 0; i < 12; i++) {
		//	if(Collection.ToFirst.getIndex()==3&&Collection.ToFirst.next()%2==0){
		//		System.out.println(collection);
		//	}
		//}		
	//	} 
}

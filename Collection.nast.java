package core.nasted;

import java.util.Arrays;

public class Collection {

	Object[] array = new Object[12];
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

	public Collection() {
	}

	public void add() {
		for (int i = 0; i < array.length; i++) {
			array[i] = (int) (Math.round(Math.random() * 7) - 1);
		}
	}

	@Override
	public String toString() {
		return "Collection [object=" + Arrays.toString(array) + "]";
	}

	// ///////////
	// ToLAST
	// //////////
	public class ToLast implements Iterator {
		int index = 0;
		Object object = array[index];

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + getOuterType().hashCode();
			result = prime * result + index;
			result = prime * result
					+ ((object == null) ? 0 : object.hashCode());
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
			ToLast other = (ToLast) obj;
			if (!getOuterType().equals(other.getOuterType()))
				return false;
			if (index != other.index)
				return false;
			if (object == null) {
				if (other.object != null)
					return false;
			} else if (!object.equals(other.object))
				return false;
			return true;
		}

		@Override
		public boolean hasNext() {

			return size > index;
		}

		@Override
		public int next() {
			if (index % 2 != 0)
				array[index] = 0;
			return (int) array[index++];
		}

		void display() {
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

	// /////////
	// ///to First
	public class ToFirst implements Iterator {
		int index = array.length - 1;

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
			return index >= 0;
		}

		@Override
		public int next() {
			if (index % 2 == 0)
				array[index] = 0;
			return (int) array[index--];
		}

		private Collection getOuterType() {
			return Collection.this;
		}

	}

	// /////////////
	// local class
	// //////////////
	public void local() {
		class Local {
			Object[] array = new Object[12];
		}

		for (int i = 1; i < array.length + 1; i++) {

			if (i % 5 == 0) {
				if ((int) array[i] % 2 == 0) {
					array[i] = (int) array[i] - 100;
				}
			}
		}

	}

	// ////////////////////
	// Static Nasted Class
	// //////////////////
	static class Nasted {

		void per(Object[] array) {
			for (int i = 0; i < array.length; i++) {
				array[i]=(int)array[i];
				if (i % 2 == 0) {
					array[i] = (int) array[i] - 1;
				}
			}
		}

	}

	// Створити анонімний клас який повинен :
	// Прогнати від останнього до першого елементу масиву.
	// Перевірити кожен третій елемент масиву від останнього чи він непарний,
	// якщо так то вивести дані елементи на консоль.



	// }

}

package core.serialize;

import java.io.Serializable;

public class Counter implements Serializable{
	private int value;
	private String name;
	public Counter(int value, String name) {
		this.value = value;
		this.name = name;
	}
	@Override
	public String toString() {
		return "Counter [value=" + value + ", name=" + name + "]";
	}
	
	
}

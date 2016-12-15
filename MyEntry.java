package core.generic;

public class MyEntry<K,V> {

	K key;
	V val;
	public MyEntry(K key, V val) {
		super();
		this.key = key;
		this.val = val;
	}
	public K getKey() {
		return key;
	}
	public void setKey(K key) {
		this.key = key;
	}
	public V getVal() {
		return val;
	}
	public void setVal(V val) {
		this.val = val;
	}
	@Override
	public String toString() {
		return "MyEntry [key=" + key + ", val=" + val + "]";
	}
	
	
}

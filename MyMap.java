package core.generic;

import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;

public class MyMap<K,V>{
	
	Set<MyEntry<K,V>> set;
	K key;
	V val;
	public Set<MyEntry<K, V>> getSet() {
		return set;
	}

	public void setSet(Set<MyEntry<K, V>> set) {
		this.set = set;
	}

	@Override
	public String toString() {
		return "MyMap [set=" + set + "]";
	}

	public void add(){
		set.add(new MyEntry<K,V>(key, val));
		System.out.println(set);
	}
	public void delByKey(K key){
		Iterator<MyEntry<K, V>> it = set.iterator();
		while (it.hasNext()) {
			if (it.next().getKey().equals(key)) {
				it.remove();
				break;
			}
		}
	}
	public void delByVal(V val) {
		Iterator<MyEntry<K, V>> it = set.iterator();
		while (it.hasNext()) {
			if (it.next().getVal().equals(val)) {
				it.remove();
				break;
			}
		}
	}
	public Set<MyEntry<K,V>> keySet() {
		Set<MyEntry<K,V>> keySet = new HashSet<MyEntry<K,V>>();
		Iterator<MyEntry<K, V>> it = set.iterator();
		while (it.hasNext()) {
			keySet.add((MyEntry<K, V>) it.next().getKey());
			
		}
 
		return keySet;
 
	}
 
	public List<Object> valueSet() {
		List<Object> valueSet = new ArrayList<Object>();
		Iterator<MyEntry<K, V>> iter = set.iterator();
		while (iter.hasNext()) {
			valueSet.add(iter.next().getVal());
		}
 
		return valueSet;
 
	}
	public void keyValSet(){
		Set<MyEntry<K,V>> keySet = new HashSet<MyEntry<K,V>>();
		List<Object> valueSet = new ArrayList<Object>();
		Iterator<MyEntry<K, V>> it = set.iterator();
		Iterator<MyEntry<K, V>> iter = set.iterator();
		while (it.hasNext()) {
			keySet.add((MyEntry<K, V>) it.next().getKey());
			valueSet.add(iter.next().getVal());
			System.out.println(keySet+ " " + valueSet);
		}
		
		
	}
}

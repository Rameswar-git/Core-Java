package CompleteInterview.vendingmechine;

import java.util.HashMap;
import java.util.Map;

public class Inventory<T> {

	private Map<T, Integer> inventory = new HashMap<>();

	public void additem(T item2) {
		Integer count =inventory.get(item2);
		inventory.put(item2, count + 1);
	}
	
	public void deductitem(T item3) {
		if(inventory.get(item3) > 0) {
			inventory.put(item3, inventory.get(item3)-1);
		}
	}
	
	public boolean hasitem(T item) {
		return inventory.get(item) > 0;
	}
	
	public void put(T it,Integer value) {
		inventory.put(it, value);
	}

}

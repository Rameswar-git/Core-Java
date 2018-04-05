package Synchronize;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8MapToString {

	public static void main(String[] args) {
		
		Map<Integer,String> fruits=new HashMap<Integer,String>();
		
		fruits.put(1, "Apple");
		fruits.put(9, "Banana");
		fruits.put(2, "Mango");
		fruits.put(3, "Banana");	
		fruits.put(5, "Sepata");
		fruits.put(6, "Papaya");
		fruits.put(7, "Grape");
		fruits.put(8, "Pomegranate");
		fruits.put(4, "Orange");
	
		
		List<Integer>keys=fruits.keySet().stream().collect(Collectors.toList());
		
//		System.out.println(keys);
		
		List<String> values=fruits.values().stream().distinct().collect(Collectors.toList());
		
//		System.out.println(values);
		
		List<String> filted=fruits.values().stream().filter(x->!x.equals("Banana")).collect(Collectors.toList());

		
//		System.out.println(filted);
		
		
		List<Integer> resultSortedKey = new ArrayList<Integer>();
		
		List<String> resultValues =fruits.entrySet().stream()
				.sorted(Map.Entry.<Integer,String>comparingByKey())
				.peek(e->resultSortedKey.add(e.getKey()))
						.map(x->x.getValue()).filter(x -> !"Banana".equalsIgnoreCase(x)).collect(Collectors.toList());
				
        resultSortedKey.forEach(System.out::println);
        resultValues.forEach(System.out::println);		
				
	}

}

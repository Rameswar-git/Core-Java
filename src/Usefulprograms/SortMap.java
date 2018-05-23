package Usefulprograms;

import java.util.Collections;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class SortMap {
	
	public static void main(String[] args) {
		
		Map<String,Integer> unsortedmap=new HashMap<>();		
		unsortedmap.put("A", 20);		
		unsortedmap.put("N", 80);
		unsortedmap.put("K", 99);
		unsortedmap.put("G", 425);		
		unsortedmap.put("T", 4523);
		unsortedmap.put("B", 4753);
		unsortedmap.put("Z", 78);
		unsortedmap.put("H", 05);
		unsortedmap.put("L", 7483);
		unsortedmap.put("P", 24);
		
		Map<String, Integer> result2 = new LinkedHashMap<>();
		
		
		unsortedmap.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByKey()).
		forEachOrdered(x->result2.put(x.getKey(), x.getValue()));
		
		
		System.out.println(result2);
		
		
	}

}

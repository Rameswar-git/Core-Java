package Usefulprograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8MapSort {
	 
	 public static void main(String[] args) {

		 List<String> fruits=Arrays.asList("apple","apple","orange",
				 "banana","mango","mango");
		 
		 Map<String,Long> result=fruits.stream()
				 .collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 
		 System.out.println("Before sorting The elements Of map");
		 
		 System.out.println(result);
		 
		 
		 Map<String, Long> finalMap = new LinkedHashMap<>();
		 
		 result.entrySet().stream().sorted(Map.Entry.<String,Long>comparingByValue()
				 .reversed()).forEachOrdered(e->finalMap.put(e.getKey(),e.getValue()));
		 
		   System.out.println("After Sorting The Elements Of Array");
		 
		 System.out.println(result);
		 
	}

}

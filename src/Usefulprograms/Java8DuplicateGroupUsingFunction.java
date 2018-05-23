package Usefulprograms;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8DuplicateGroupUsingFunction {

	public static void main(String[] args) {
		
		List<String> Fruits=Arrays.
				asList("Apple","Apple","Orange","Babana","Orange");
		
		Map<String,Long> result=Fruits.stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		
		
		 Map<String, Long> finalMap = new LinkedHashMap<>();
		
		
		result.entrySet().stream()
		.sorted(Map.Entry.<String,Long>comparingByValue().reversed()).forEachOrdered(x->finalMap.put(x.getKey(), x.getValue()));
		
		System.out.println("After Sorting the array");
		
		System.out.println(finalMap);

	}

}

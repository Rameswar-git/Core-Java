package com.tst.program2;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Java8Map {

	public static void main(String[] args) {
		
		List<String> fruits=Arrays.asList("Apple","Mango",
				"Orange","Banana","Apple","Mango","Mango");
		
		Map<String,Long> result=fruits.stream().
				collect(Collectors.groupingBy(Function.identity(),
						Collectors.counting()));
		
		System.out.println(result);
		
		Map<String,Long> sorted=new LinkedHashMap<>();
		


	}

}

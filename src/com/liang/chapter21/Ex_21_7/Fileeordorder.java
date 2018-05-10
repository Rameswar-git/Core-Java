package com.liang.chapter21.Ex_21_7;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.SortedMap;
import java.util.Map.Entry;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Fileeordorder {

	public static void main(String[] args) throws IOException {
		
		List<String> lst=Arrays.asList(new String(Files.readAllBytes(Paths.get("D:\\Ram.txt")))
				  .split(" "));
		
		
		 Map<String, Long> result=Arrays.asList(new String(Files.readAllBytes(Paths.get("D:\\Ram.txt"))).toLowerCase()
				  .split(" ")).stream().collect(Collectors.groupingBy(Function.identity(), Collectors.counting()));
		 

	        System.out.println(result);
		 
		 

	}

}

package com.liang.chapter12;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.nio.file.attribute.GroupPrincipal;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8GropingFileContent {

	public static void main(String[] args) {
       String name=" Rameswar  Das";
       
      long np= name.chars().filter(x -> x !=32 ).count();
      
      System.out.println(np);
      
      try(Stream<String> asc=Files.lines(Paths.get("D:\\New.txt"))) {
    	  
    	 
       
    	  Map<String, Long> adc=asc.flatMap(line -> Arrays.stream(line.trim().split("\\s")))
    			  .map(word -> word.replaceAll("[^a-zA-Z]", "").toLowerCase().trim()).filter(t -> t.length()>0)
    			  .map(wor -> new SimpleEntry<>(wor,1)).collect(Collectors.groupingBy((SimpleEntry::getKey),Collectors.counting()));
    	  
    	  adc.forEach((k,v) -> System.out.println(" Key is "+k+" and Value is "+v));
    	  
//    	  adc.forEach((k,v) -> System.out.println("Key ->"+k+" Value -> "+v));
    	  
    	 List<Map<String,Long>> adchg= adc.entrySet().stream().filter(mp -> mp.getValue()>1).map(ds -> {
    		 Map<String, Long> sjdhc=new HashMap<>();
    		 sjdhc.put(ds.getKey(), ds.getValue());
    		 return sjdhc;
    	 }).collect(Collectors.toList());
    	 
    	 adchg.forEach(map -> map.forEach((k,v) -> System.out.println("Key is "+k+" and value is "+v)));
    	 
    	 
//    	 (ds.getKey(),ds.getValue()));
    	  
//    	  System.out.println(adc.size());
    	  
    	      	  
      }catch (Exception e) {
    	  e.printStackTrace();
	  }
	}

}

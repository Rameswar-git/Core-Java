package com.liang.chapter12;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.AbstractMap.SimpleEntry;
import java.util.Arrays;
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
    	  
    	  
    	  Map<String, Long> adcas= adc.entrySet().stream().filter(x -> x.getValue()>1).collect(Collectors.toMap(x -> x.getKey(), x -> x.getValue()));
    	  
    	  adcas.forEach((k,v) -> System.out.println(" Key "+k+" Value "+v));
    	  	  
      }catch (Exception e) {
    	  e.printStackTrace();
	  }
	}

}

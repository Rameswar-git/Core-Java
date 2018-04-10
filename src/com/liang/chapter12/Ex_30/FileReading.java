package com.liang.chapter12.Ex_30;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReading {
	
	public static void main(String[] args) throws FileNotFoundException {
		
         try {
        	 
        	String bits=new String(Files.readAllBytes(Paths.get("D:\\Name.txt")));
        	
        	//First Approach
  	
        	Map<String,Long> mp=Arrays.stream(bits.split("")).
        			collect(Collectors.groupingBy(P -> String.valueOf(P),Collectors.counting()));
        	
        	mp.forEach((k,v) -> System.out.println("Key "+k+" Value "+v));
        	
        	//Second Way
        	
        	
        	
//       	Map<String,Integer> g=Arrays.stream(bits.split("")).map(x -> x.split("")).collect(Collectors.toMap(p -> p[0],p -> new Integer(1), (old,newval) -> old+1));
        	

        	
        	
//       	System.out.println(g);

			
		} catch (Exception e) {e.printStackTrace();	}
         
	}
}

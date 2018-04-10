package com.liang.chapter12.Ex_30;

import java.io.FileNotFoundException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.Map;
import java.util.function.Function;
import java.util.AbstractMap.SimpleEntry;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FileReading {
	
	public static void main(String[] args) throws FileNotFoundException {
		
//         File fil=new File("D:\\Name.txt");
//         
//         Scanner scan =new Scanner(fil);
//         
//         StringBuilder stb=new StringBuilder();
//         
//         while(scan.hasNext()) {
//        	 stb.append(scan.next());
//         }
//         
//         scan.close();
//         
         try {
        	 
        	String bits=new String(Files.readAllBytes(Paths.get("D:\\Name.txt")));

        	
//        	Map<Object, Object> adc=
        	
//        			Map<String,Integer> dc=
        	
//        					bits.chars().map(x -> (char)x).collect(Collectors.toMap(x -> x.toString() , Collectors.counting()));
        	
          Map<Character,Integer> mp=Stream.of(bits.toCharArray())
        		  .map(i -> new SimpleEntry<>(i[0],1)).collect(Collectors.toMap(SimpleEntry::getKey, SimpleEntry::getValue));
          
          
          mp.forEach((k,v) -> System.out.println(" Key "+k+" Value "+v));

        	
//        	bits.chars().
			
		} catch (Exception e) {	}
         
	}
}

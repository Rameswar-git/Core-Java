package com.liang.chapter12;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.stream.Stream;


public class Java8FileReading {

	public static void main(String[] args) {
          try(Stream<String> asc=Files.lines(Paths.get("D:\\New.txt"))) {
        	  
        	  StringBuilder bld=new StringBuilder();
        	  
        	  asc.forEach(line -> {
					 String kv=line.replaceAll("rameswar", "");
					 bld.append(kv);
        	  });
        	  
        	  Files.write(Paths.get("D:\\New2.txt"),bld.toString().getBytes()); 
        	  
//        	 List<String> ascac=asc.map(line -> line.replaceAll("rameswar", "")).collect(Collectors.toList());  
        	 
        	 //read and Store in a List
        	 
//        	 System.out.println(ascac);
			
		} catch (Exception e) {
			e.printStackTrace();
			System.out.println("File Not Found");
		}
	}

}

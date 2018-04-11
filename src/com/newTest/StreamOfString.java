package com.newTest;

import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamOfString {

	public static void main(String[] args) {
		
//        String name="Rameswar Prasad Das";
        
        
//       String[] names= Stream.of(name.split(" ")).toArray(String[]::new);
       
//       Arrays.stream(names).forEach(System.out::println);
       
       IntStream.range(0, 4).forEach(i -> System.out.print("*"));
       
        
	}

}

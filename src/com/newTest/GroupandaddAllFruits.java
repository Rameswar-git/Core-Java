package com.newTest;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class GroupandaddAllFruits {

	public static void main(String[] args) {
//         String tst2="apple=10,banna=20,apple=40,banna=30";
         
         String tst2="Rameswar";

         
       Map<String, Integer> obs=Arrays.stream(tst2.split(","))
    		   .map(x -> x.split("=")).collect(Collectors.toMap(p -> String.valueOf(p[0]), p -> Integer.valueOf(p[1]), (oldValue, newValue) -> oldValue+newValue));
       
       obs.forEach((k,v) -> System.out.println("Key "+k+" Value "+v));

         
	}

}

package com.newTest;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;
import java.util.AbstractMap.SimpleEntry;
import java.util.stream.Collectors;

public class GroupandaddAllFruits {

	public static void main(String[] args) {
         String tst2="apple=10,banna=20,apple=40,banna=30";
         
         Map<String,Integer> m=new HashMap<>();
         
//         Arrays.stream(tst2.split(",")).forEach(x -> {
//        	    x.split("=");
//        	 if()
//        	 
//         });

         
//         Arrays.stream(tst2.split(",")).map(x -> x.split("=")).forEach(g ->{
//        	 if(m.containsKey(g[0])) {
//        		 m.put(g[0],m.get(g[0])+Integer.valueOf(g[1]));
//        	 }else {
//        		 m.put(g[0],Integer.valueOf(g[1]));
//        	 }
//         });
         
       Map<Object, Integer> obs=Arrays.stream(tst2.split(","))
    		   .map(x -> x.split("=")).collect(Collectors.toMap(p -> p[0], p -> Integer.valueOf(p[1]), (oldValue, newValue) -> oldValue+newValue));
       
       obs.forEach((k,v) -> System.out.println("Key "+k+" Value "+v));

//       obs.forEach((k,v) -> System.out.println("Key"+String.valueOf(k)+" Value "+String.valueOf(v)));p -> 
         
//         m.forEach((k,v) -> System.out.println("Key "+k+" Value "+v));
         
	}

}

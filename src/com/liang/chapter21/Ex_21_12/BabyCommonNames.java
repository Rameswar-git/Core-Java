package com.liang.chapter21.Ex_21_12;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Stream;

public class BabyCommonNames {

	public static void main(String[] args) throws IOException {
		
		//http://www.cs.armstrong.edu/liang/data/babynameranking2001.txt
		
		URL ur=new URL("http://www.cs.armstrong.edu/liang/data/babynameranking2001.txt");
		
        BufferedReader bufferedReader = new BufferedReader( new InputStreamReader(ur.openStream()));
        
       Stream<String> brsmale=bufferedReader.lines();
       
       
       Set<String> malenames=new HashSet<>();
       Set<String> femalenames=new HashSet<>();
       Set<String> commonnames=new HashSet<>();
       
       brsmale.map(x -> x.split("\\t")).forEach(r ->{
    	   malenames.add(r[1].trim());
    	   femalenames.add(r[3].trim());
    	   
       });
       
       malenames.retainAll(femalenames);
       
       
//       malenames.forEach(d -> {
//    	   if(femalenames.contains(d)) {
//    		   commonnames.add(d);
//    		   
//    	   }
//       });
       
       System.out.println(" Size is "+malenames.size());
       System.out.println(" values are  "+malenames);
       
       
       

	}

}

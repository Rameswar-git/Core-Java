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
        
       Stream<String> brs=bufferedReader.lines();
       
       Set<String> malenames=new HashSet<>();
       Set<String> femalenames=new HashSet<>();
       Set<String> commonnames=new HashSet<>();
       
       brs.map(x -> x.split("\\t")).forEach(r -> malenames.add(r[1]));
       
//       bufferedReader.lines().map(x -> x.split("\\t")).forEach(p -> femalenames.add(p[1]));
       
       malenames.forEach(d -> {
    	   if(femalenames.contains(d)) {
    		   commonnames.add(d);
    		   
    	   }
       });
       

       
       System.out.println(" Size is "+commonnames.size());
       System.out.println(" values are  "+commonnames);
       
       
       

	}

}

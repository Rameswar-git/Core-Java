package com.newTest;


import java.util.stream.IntStream;

public class StringJoin {

	public static void main(String[] args) {
		
        boolean[] blns=new boolean[3];
        int count=0;
        for (int i = 0; i < 3; i++) {     
        	blns[count++]=true;
		}
        
        IntStream.range(0, blns.length).forEach(p -> System.out.println(blns[p]));
        
        boolean match=IntStream.range(0, blns.length).anyMatch(x -> blns[x] == false);
        
        System.out.println("Matched booleans are "+match);
       
        
	}

}

package com.newTest;

import java.util.Arrays;

public class StringTest {
	
	class har{
		
	}

	public static void main(String[] args) {
          String name1="1 	Jacob	30,541 	Emily 	24,450";
          String name2="2 	Michael	28,220 	Madison 	21,771";
          
          String[] names=name2.split("\t");
          
          System.out.println(names[1]);
          
          
//          Arrays.stream(names).forEach(System.out::println);
	}

}

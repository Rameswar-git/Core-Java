package com.RepeatedStringinsideString;

import java.util.HashMap;
import java.util.Map;

public class RepeatedStringinString {
	
	private static int cout=0;
	private static Map<Integer,Integer> mp=new HashMap<>();

	public static void main(String[] args) {
		
		String Test="sfvkhzgsdvkjfVickykzshDvbjghzVickyk,zshdgfjvhkghsdjrfVickyskdfhjslefsdfvicky";
		
		while(true) {
			if(Test.toLowerCase().contains("vicky")) {
				cout++;
				mp.put(Test.toLowerCase().lastIndexOf("vicky"), cout);
				Test=Test.substring(0,Test.toLowerCase().lastIndexOf("vicky"));
			}else {
				break;
			}
		}
    	
		mp.forEach((k,v) -> System.out.println(" Index is "+k+" Count  is "+v));
		
		System.out.println(Test);
		
	}

}

package com.practice;

import java.util.ArrayDeque;
import java.util.UUID;

public class CopybyValue {
	
	public static void main(String[] args) {
		
		ArrayDeque<String> ad=new ArrayDeque<>();
		
		for (int i = 0; i < 5; i++) {
			ad.add(UUID.randomUUID().toString().replace("-", ""));
			
		}
		System.out.println("ad::::"+ad.size());

		for (int i = 0; i < 6; i++) {
			System.out.println(ad.pop());
		}
		
           
	}

	private static String Test1(String name) {
		return name="Test2";
	}



}

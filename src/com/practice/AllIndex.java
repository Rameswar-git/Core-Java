package com.practice;

public class AllIndex {

	public static void main(String[] args) {
		
		String word = "bannanas";
		
		String c="a";
		
		
		for(int i=0;i<word.length();i++){
			
			System.out.println(word.indexOf(c, i));
		}
			

	}

}

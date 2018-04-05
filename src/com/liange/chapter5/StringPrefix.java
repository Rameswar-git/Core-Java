package com.liange.chapter5;

public class StringPrefix {

	public static void main(String[] args) {
		String str1="Welcome To kiran c++";
		String str2="Welcome To kiran Java";
		String prefix="";
		
//		System.out.println(str1.startsWith(str2.substring(0,15)));
		
		
		
		for (int i = str2.length(); i>0; i--) {
			
			if (str1.startsWith(str2.substring(0,i))){
				 prefix=str1.substring(0, i);
				break;
			}

		}
		
		System.out.println(prefix);

	}

}

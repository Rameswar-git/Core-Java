package com.liang.chapter9;


public class MyStringTest {
	public static void main(String[] args) {
		char[] test = {'T', 'e', 'S', 't'};
		char[] test2 = {'T', 'e', 'S', 't', '2'};
		
		MyString1 str=new MyString1(test);
		MyString1 str2=new MyString1(test2);
		
//		System.out.println(str.charAt(1));
//		System.out.println(str2.charAt(3));
		
		//Length  Check
		
//		System.out.println(str.length());
//		System.out.println(str2.length());
		
//		MyString1 chas=str.substring(1, 3);
//		
//		for (int i = 0; i < chas.length(); i++) {
//			System.out.print(chas.charAt(i));
//		}
		
		MyString1 string1=str.toLowerCase(str);
//		
//		for (int i = 0; i < string1.length(); i++) {
//			
//			System.out.print(string1.charAt(i)+"  ");
//		}
		
		MyString1 sjs=string1.valueOf(523);
		
		for (int i = 0; i < sjs.length(); i++) {
			System.out.println(sjs.charAt(i));
		}
		
		
		
	}

}

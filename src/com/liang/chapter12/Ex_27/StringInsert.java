package com.liang.chapter12.Ex_27;

public class StringInsert {

	public static void main(String[] args) {
           String test="Exercise2_1";
           
			StringBuilder newStr = new StringBuilder(test);
			newStr.insert(newStr.length() - 1, 0 + ""); 
			System.out.println(newStr.toString());
			newStr.insert(8, '0');
            System.out.println(newStr.toString());
           
           
	}

}

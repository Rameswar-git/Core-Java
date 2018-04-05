package com.test.programs;

public class Objecttest {

	public static void main(String[] args) {
		
		String Str=new String("Rameswar");
		
		Object ob=new Object();
		
           ob=(Object)Str;
           
           ob=new Object();
           
	       Object[]  policy= (Object[]) ob;
           
           System.out.println(policy[0]);
	

	}

}

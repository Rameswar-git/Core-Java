package com.practice;

public class genericsTest {
  
	 String[] arr={"Ram","Har","Sit"};
	
	
	
	public <T> String[] Get(T name) {
		String[] newarr=new String[2];
		int cout=0;
		for (int i = 0; i < arr.length; i++) {
		  if ( name.equals(i) || arr[i] == name) {
			continue;
		   }else{
			   newarr[cout]=arr[i];
			   cout++;
		   }	
		}
		return newarr;
	}
	
	public static void main(String[] args) {
		genericsTest generi=new genericsTest();
		
		String[] ram=generi.Get("Sit");
		
		for (int i = 0; i < ram.length; i++) {
			System.out.println(ram[i]);
		}
	}
}

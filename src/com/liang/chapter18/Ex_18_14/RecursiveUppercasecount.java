package com.liang.chapter18.Ex_18_14;

public class RecursiveUppercasecount {
	
	private static int uppercount=0;

	public static void main(String[] args) {
		
         FindUpperCase("HELLozsfkjvygdiHYE");
         
         System.out.println(uppercount);
         
	}

	private static void FindUpperCase(String string) {
		
		if(string.length() > 0) {
			if(string.charAt(string.length()-1) >= 'A' && string.charAt(string.length()-1) <= 'Z') {
				uppercount++;
			}
			
			FindUpperCase(string.substring(0, string.length()-1));
		}
	}

}

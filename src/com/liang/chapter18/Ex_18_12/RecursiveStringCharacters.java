package com.liang.chapter18.Ex_18_12;

public class RecursiveStringCharacters {

	public static void main(String[] args) {
//		System.out.println();
		RecurSiveCharacterDisplay("Hello","Hello".length());
	}

	private static String RecurSiveCharacterDisplay(String sts, int length) {
		System.out.println(sts);
		if(sts.length() == 1) {
			return sts.charAt(0)+"";
		}else {
			return sts.charAt(length-1)+RecurSiveCharacterDisplay(sts.substring(0, length-1),length-1);
		}
	 
   }

}

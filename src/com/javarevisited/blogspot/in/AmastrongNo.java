package com.javarevisited.blogspot.in;

public class AmastrongNo {

	public static void main(String[] args) {
		
		String no=153+"";
		
//		System.out.println(no.length());
		
		int finalno=0;
		
		int pw=no.length();
		
        		
		
		for (int i = 0; i < no.length() ; i++) {
			finalno+=Math.pow(Integer.parseInt(no.charAt(i)+""),pw);
		}
		
		System.out.println(finalno);

	}

}

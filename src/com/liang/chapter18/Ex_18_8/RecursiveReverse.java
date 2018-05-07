package com.liang.chapter18.Ex_18_8;


public class RecursiveReverse {
	public static void main(String[] args) {
		
		
//		System.out.println(RecrsiveRev(123));
		
		RecrsiveRev(123);

	}

	private static void RecrsiveRev(int i) {

		if(i < 10) {
			System.out.print(i);
		}
	 else {
		 System.out.print(i % 10);
		 RecrsiveRev(i/10);
	 }

		
	}

}

package com.first;


public class Tets {

	public static void main(String[] args) {
//		int no = 1456516979;
//		int[] nos = new int[10];
//		
//		for (int i = nos.length; i > 0; i--) {
//			nos[i-1]=no % 10;
//			no=no/10;
//		}
//    System.out.println();
		
		int no=145;
		int length=0;
		while(no>0){
			no=no/10;
			length++;
		}
		
		System.out.println(length);
	}

}

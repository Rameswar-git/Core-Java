package com.liang.chapter18.Ex_18_13;


public class RecursiveMaxFind {
	
	private static int max=0;

	public static void main(String[] args) {
        
		int[] nos= {5,12,89,3,45};
		
		FindRecursiveMax(nos,nos.length);
		
		System.out.println("The Max Number From The Array is "+max);
		
	}

	private static void FindRecursiveMax(int[] nos, int length) {
		
		if(length > 0 && nos[length-1] > max) {
			max=nos[length-1];
		}

		if(length > 0) {
			FindRecursiveMax(nos,length-1);
		}

	}

}

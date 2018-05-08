package com.liang.chapter18.Ex_18_21;

public class RecursiveDecimalToBinary {

	public static void main(String[] args) {
		
		System.out.println(RecurviveBinary(12));
		

	}

	private static String RecurviveBinary(int i) {
		if(i/2 == 0) {
			return (i % 2)+"";
		}else {
			return RecurviveBinary(i/2)+(i % 2)+"";
		}
		
	}

}

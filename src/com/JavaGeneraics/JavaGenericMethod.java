package com.JavaGeneraics;

import java.util.List;

public class JavaGenericMethod {

	public static void main(String[] args) {
		int a=10;
		int b=8;		
		
		System.out.println(sum1(a,b));
		

	}

	private static <T extends Number> T sum1(List<? extends Number > a, List<? extends Number> b) {
		
		return null;
//		return a.doubleValue()+b.doubleValue();
	}
	private static <T extends Number> double sum1(T a, T b) {
		
		return a.doubleValue()+b.doubleValue();
//		return a.doubleValue()+b.doubleValue();
	}


}

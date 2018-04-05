package com.liang.chapter9;

public class MyPointTest {

	public static void main(String[] args) {
		MyPoint mp1=new MyPoint(0, 0);
		MyPoint mp2=new MyPoint(10, 30.5);
		
		double distance=mp1.Distance(mp2);
		
		System.out.println(distance);
		
		
 	}

}

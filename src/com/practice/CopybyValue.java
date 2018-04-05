package com.practice;


public class CopybyValue {
	static int m=30;
	public static void main(String[] args) {
		
		int[] a={2,5};
		CopybyValue m1=new CopybyValue();
		m1.test1(m,a);
		System.out.println(m);
		System.out.println(a[0]);
		test2(m);
		System.out.println(m);

	}

	private static void test2(int m) {

		
	}

	private void test1(int m, int[] a) {
		this.m=45;
		a[0]=6;
	}

}

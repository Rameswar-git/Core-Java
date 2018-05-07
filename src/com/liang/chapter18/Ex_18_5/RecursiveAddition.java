package com.liang.chapter18.Ex_18_5;

public class RecursiveAddition {

	public static void main(String[] args) {
		
		System.out.printf("Addition is %.2f\n",RecAdd(10.0));
		
	}

	private static double RecAdd(Double i) {
		double no=i/(2*i+1);
       if(i == 0)
          return 0;
       else
		return no+=RecAdd(i-1);
	}

}

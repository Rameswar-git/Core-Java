package com.liang.chapter18.EX_18_11;

public class SumOfDigitsUsingRecursion {

	public static void main(String[] args) {
		System.out.println(" Recursive Sum Of The Numbers is "+ RecursiveSum(123));
	}

	private static int RecursiveSum(int i) {
		if(i % 10 == 0) {
			return 0;
		}else {
			return (i%10)+RecursiveSum(i/10);
		}
		
		
	}

}

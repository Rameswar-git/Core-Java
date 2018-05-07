package com.liang.chapter18.Ex_18_7;

public class FibonacieeSerisRecursive {

	public static void main(String[] args) {
//           System.out.println();
		for (int i = 0; i <= 5; i++) {
			System.out.println(fib(i)+" ");
		}
		
	}

	private static int fib(int i) {
		if(i == 0 ) {
			return 0;
		}
		if(i == 1 ) {
			return 1;
		}
		
		else {
			return fib(i-1)+fib(i-2);
			
		}
		
	}

}

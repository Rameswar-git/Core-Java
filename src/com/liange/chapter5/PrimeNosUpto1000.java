package com.liange.chapter5;

public class PrimeNosUpto1000 {

	public static void main(String[] args) {
		int linecount=1;
         for (int i = 1; i <= 1000; i++) {
			if(isprime(i)){
				if (linecount % 8 == 0) {
					System.out.println(i+" ");
				}else{
					System.out.print(i+" ");
				}
				linecount++;
			}
		}
	}

	private static boolean isprime(int i) {
		if (i  == 1) {
			return false;
		}
		for (int j = 2; j <= Math.sqrt(i); j++) {
			if (i % j == 0) {
				return false;
			}
		}
		return true;
	}

}

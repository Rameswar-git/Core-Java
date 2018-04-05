package com.liange.chapter5;

public class SmallestnBelow1200 {

	public static void main(String[] args) {
		int n=0;
		int fintno=0;
		do{		
			fintno=n*n*n;
			n++;
		}while(fintno<12000);
//		while(fintno<12000){
//			n++;
//			fintno=n*n*n;
//		}
		System.out.println(n);
//		int n=0;
//		while (Math.pow(n+1, 3) < 12000) {
//			n++;
//		}
//		System.out.println("The smallest integer n such that n^2 is greater than 12,000: " + n);
	}

}

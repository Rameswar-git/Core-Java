package com.liange.chapter5;

public class SeriesSum {

	public static void main(String[] args) {
		double sum=0.00;
        for (double i = 1.0; i <= 97.00; i+=2.0) {
        	sum+=i/(i+2.0);
		}
        System.out.println("Finally The Sum is "+sum);
	}

}

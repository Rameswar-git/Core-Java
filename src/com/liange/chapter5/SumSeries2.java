package com.liange.chapter5;


public class SumSeries2 {

	public static void main(String[] args) {
         double  sum=0.0;
         for (double i = 1; i <= (2*10000-1); i+=2) {
        	 sum+=1/i;
        	 i+=2;
        	 sum-=1/i;
		}
         System.out.println("Finale Sum  Becomes "+4*sum);
	}

}

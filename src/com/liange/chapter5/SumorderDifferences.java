package com.liange.chapter5;

public class SumorderDifferences {

	public static void main(String[] args) {
          double sumrighttoleft = 0.0,sumlefttoright=0.0 ;
       for (double i = 1.0; i <= 50000; i++) {
    	   sumlefttoright+=1/i;
	   }   
//       System.out.println("sumlefttoright"+sumlefttoright);w
       for (double j = 50000; j>0; j--) {
    	   sumrighttoleft+=1/j;
	   }   
//       System.out.println("sumrighttoleft"+sumrighttoleft);
       System.out.println(sumrighttoleft-sumlefttoright);
	}

}

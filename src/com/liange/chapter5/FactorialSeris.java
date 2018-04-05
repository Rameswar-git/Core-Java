package com.liange.chapter5;



public class FactorialSeris {

	public static void main(String[] args) {
//      double sum=0.0;
//      for (double i = 1; i <= 	10000; i++) {
//    	  sum+=1/fact(i);
//	  }
//      System.out.println(sum);
		
		System.out.println(fact(6));
	}

	private static double fact(double i) {
		double fact=1;
		if(i == 1){
			return 1;
		}else{
			for (double j = i; j>0; j--) {
				fact *=j;
			}
			
			return fact;
		}
		
	}

}

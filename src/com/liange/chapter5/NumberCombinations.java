package com.liange.chapter5;

public class NumberCombinations {

	public static void main(String[] args) {
       int count=0;
       int maxno=7;
       for (int number1 = 1; number1 <= maxno; number1++) {
		      for (int number2 = number1+1; number2 <=maxno ; number2++) {
				System.out.println(number1+"\t"+number2);
				count++;
			}
		      System.out.println("~~~~~~~~~~~~~");
	    }
       
       System.out.println("All Possibel Mix Of 1 to "+maxno+"  is "+count);
	}

}

package com.liange.chapter5;

public class PerfectNumber {

	public static void main(String[] args) {
		System.out.println("The four perfect number less than 10,000:");
          int count=10000;
          for (int i = 1; i <= count; i++) {
        	  int no=i;
        	  int no2=0;
        	  for (int j = i-1; j>0; j--) {
        		  if (no % j == 0) {
        			  no2+=j;
				  } 
			  }
        	  if (no  ==  no2) {
        		  System.out.printf("%20d\n", no2);
			}
		}
	}

}

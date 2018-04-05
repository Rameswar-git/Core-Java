package com.liange.chapter5;

public class CommisionCalculator {

	public static void main(String[] args) {
        
         double totalsalestoearn=40000;		
         
         double first10thousendcommision=900;
         
         double restofcommisiontoearn=totalsalestoearn-first10thousendcommision;
         
         double requiredcommision=(restofcommisiontoearn / 0.12)+10000;
         
         System.out.println(requiredcommision);
		
	}

}

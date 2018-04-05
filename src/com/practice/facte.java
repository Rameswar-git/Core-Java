package com.practice;

public class facte {

	public static void main(String[] args) {
		int i=9;
		int fact=9;
       int temp=0;
	    for(i=9;i>1;i--){
	    	temp=fact;
	    	fact=temp*(i-1);
	    }
	    
	    System.out.println("Factorial of Given no is "+fact);
	}

}

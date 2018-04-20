package com.liang.chapter13.Ex_22;

/*********************************************************************************
* (Create a rational-number calculator) Write a program similar to Listing 7.9,  *
* Calculator.java. Instead of using integers, use rationals, as shown in Figure  *
* 13.10a. You will need to use the split method in the String class, introduced  *
* in Section 10.10.3, Replacing and Splitting Strings, to retrieve the numerator *
* string and denominator string, and convert strings into integers using the     *
* Integer.parseInt method.                                                       *
*********************************************************************************/
public class Exercise_13_16 {
	/** Main method */
	public static void main(String[] args) {

		
		Rational r1 = new Rational(Integer.parseInt("1"), 
			Integer.parseInt("2"));
		Rational r2 = new Rational(Integer.parseInt("3"),
			Integer.parseInt("5"));



		// Display results
		System.out.println(r1.add(r2));
	}
}

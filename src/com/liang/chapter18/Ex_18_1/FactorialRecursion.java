package com.liang.chapter18.Ex_18_1;

import java.math.BigInteger;
import java.util.Scanner;

public class FactorialRecursion {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The No To find Factorial");
		BigInteger bignp=scan.nextBigInteger();
		System.out.println(" Factorial of "+bignp+" is "+Factorial(bignp));
		scan.close();
		
	}

	private static BigInteger Factorial(BigInteger bignp) {
	   if(bignp.equals(BigInteger.ONE))
			return BigInteger.ONE;
	   else
		  return bignp.multiply(Factorial(bignp.subtract(BigInteger.ONE)));
	}

}

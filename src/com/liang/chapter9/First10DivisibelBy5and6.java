package com.liang.chapter9;

import java.math.BigInteger;

public class First10DivisibelBy5and6 {

	public static void main(String[] args) {
		BigInteger big=new BigInteger(String.valueOf(Long.MAX_VALUE));
		BigInteger one=new BigInteger("1");
		BigInteger five=new BigInteger("5");
		BigInteger six=new BigInteger("6");
		BigInteger zero=new BigInteger("0");
		int count=0;
		while(count<10){
			 big=big.add(one);
			if(big.remainder(five).compareTo(zero) == 0 ||
			   big.remainder(six).compareTo(zero) == 0){
				System.out.println(big);
				count++;
			}
		}
 	}

}

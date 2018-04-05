package com.liang.chapter9;

import java.math.BigInteger;

public class LongMax {

	public static void main(String[] args) {
		
		BigInteger bigInteger=new BigInteger(Long.MAX_VALUE+"");
		BigInteger end=bigInteger.add(new BigInteger("10"));	
		
		for (BigInteger i = new BigInteger(Long.MAX_VALUE+""); i.compareTo(end) <= 0; i=i.add(new BigInteger("1"))) {
			System.out.println(i.multiply(i));
		}
		
 	}

}

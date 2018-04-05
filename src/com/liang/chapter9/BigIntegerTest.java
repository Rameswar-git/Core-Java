package com.liang.chapter9;

import java.math.BigDecimal;

public class BigIntegerTest {

	public static void main(String[] args) {
		System.out.println("\n The e values for i = 100 to 1000:");
		System.out.println("-----------------------------------");
		System.out.println(" i                e ");
		System.out.println("-----------------------------------");
		for (BigDecimal i = new BigDecimal(100);
				i.compareTo(new BigDecimal("1000")) <= 0; 
				i=i.add(new BigDecimal("100"))) {
			System.out.println(i + "    " + getE(i));
		}
	}

	private static BigDecimal getE(BigDecimal i) {
		BigDecimal one=new BigDecimal("1");
		BigDecimal e=new BigDecimal("0.0");
		for (BigDecimal j = one; j.compareTo(i)<=0 ; j=j.add(new BigDecimal("1"))) {
			BigDecimal denominator=j;
			for (BigDecimal k = j.subtract(one); k.compareTo(one) >= 1; k=k.subtract(one)) {
				denominator=denominator.multiply(k);
			}
			e=e.add(one.divide(denominator,25,BigDecimal.ROUND_UP));
		}
		
		return e;
	}
}

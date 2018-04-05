package com.liang.chapter9;


public class MyInteger {
	private  int  value;
	
	

	public MyInteger(int value) {
		this.value = value;
	}

	public int getValue() {
		return value;
	}
	
	public   boolean isEven() {
		return (this.value % 2 == 0);
	}
	public  static boolean isEven(int val) {
		return (val % 2 == 0);
	}
	public  boolean isEven(MyInteger val) {
		return (val.value % 2 == 0);
	}
	
	
	
	public  boolean isOdd() {
		return this.value % 2 > 0;
	}
	public static boolean isOdd(int val) {
		return val % 2 > 0;
	}
	public boolean isOdd(MyInteger val) {
		return val.value % 2 > 0;
	}
	
	
	
	public  boolean isPrime() {
		return  PrimeNoCheck(this.value);
	}
	public static boolean isPrime(int val) {
		return  PrimeNoCheck(val);
	}
	public boolean isPrime(MyInteger val) {
		return  PrimeNoCheck(val.value);
	}

	private static boolean PrimeNoCheck(int n) {
		if (n <= 0) {
			return false;
		}
		for (int i = 2; i <= n/2; i++) {
			if (n % i ==0) {
				return false;
			}
		}
	   return true;	
	}
	
	public boolean equals(int va) {
		return va == this.value ? true:false;
	}
	public boolean equals(MyInteger integer) {
		return integer.value == this.value ? true:false;
	}
	
	public static int pasreInt(char[] chars) {
		StringBuilder stringBuilder=new StringBuilder();
		for (int i = 0; i < chars.length; i++) {
			stringBuilder.append(chars[i]);
		}
		
		return Integer.parseInt(stringBuilder.toString());
		
 	}
	public static int pasreInt(String str) {
		return Integer.parseInt(str);
	}
   
}

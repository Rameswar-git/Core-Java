package com.liang.chapter9;

public class MyIntergerTest {

	public static void main(String[] args) {
           MyInteger integer=new MyInteger(57);
           
           System.out.println(integer.isEven());
           System.out.println(integer.isOdd());
           System.out.println(integer.isPrime());
           
           MyInteger.isEven(56);
           MyInteger.isOdd(56);
           MyInteger.isPrime(56);
           
           
           MyInteger integer2=new MyInteger(60);
           
           System.out.println(integer2.isEven());
           System.out.println(integer2.isOdd());
           System.out.println(integer2.isPrime());
           
           char[] mycha={'1','2','3'};
           
           System.out.println(MyInteger.pasreInt(mycha));
           System.out.println(MyInteger.pasreInt("123"));
           
	}
}

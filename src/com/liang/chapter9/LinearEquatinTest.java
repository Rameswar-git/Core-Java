package com.liang.chapter9;

import java.util.Scanner;

public class LinearEquatinTest {

	public static void main(String[] args) {
		Scanner sc=new Scanner(System.in);
		double a=sc.nextDouble();
		double b=sc.nextDouble();
		double c=sc.nextDouble();
		double d=sc.nextDouble();
		double e=sc.nextDouble();
		double f=sc.nextDouble();
		LinearEquation eq=new LinearEquation(a, b, c, d, e, f);
		if (eq.isSolvabel()) {
			System.out.println(eq.getX());
			System.out.println(eq.getY());
		}else{
			System.out.println("The equation has no solution.");
		}
		sc.close();
	}

}

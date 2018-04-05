package com.liang.chapter9;

public class QuadraticEquation {
	private double a;
	private double b;
	private double c;

	public QuadraticEquation(double a, double b, double c) {
		this.a = a;
		this.b = b;
		this.c = c;
	}

	public double getA() {
		return a;
	}

	public double getB() {
		return b;
	}

	public double getC() {
		return c;
	}

	public double getDiscriminator() {
		return (b * b) - (4 * a * c);
	}
	
	public double getRoot1() {
	   return (-b+Math.sqrt((b*b)+(4*a*c)))/2*a;       	  
	}

	public double getRoot2() {
      return (-b+Math.sqrt((b*b)-(4*a*c)))/2*a;       	  
	}
	
}

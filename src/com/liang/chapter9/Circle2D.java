package com.liang.chapter9;

public class Circle2D {
	private double x;
	private double y;
	private double radius;

	public Circle2D() {
		this.radius = 1;
	}

	
	public Circle2D(double x, double y, double radius) {
		this.x = x;
		this.y = y;
		this.radius = radius;
	}
	
	public double  getArea() {
		return Math.PI*radius*radius;
	}
	
	public double  getPerimeter() {
		return 2*Math.PI*radius;
	}
	
	public boolean  contains(int x,int y) {
		return Math.sqrt(Math.pow(x-this.x,2)+Math.pow(y-this.y, 2)) < radius;
	}
	public boolean  contains(Circle2D cir) {
		return Math.sqrt(Math.pow(cir.x-this.x,2)+Math.pow(cir.y-this.y, 2)) <= radius;
	}
	public boolean  overlaps(Circle2D cir) {
		return Math.sqrt(Math.pow(cir.x-this.x,2)+Math.pow(cir.y-this.y, 2)) <= cir.radius+radius;
	}
	
	
}

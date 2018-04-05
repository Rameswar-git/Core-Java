package com.liang.chapter9;

public class MyPoint {

	private double x = 0;
	private double y = 0;

	public MyPoint(double x, double y) {
		this.x = x;
		this.y = y;
	}

	public double getX() {
		return x;
	}

	public double getY() {
		return y;
	}

	public double Distance(MyPoint po) {
		return Math.sqrt(Math.pow(po.getX()-x, 2)+Math.pow(po.getY()-y, 2));
	}
	public double Distance(int x,int y) {
		return Distance(new MyPoint(x,y));
	}
}

package com.liang.chapter12;

public class Triangel {
	private int side1;
	private int side2;
	private int side3;

	public Triangel(int side1, int side2, int side3) throws TriangelException {
		if ((side1 + side2 != side3) || (side2 + side3 != side1) || (side1 + side3 != side2)) {
			throw new TriangelException();
		}
		this.side1 = side1;
		this.side2 = side2;
		this.side3 = side3;
	}

	public int getSide1() {
		return side1;
	}

	public void setSide1(int side1) {
		this.side1 = side1;
	}

	public int getSide2() {
		return side2;
	}

	public void setSide2(int side2) {
		this.side2 = side2;
	}

	public int getSide3() {
		return side3;
	}

	public void setSide3(int side3) {
		this.side3 = side3;
	}
	
	public double getarea(){
		double s=(side1+side2+side3)/2;
		return Math.sqrt(s*(s-side1)*(s-side2)*(s-side3));
	}
	public double getPerimeter(){
		return side1+side2+side3;
	}

}

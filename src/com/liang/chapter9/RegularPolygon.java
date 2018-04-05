package com.liang.chapter9;

public class RegularPolygon {
	private int noofsides;
	private double side;
	private double xcordinate;
	private double ycordinate;

	public RegularPolygon() {
		this.noofsides = 3;
		this.side = 1;
		this.xcordinate = 0;
		this.ycordinate = 0;
	}

	public RegularPolygon(int noofsides, double side) {
		this.noofsides = noofsides;
		this.side = side;
		this.xcordinate = 0;
		this.ycordinate = 0;
	}

	public RegularPolygon(int noofsides, double side, double xcordinate, double ycordinate) {
		this.noofsides = noofsides;
		this.side = side;
		this.xcordinate = xcordinate;
		this.ycordinate = ycordinate;
	}

	public int getNoofsides() {
		return noofsides;
	}

	public void setNoofsides(int noofsides) {
		this.noofsides = noofsides;
	}

	public double getSide() {
		return side;
	}

	public void setSide(double side) {
		this.side = side;
	}

	public double getXcordinate() {
		return xcordinate;
	}

	public void setXcordinate(double xcordinate) {
		this.xcordinate = xcordinate;
	}

	public double getYcordinate() {
		return ycordinate;
	}

	public void setYcordinate(double ycordinate) {
		this.ycordinate = ycordinate;
	}
	
	public double getArea() {
		return ((noofsides*side*side)/(4*Math.tan(Math.PI/noofsides)));
	}
	public double getPerimeter() {
		return noofsides * side;
	}
	
   
}

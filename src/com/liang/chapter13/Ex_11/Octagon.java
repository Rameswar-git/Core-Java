package com.liang.chapter13.Ex_11;

public class Octagon extends GeometricObject implements Cloneable,Comparable<Octagon> {
    
	private int side;
	
	Octagon(int sid){
		this.side=sid;
	}
	
	public int getSide() {
		return side;
	}

	public void setSide(int side) {
		this.side = side;
	}

	@Override
	public int compareTo(Octagon arg0) {
		if(getArea() > arg0.getArea())
			return 1;
		if(getArea() < arg0.getArea())
			return -1;
		else
		  return 0;
	}

	@Override
	public double getArea() {
		
		return (2+4/Math.sqrt(2)) * side * side ;
	}

	@Override
	public double getPerimeter() {
		return 8 * side;
	}

	@Override
	protected Object clone() throws CloneNotSupportedException {
		return super.clone();
	}

	@Override
	public String toString() {
		return super.toString() + "\nArea: " + getArea() + 
				"\nPerimeter: " + getPerimeter();
	}


}

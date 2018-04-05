package com.liang.chapter9;

public class Rectangel {
	private double height = 1;
	private double width = 1;

	public Rectangel() {
	}

	public Rectangel(double height, double width) {
		this.height = height;
		this.width = width;
	}
	
 public double getArea(){
	 
	 return height*width;
 }
 
 public double getPerimeter(){
	 
	 return 2*(height+width);
 }


}

package com.liang.chapter13.Ex_11;

import java.util.Date;

public abstract class GeometricObject {
	private String colour="White";
	private boolean filled;
	private Date DateCreated;
	
	public GeometricObject() {
		DateCreated=new Date();
	}
	
	public GeometricObject(String colour, boolean filled) {
		this.colour = colour;
		this.filled = filled;
	}

	public String getColour() {
		return colour;
	}

	public boolean isFilled() {
		return filled;
	}

	public Date getDateCreated() {
		return DateCreated;
	}
	
  public abstract double getArea();
  public abstract double getPerimeter();


}

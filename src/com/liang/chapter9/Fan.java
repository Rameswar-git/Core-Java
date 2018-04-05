package com.liang.chapter9;

public class Fan {
	private static final int SLOW = 1;
	private static final int MEDIUM = 2;
	private static final int FAST = 3;

	private int speed;
	private boolean on;
	private double radius;
	private String colour;
	
	Fan() {
		speed = SLOW;
		on = false;
		radius = 5;
		colour = "blue";
	}

	public String getSpeed() {
		String s="";
		switch (speed) {
		case SLOW:
			s= "SLOW";
			break;
		case MEDIUM:
			s= "MEDIUM";
			break;
		case FAST:
			s= "FAST";
			break;	
		default:
			break;
		}
     return s;  
  }

	public void setSpeed(int speed) {
		this.speed = speed;
	}

	public boolean isOn() {
		return on;
	}

	public void setOn(boolean on) {
		this.on = on;
	}

	public double getRadius() {
		return radius;
	}

	public void setRadius(double radius) {
		this.radius = radius;
	}

	public String getColour() {
		return colour;
	}

	public void setColour(String colour) {
		this.colour = colour;
	}

	@Override
	public String toString() {
		if(on){
			return "Fan [speed=" + speed + ", on=" + on + ", radius=" + radius + ", colour=" + colour + "]";
		}else{
			return  "Fan ["+"radius=" + radius + ", colour=" + colour + "]";
		}
		
	}

}

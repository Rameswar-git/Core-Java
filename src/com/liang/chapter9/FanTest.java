package com.liang.chapter9;

public class FanTest {

	public static void main(String[] args) {
		final int SLOW=1;
		final int MEDIUM=2;
		final int FAST=3;
		
		
		
		Fan fnn1=new Fan();
		Fan fnn2=new Fan();
		
		fnn1.setColour("yellow");
		fnn1.setRadius(10);
		fnn1.setSpeed(FAST);
		fnn1.setOn(true);
		
		fnn2.setColour("blue");
		fnn2.setOn(false);
		fnn2.setRadius(5);
		fnn2.setSpeed(MEDIUM);
		
		
		System.out.println(fnn1.toString());
		System.out.println(fnn2.toString());
		
	}

}

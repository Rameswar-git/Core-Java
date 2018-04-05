package com.fas.asyncproducerconsumer;

import java.text.DecimalFormat;

public class Round {

	public static void main(String[] args) {
		DecimalFormat dFormat=new DecimalFormat("############");
		
		double t=0.6589;
		
		System.out.println(dFormat.format(t));
		
		System.out.println(Math.round(t));
		
		
		String tString="-0.7";
		
		if (!tString.contains("-0")) {
			System.out.println("Tet");
		}
		

	}

}

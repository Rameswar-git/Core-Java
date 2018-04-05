package com.practice;

import java.time.Clock;
import java.time.LocalDate;

public class Test {

	public static void main(String[] args) {
		System.out.println((int)(Math.random()*100));
		LocalDate date=LocalDate.now(Clock.systemUTC());
		System.out.println(date);
	}

}

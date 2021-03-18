package com.rameswar.hackerRank.PS;

import java.util.Scanner;

public class TheTimeinWords {

	public static void main(String[] args) {
		String[] timeNames = new String[] { "", "one", "two", "three", "four", "five", "six", "seven", "eight", "nine",
				"ten", "eleven", "twelve", "thirteen", "fourteen", "fifteen", "sixteen", "seventeen", "eighteen",
				"nineteen", "twenty", "twenty one", "twenty two", "twenty three", "twenty four", "twenty five",
				"twenty six", "twenty seven", "twenty eight", "twenty nine" };
		Scanner input = new Scanner(System.in);
		int hour = input.nextInt();
		int minute = input.nextInt();
		int nexthour = (hour % 12) + 1;
		if(minute == 0) {
			System.out.printf("%s o' clock\n",timeNames[hour]);
		}else  if(minute == 15) {
			System.out.printf("quarter past %s\n",timeNames[hour]);
		}else if(minute == 30) {
			System.out.printf("half past %s\n",timeNames[hour]);
		}else if(minute == 45) {
			System.out.printf("quarter to %s\n",timeNames[nexthour]);
		}else if(minute < 30) {
			if(minute == 1) {
				System.out.printf("%s minute past %s\n",timeNames[minute],timeNames[hour]);
			}else {
				System.out.printf("%s minutes past %s\n",timeNames[minute],timeNames[hour]);
			}
		}else {
			System.out.printf("%s minutes to %s\n",timeNames[60-minute],timeNames[nexthour]);
		}
		
		input.close();
	}

}

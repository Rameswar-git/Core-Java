package com.first;

/*
 * Developer Rameswar Prasad das
 */

import java.util.Scanner;

public class MaxOfThreeNumber {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Eneter The 1St Number");
        long no1=scanner.nextLong();
        System.out.println("Eneter The 2Nd Number");
        long no2=scanner.nextLong();
        System.out.println("Eneter The 3rd Number");
        long no3=scanner.nextLong();
        long maxnumber=Math.max(Math.max(no1, no2), no3);
        System.out.println("Maximum between::"+no1+","+no2+","+no3+" is "+maxnumber);
        scanner.close();
	}

}

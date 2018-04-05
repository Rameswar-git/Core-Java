package com.liange.chapter5;

import java.util.Scanner;

public class DecimalToOctal {

	public static void main(String[] args) {
         System.out.println("Provide a String To convert Decimal To Octal");
         Scanner sca=new Scanner(System.in);
         int decimal=sca.nextInt();
         String Octal="";
         for (int i = decimal; i>0; i/=8) {
        	 Octal=(i % 8)+Octal;
		}
         
         System.out.println("The Octal value is "+Octal);
	}

}

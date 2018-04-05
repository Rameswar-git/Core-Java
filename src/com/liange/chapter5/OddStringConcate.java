package com.liange.chapter5;

import java.util.Scanner;

public class OddStringConcate {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter a String To Print The Characters Ata odd Position");
        String ProvidedString=sc.nextLine();
        String evenstring="";
        for (int i = 0; i <= ProvidedString.length()-1; i++) {
			evenstring+=i % 2 == 0 ? ProvidedString.charAt(i):"";
		}
        System.out.println("The Even String is :: "+evenstring);
        sc.close();
	}

}

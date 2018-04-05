package com.liange.chapter5;

import java.util.Scanner;

public class UppercaseCharacterCount {

	public static void main(String[] args) {
        System.out.println("Enter a String To Find upper Case Charcter Count ");
        Scanner sc=new Scanner(System.in);
        String ProvidesString=sc.nextLine();
        int uppercasecounter=0;
   
        for (int i = 0; i < ProvidesString.length(); i++) {
			if(Character.isUpperCase(ProvidesString.charAt(i)))
				uppercasecounter++;
				
		}
        
        System.out.println("The Total No Of  Upper Case Character are :: "+uppercasecounter);
        	
	}

}

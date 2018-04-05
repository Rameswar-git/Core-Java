package com.liange.chapter5;

import java.util.Scanner;

public class ConsonantsAndVowels {

	public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter The String ::");
        String providedString=scanner.nextLine();
        int vowels=0,consonants=0;
        for (int i = 0; i < providedString.length(); i++) {
			if (Character.isLetter(providedString.charAt(i))) {
				
				if(Character.toUpperCase(providedString.charAt(i)) == 'A' ||
						Character.toUpperCase(providedString.charAt(i)) == 'E' ||
						Character.toUpperCase(providedString.charAt(i)) == 'I' ||
						Character.toUpperCase(providedString.charAt(i)) == 'O' ||
						Character.toUpperCase(providedString.charAt(i)) == 'U' 
						){
					vowels++;
				}else{
					consonants++;
				}
			}
		}
        
        System.out.println("No Of Consonants and Vowels in "+providedString+" is "+consonants+" "+vowels);
        scanner.close();
	}

}

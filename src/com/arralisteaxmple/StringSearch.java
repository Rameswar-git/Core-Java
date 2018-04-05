package com.arralisteaxmple;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;




public class StringSearch {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		System.out.println("Eneter The Main String");
		String text = scanner.nextLine();
		System.out.println("Eneter The String To Search");
		String search=scanner.nextLine();
		String wordToFind = search;
		Pattern word = Pattern.compile(wordToFind);
		Matcher match = word.matcher(text);

		while (match.find()) {
		     System.out.println("Found love at index "+ match.start() +" - "+ (match.end()-1));
		}
		scanner.close();
	}

 }

package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class SeparatetheNumbers {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int testCases = inpReader.nextInt();
		inpReader.nextLine();
		for (int i = 0; i < testCases; ++i) {
			String s = inpReader.nextLine();
			boolean found = s.length() > 1;
			long first = -1;
			for (int j = 1; j <= s.length()/2 && found; j++) {
				String test = s.substring(0, j);
				first = Long.parseLong(s.substring(0, j));
				long sec = Long.parseLong(test);
				while(test.length() < s.length()) {
					test+=Long.toString(++sec);
				}
				found = !test.equals(s);
			}
			if(found) {
				System.out.println("NO");
			}else if(first == -1){
				System.out.println("NO");
			}else {
				System.out.println("YES "+first);
			}
			
		}
		
	}

}

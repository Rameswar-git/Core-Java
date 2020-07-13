package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class BeautifulBinaryString {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		inpReader.nextLine();
		char[] arr = inpReader.nextLine().toCharArray();
		int altercount = 0;
		char[] pattern = { '0', '1', '0' };
		for (int i = 0; i < n; i++) {
			boolean  isequals = false;
			for (int j = i, m = 0; j < n && j < i + 3 && m < pattern.length; j++, m++) {
				if(pattern[m] == arr[j]) {
					isequals = true;
				}else{
					isequals = false;
					break;
				}
			}
			if(isequals) {
				if(i+2 < n) {
					arr[i+2] = '1';
					altercount++;
				}
			}
		}
		System.out.println(altercount);
	}
}

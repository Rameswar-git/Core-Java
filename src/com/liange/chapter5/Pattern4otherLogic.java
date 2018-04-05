package com.liange.chapter5;

public class Pattern4otherLogic {

	public static void main(String[] args) { 
		int spacecount=7;
		int startright=0;
		
		for (int row = 1; row <= 128; row+=row) {
			for (int i = 0; i <= spacecount; i++) {
				System.out.print("    ");
			}
			for (int l = 1; l <= row; l+=l) {
				System.out.printf("%4d", (l));
			}
			for (int p = startright ; p >= 1; p/=2) {
				System.out.printf("%4d", (p));
			}		
			spacecount--;
			startright=row;
			System.out.println();
		}

	}

}

package com.tst.program2;

public class AllPossibelSubstring {

	public static void main(String[] args) {
		String name="Vicky";
		
		for(int i=0;i<name.length();i++){
			for(int j=i;j<=name.length();j++){
				System.out.println(name.substring(i, j));
			}
			System.out.println();
		}

	}

}

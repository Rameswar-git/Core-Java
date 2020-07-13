package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class PalindromeIndex {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int teastCases = inpReader.nextInt();
		inpReader.nextLine();
		for (int t = 0; t < teastCases; t++) {
			System.out.println(palindromeIndex(inpReader.nextLine()));
		}
		inpReader.close();
	}
	
	static int palindromeIndex(String s){
    	for(int i =0,j =s.length()-1; i<j; i++, j--)
    		if(s.charAt(i)!=s.charAt(j))
    			if(isPalindrome(s, i))
    				return i;
    			else if(isPalindrome(s, j))
    					return j;
    	return -1;
    }
    
    static boolean isPalindrome(String s, int index){
		for(int i =index+1,j =s.length()-1-index; i<j; i++, j--)
    		if(s.charAt(i)!=s.charAt(j))
    			return false;
		return true;
	}

}

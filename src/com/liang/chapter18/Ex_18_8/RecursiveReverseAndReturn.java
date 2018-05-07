package com.liang.chapter18.Ex_18_8;

public class RecursiveReverseAndReturn {
	
	static int revno=0;
	
	private static int count=0;

	public static void main(String[] args) {
		
		
		System.out.println(RecursiveReve(123));
		
		System.out.println("No Of Times The Reverse Method Was Called is "+count);

	}

	private static int RecursiveReve(int i) {
		
		count++;
		
        if(i>0) {
        	revno=(i % 10)+(revno * 10);
        	RecursiveReve(i/10);
        	 
        }
		return revno;
 		
	}

}

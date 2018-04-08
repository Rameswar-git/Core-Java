package com.ArraysPrint;


import java.util.Arrays;

public class ArraysPrint {
  
	 public static void main(String[] args) {
		 int[] ins=new int[5];
		 
		 for (int i = 0; i < ins.length; i++) {
			 ins[i]=(int)(Math.random()*10);
		}
		 
		
		 System.out.println(Arrays.toString(ins));
		 
	}

}


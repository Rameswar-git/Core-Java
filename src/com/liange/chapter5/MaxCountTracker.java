package com.liange.chapter5;

import java.util.Scanner;

public class MaxCountTracker {

	public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       System.out.print("Enter The Number"); 
       int max=sc.nextInt();
       int count=1;
       int number = max;
       
       while(number>0){
    	   number=sc.nextInt();
    		if (number > max) {
				max=number;
				count=1;
			}else if (number == max) {
				count++;
			}       
       }
       
       System.out.println("The Max No is "+max +" And Its Count is "+count);
       
	}

}

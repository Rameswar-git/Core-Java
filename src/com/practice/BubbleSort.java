package com.practice;

import java.util.Scanner;


public class BubbleSort {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
	   System.out.println("Provide No elements need to sort");
	   int n=scanner.nextInt();
	   int[] array=new int[n];
	   System.out.println("Provide the elements for the array need to sort");
       for(int i=0;i<n;i++){
    	   array[i]=scanner.nextInt();
       }
         sort(array,n);
       
       System.out.println("after sorting The elemts of the array are");
       for(int i=0;i<n;i++){
    	  System.out.print( array[i]+" ");
       }
       scanner.close();
	}

	private static void  sort(int[] array, int n) {
		int j;
		for(int i=0;i<n;i++){			
			for(int k=0;k<n-1;k++){
				j=k+1;
				if(array[k]<array[j]){
					swap(array,k,j);
				}
			}
		}
		
	}

	private static void swap(int[] array, int i, int j) {
		int f=array[i];
		array[i]=array[j];
		array[j]=f;
	}

}

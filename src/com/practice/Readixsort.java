package com.practice;

import java.util.Scanner;

public class Readixsort {

	public static void main(String[] args) {
	   Scanner sc=new Scanner(System.in);
	   System.out.println("Enter How many no of elments you want to sort");
	   int n=sc.nextInt();
	   int[] a=new int[n];
	   System.out.println("Enter elemnts into array");
	   for(int i=0;i<n;i++){
		   a[i]=sc.nextInt();
	   }
	   
	   radix(a,n);
	   
	   System.out.println("After Sorting The elemnts of array are");
	   for(int i=0;i<n;i++){
		   System.out.print(a[i]+" ");
	   }
	   sc.close();

	}

	private static void radix(int[] a, int n) {
		int max=a[0],exp=1,i;
		int[] b=new int[n];
		for(i=1;i<n;i++){
			if(a[i]>max){
				max=a[i];
			}
		}
		while(max/exp >0){
			int[] bucket=new int[10];
			for(i=0;i<n;i++){
				bucket[(a[i]/exp) % 10]++;
			}
			for(i=1;i<10;i++){
				bucket[i]=bucket[i-1]+bucket[i];
			}
			for(i=n-1;i>=0;i--){
				b[--bucket[(a[i]/exp)%10]]=a[i];
			}
			for(i=0;i<n;i++){
				a[i]=b[i];
			}
			
			exp*=10;
		}
		
	}

}

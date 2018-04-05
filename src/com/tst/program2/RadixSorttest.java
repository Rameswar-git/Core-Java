package com.tst.program2;

import java.util.Scanner;

public class RadixSorttest {

	public static void main(String[] args) {
		 System.out.println("Radix Sort Test\n");
		 Scanner sc=new Scanner(System.in);
		 System.out.println("Enter No Elemnts To Be Sorted");
		 int n=sc.nextInt();
		 int[] a=new int[n];
		 System.out.println("Enter Elements Into Array");		 
		 for(int i=0;i<n;i++){
			 a[i]=sc.nextInt();
		 }
		  System.out.println("Before Sorting Elemnts Of Array  are");
			 for(int i=0;i<n;i++){				 
				 System.out.print(a[i]+"  ");
			}
			 		
			 Sorting(a);
			 
			 System.out.println("\n After Sorting Elemts Of Array are");
			 
			 for(int i=0;i<n;i++){				 
				 System.out.print(a[i]+"  ");
			}
			 
			 sc.close();
 }

	private static void Sorting(int[] a) {
		int i,m=a[0],exp=1,n=a.length;
		
		int[] b=new int[n];
		
		 for(i=0;i<n;i++){		
			 if(a[i]>m){
				 m=a[i];
			 }
		}
		 
		 while(m/exp>0){
			int[] bucket=new int[10];
			 for(i=0;i<n;i++){		
				 bucket[(a[i] / exp) % 10]++;
			}
			
			 for(i=1;i<10;i++){
				 bucket[i]+=bucket[i-1];
			 }
			 
			 for(i=n-1;i>=0;i--){
				 b[--bucket[(a[i]/exp) % 10]]=a[i];
			 }
			 
			 for(i=0;i<n;i++){
				 a[i]=b[i];
			 }
			 exp*=10;
		 }

		
	}
}
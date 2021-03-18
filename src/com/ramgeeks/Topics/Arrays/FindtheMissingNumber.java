package com.ramgeeks.Topics.Arrays;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class FindtheMissingNumber {

//	public static void main(String[] args) {
//		int n = 5, arr_sum = 0, sum = 0;
//		int[] arr = { 1, 2, 3, 5 };
//		for (int i = 1; i <= n; i++) {
//			if(i-1>=0 && i-1<arr.length)
//			 arr_sum += arr[i - 1];
//			sum += i;
//		}
//		System.out.println(sum-arr_sum);
//	}
	
	  // a represents the array 
    // n : Number of elements in array a 
    static int getMissingNo(int a[], int n)  
    { 
        int total = 1; 
        for (int i = 2; i <= (n + 1); i++) 
        { 
            total += i; 
            total -= a[i - 2]; 
        } 
        return total; 
    } 
  
    // Driver Code 
    public static void main(String[] args) 
    { 
        int[] arr = { 1, 2, 3, 5 }; 
        System.out.println(getMissingNo(arr, arr.length)); 
    } 

}

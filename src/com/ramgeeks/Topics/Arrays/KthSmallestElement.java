package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

public class KthSmallestElement {

	public static void main(String[] args) {
		int arr[] = {7 ,10, 4, 3, 20, 15};
		kthSmallest(arr,0,arr.length -1 , 3);
	}
	
    public static int kthSmallest(int[] arr, int l, int r, int k) 
    { 
    	Arrays.sort(arr);
    	return arr[k-1];
    } 

}

package com.ramgeeks.Topics.Arrays;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class NextPermutation {

	public static void main(String[] args) {

	}
	
    static List<Integer> nextPermutation(int N, int arr[]){
    	if(arr == null || arr.length <=1) return new ArrayList<Integer>(arr[0]);
    	int i = N - 2;
    	while(i >=0 && arr[i] >= arr[i+1]) i--;
    	if(i >= 0) {
    		int j = N-1;
    		while(arr[j] <= arr[i]) j--;
    		swap(arr,i,j);
    	}
    	reverse(arr, i+1, arr.length -1);
    	ArrayList<Integer> ans = new ArrayList<>();
    	for (int j = 0; j < arr.length; j++) {
			ans.add(arr[i]);
		}
    	return ans;
    }

	private static void reverse(int[] arr, int i, int j) {
		while(i < j) swap(arr,i++,j--);
	}

	public static void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}

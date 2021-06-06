package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;

public class TripletSum {

	public static void main(String[] args) {
		int[] arr = {1 ,4 ,45, 6 ,10, 8};

		find3Numbers(arr,6,13);
	}
	
    public static boolean find3Numbers(int A[], int n, int X) { 
		quickSort(A,0 , A.length-1);
        for (int j = 0; j < n - 2; j++) {
        	int l = j +1 , r = n-1;
            while(l < r) {
            	int sum = A[j]+A[l]+A[r];
            	if(sum == X)
            		return true;
            	else if(sum < X)
            		l++;
            	else
            		r--;
            }
		}
        return false;
     }

	private static void quickSort(int[] arr, int l, int r) {
		if(l < r) {
			int pivot = findPivot(arr,l,r);
			quickSort(arr,l,pivot -1);
			quickSort(arr,pivot + 1, r);
		}
	}

	private static int findPivot(int[] arr, int l, int r) {
		int pivot = arr[r];
		int i = l-1;
		for (int j = l; j <= r-1; j++) {
			if(arr[j] <= pivot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
			
		}
		int temp = arr[i+1];
		arr[i+1] = pivot;
		arr[r] = temp;
		return i+1;
	}

}

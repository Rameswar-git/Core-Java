package com.ramgeeks.Topics.Arrays;

public class FindMissingAndRepeating {

	public static void main(String[] args) {

	}

    int[] findTwoElement(int arr[], int n) {
        int[] result = new int[2];
        for (int i = 0; i < n; i++) {
        	int abs = Math.abs(arr[i]);
			if(arr[abs - 1] > 0)
				arr[abs - 1] = -arr[abs - 1];
				else
					result[0] = abs;
		}
        
        for (int i = 0; i < n; i++) {
			if(arr[i] > 0)
				result[1] = i + 1;
		}
        
        return result;
    }
}

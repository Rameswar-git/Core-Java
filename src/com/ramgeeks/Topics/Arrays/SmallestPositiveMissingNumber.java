package com.ramgeeks.Topics.Arrays;

/*
 * 
 * You are given an array arr[] of N integers including 0. The task is to find the smallest positive number missing from the array.

Example 1:

Input:
N = 5
arr[] = {1,2,3,4,5}
Output: 6
Explanation: Smallest positive missing 
number is 6.


 */

public class SmallestPositiveMissingNumber {

    // Driver code
    public static void main(String[] args)
    {
        int arr[] = { 0, 10, 2, -10, -20 };
        int arr_size = arr.length;
        int missing = missingNumber(arr, arr_size);
        System.out.println("The smallest positive missing number is " + missing);
    }
    
    static int missingNumber(int arr[], int size)
    {
    	boolean[] numbers = new boolean[size + 1];
    	
    	for (int i = 0; i < size; i++) {
			if(arr[i] > 0 && arr[i] <= size) {
				numbers[arr[i]] = true;
			}
		}
    	
    	for (int i = 1; i < size; i++) {
			if(!numbers[i])
				return i;
		}
    	
    	return size;
    	
    }
}

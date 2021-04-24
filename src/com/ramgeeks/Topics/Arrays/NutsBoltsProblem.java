package com.ramgeeks.Topics.Arrays;


public class NutsBoltsProblem {

	public static void main(String[] args) {
        char nuts[] = {'@', '#', '$', '%', '^', '&'};
        char bolts[] = {'$', '%', '&', '^', '@', '#'};
 
        matchPairs(nuts, bolts, 0, 5);
	}

	private static void matchPairs(char[] nuts, char[] bolts, int low, int high) {
		if(low < high) {
			int pivot = partation(nuts,low,high,bolts[high]);
			
			partation(bolts,low,high,nuts[pivot]);
			
			matchPairs(nuts, bolts, low, pivot - 1);
			matchPairs(nuts, bolts, pivot + 1, high);
			
		}
		
	}

	private static int partation(char[] arr, int low, int high, char pivot) {
		int i = low;
		char temp1, temp2;
		for (int j = low; j < high; j++) {
			if(arr[j] < pivot) {
				temp1 = arr[j];
				arr[j] = arr[i];
				arr[i] = temp1;
				i++;
				
			}else if(arr[j] == pivot) {
				temp2 = arr[j];
				arr[j] = arr[high];
				arr[high] = temp2;
				j--;
			}
		}
		
		char temp = arr[high];
		arr[high] = arr[i];
		arr[i] = temp;
		
		return i;
	}

}

package com.ramgeeks.Topics.Arrays;

import java.util.Arrays;
import java.util.HashMap;

public class MinSwapToSort {

	public static void main(String[] args) {
		int[] arr = { 7, 16, 14, 17, 6, 9, 5, 3, 18 };
		MinSwapToSort sw = new MinSwapToSort();
//		System.out.println(sw.minSwaps(arr,arr.length));
		System.out.println(sw.minSwaps(arr));
	}

	public int minSwaps(int nums[]) {
		int[] temp = Arrays.copyOfRange(nums, 0, nums.length);
		Arrays.sort(temp);
		HashMap<Integer, Integer> mp = new HashMap<>();
		for (int i = 0; i < nums.length; i++) {
			mp.put(nums[i], i);
		}
		int ans = 0;
		for (int i = 0; i < temp.length; i++) {
			if (temp[i] != nums[i]) {
				ans++;
			    int init= nums[i];
				swap(nums, i, mp.get(temp[i]));
				mp.put(init, mp.get(temp[i]));
				mp.put(temp[i], i);
			}
		}
		return ans;
	}

	private void swap(int[] nums, int i2, Integer ins) {
		int temp = nums[i2];
		nums[i2] = nums[ins];
		nums[ins] = temp;
	}

	// of swaps required to sort the array
	public int minSwaps(int[] arr, int N) {

		int ans = 0;
		int[] temp = Arrays.copyOfRange(arr, 0, N);

		// Hashmap which stores the
		// indexes of the input array
		HashMap<Integer, Integer> h = new HashMap<Integer, Integer>();

		Arrays.sort(temp);
		for (int i = 0; i < N; i++) {
			h.put(arr[i], i);
		}
		for (int i = 0; i < N; i++) {

			// This is checking whether
			// the current element is
			// at the right place or not
			if (arr[i] != temp[i]) {
				ans++;
				int init = arr[i];

				// If not, swap this element
				// with the index of the
				// element which should come here
				swap(arr, i, h.get(temp[i]));

				// Update the indexes in
				// the hashmap accordingly
				h.put(init, h.get(temp[i]));
				h.put(temp[i], i);
			}
		}
		return ans;
	}

	public void swap(int[] arr, int i, int j) {
		int temp = arr[i];
		arr[i] = arr[j];
		arr[j] = temp;
	}

}

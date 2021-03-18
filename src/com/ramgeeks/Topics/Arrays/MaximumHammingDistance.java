package com.ramgeeks.Topics.Arrays;

public class MaximumHammingDistance {

//	public static void main(String[] args) {
//		int[] arr = {4 ,1 ,1 };
//		int[] clone = arr.clone();
//		for (int i = 0; i < 1; i++) {
//			int j = arr[0];
//			for (int j2 = 1; j2 < arr.length; j2++) {
//				arr[j2 - 1] = arr[j2];
//			}
//			arr[arr.length - 1] = j;
//		}
//		
//		int cnt = 0;
//		
//		for (int i = 0; i < clone.length; i++) {
//			if(clone[i] != arr[i]) {
//				cnt++;
//			}
//		}
//		System.out.println(cnt);
//	}

//	public static void main(String[] args) {
//		int[] arr = { 4, 1, 1 };
//		int n = arr.length;
//		int[] hamArr = new int[n * 2];
//		prepare(hamArr, n, arr);
//		int maxHamDistance = 0;
//		for (int i = 1; i < n; i++) {
//			int currHam = 0;
//			for (int j = 1, k = 0; j < (i + n) && k < n; j++,k++) {
//				if (hamArr[j] != arr[k]) {
//					currHam++;
//				}
//			}
//			if (currHam == n) {
//				System.out.println(n);
//				return;
//			}
//			maxHamDistance = Math.max(maxHamDistance, currHam);
//		}
//		
//		System.out.println(maxHamDistance);
//	}
//
//	private static void prepare(int[] hamArr, int n, int[] arr) {
//		for (int i = 0; i < arr.length; i++) {
//			hamArr[i] = arr[i];
//		}
//
//		for (int i = 0; i < n; i++) {
//			hamArr[i + n] = arr[i];
//		}
//	}

	static int maxHamming(int arr[], int n) {
		// arr[] to brr[] two times so that
		// we can traverse through all rotations.
		int brr[] = new int[2 * n + 1];
		for (int i = 0; i < n; i++)
			brr[i] = arr[i];
		for (int i = 0; i < n; i++)
			brr[n + i] = arr[i];

		// We know hamming distance with
		// 0 rotation would be 0.
		int maxHam = 0;

		// We try other rotations one by one
		// and compute Hamming distance
		// of every rotation
		for (int i = 1; i < n; i++) {
			int currHam = 0;
			for (int j = i, k = 0; j < (i + n); j++, k++)
				if (brr[j] != arr[k])
					currHam++;

			// We can never get more than n.
			if (currHam == n)
				return n;

			maxHam = Math.max(maxHam, currHam);
		}

		return maxHam;
	}

	// driver code
	public static void main(String[] args) {
		int arr[] = { 4, 1, 1 };
		int n = arr.length;
		System.out.print(maxHamming(arr, n));
	}

}

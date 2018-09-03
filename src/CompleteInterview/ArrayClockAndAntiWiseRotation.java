package CompleteInterview;

import java.util.Arrays;

public class ArrayClockAndAntiWiseRotation {

	public static void main(String[] args) {
		int[] arr = { 1, 2, 3, 4, 5, 6, 7, 8 };
		int k = 4;
		// System.out.println("Rotate\n " + Arrays.toString(arr) + "\nby 4
		// places to the left.");

		// int[] rotatedArray = arrayLeftRotation(arr, arr.length, k);
		// System.out.println("\nRotated array:\n " +
		// Arrays.toString(rotatedArray));

		int[] rightrotatearray = arrayRightRotation(arr, arr.length, k);
		System.out.println("\nRotated array:\n " + Arrays.toString(rightrotatearray));
	}

	private static int[] arrayLeftRotation(int[] a, int n, int k) {
		for (int i = 0; i < k; i++) {
			int temp = a[0];
			for (int j = 0; j < n - 1; j++) {
				a[j] = a[j + 1];
			}
			a[n - 1] = temp;
		}
		return a;

	}

	private static int[] arrayRightRotation(int[] a, int n, int k) {
		for (int i = n - 1; i > k; i--) {
			int temp = a[n - 1];
			for (int j = n; j > 1; j--) {
				a[j - 1] = a[j - 2];
			}
			a[0] = temp;
		}
		return a;
	}

	// Array rotation using a now array

	// public static void main(String[] args) {
	// int[] integers = { 1, 2, 3, 4, 5, 6, 7, 8 };
	//
	// int[] rotated = new int[integers.length - 1];
	//
	// int k = 4;
	// int m = 0;
	// int t = integers.length - k - 1;
	//
	// for (int i = 0, l = 5; i < integers.length || l < integers.length; i++,
	// l++) {
	// if (l < integers.length) {
	// rotated[m++] = integers[l];
	// }
	// if (i < k) {
	// rotated[t++] = integers[i];
	// }
	//
	// }
	//
	// System.out.println(Arrays.toString(rotated));
	// }

}

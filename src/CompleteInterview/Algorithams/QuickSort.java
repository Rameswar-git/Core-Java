package CompleteInterview.Algorithams;

import java.util.Arrays;

public class QuickSort {

	public static void main(String[] args) {
		int[] arr = { 7, 5, 3, 9, 2, 6, 1, 4 };
		Sort(arr, 0, arr.length - 1);
		System.out.println(Arrays.toString(arr));

	}

	private static void Sort(int[] arr, int start, int end) {
		if (start < end) {
			int pp = Qs(arr, start, end);
			Sort(arr, start, pp - 1);
			Sort(arr, pp + 1, end);
		}
	}

	private static int Qs(int[] arr, int start, int end) {
		
		int piviot = arr[end];
		int i = start - 1;
		for (int j = start; j < end; j++) {
			if (arr[j] <= piviot) {
				i++;
				int temp = arr[j];
				arr[j] = arr[i];
				arr[i] = temp;
			}
		}

		int tmp2 = arr[i + 1];
		arr[i + 1] = piviot;
		arr[end] = tmp2;
		return i + 1;
	}

}

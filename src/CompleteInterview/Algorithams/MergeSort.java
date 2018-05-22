package CompleteInterview.Algorithams;

import java.util.Arrays;

public class MergeSort {

	public static void main(String[] args) {

		int[] arr = { 7,5,3,9,2,6,1,4 };

		Sort(arr, 0, arr.length - 1);

		Arrays.stream(arr).forEach(x -> System.out.print(x + " "));

	}

	private static void Sort(int[] arr, int start, int end) {

		if (end <= start) {
			return;
		}

		int mid = (start + end) / 2;

		Sort(arr, start, mid);
		Sort(arr, mid + 1, end);
		merge(arr, start, mid, end);
	}

	private static void merge(int[] arr, int start, int mid, int end) {
		int[] temparr = new int[end - start + 1];

		int leftslot = start;
		int rightslot = mid + 1;
		int k = 0;

		while (leftslot <= mid && rightslot <= end) {
			if (arr[leftslot] < arr[rightslot]) {
				temparr[k] = arr[leftslot];
				leftslot++;
			} else {
				temparr[k] = arr[rightslot];
				rightslot++;
			}
			k++;
		}

		if (leftslot <= mid) {
			while (leftslot <= mid) {
				temparr[k] = arr[leftslot];
				leftslot++;
				k++;
			}

		} else if (rightslot <= end) {
			while(rightslot <= end) {
				temparr[k] = arr[rightslot];
				rightslot++;
				k++;
			}

		}
		
		for (int i = 0; i < temparr.length; i++) {
			arr[start+i]=temparr[i];
		}

	}

}

package CompleteInterview;

public class IsArraysareRotated {

	public static void main(String[] args) {
		int[] a = { 1, 2, 3, 4, 5, 6, 7 };
		int[] b = { 4, 5, 6, 9, 1, 2, 3 };
		System.out.println(IsRotatedArrays(a, b));
	}

	private static boolean IsRotatedArrays(int[] a, int[] b) {
		if (a.length != b.length) {
			return false;
		}
		int keyelemnt = a[0];
		int indexinb = -1;
		for (int i = 0; i < b.length; i++) {
			if (b[i] == keyelemnt) {
				indexinb = i;
				break;
			}
		}
		if (indexinb == -1) {
			return false;
		}
		for (int i = 0; i < a.length; i++) {
			if (a[i] != b[(i + indexinb) % a.length]) {
				return false;
			}
		}
		return true;
	}

}

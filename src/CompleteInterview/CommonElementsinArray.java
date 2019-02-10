package CompleteInterview;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class CommonElementsinArray {

	public static void main(String[] args) {
        int[] array1A = {1, 3, 4, 6, 7, 9};
        int[] array2A = {1, 2, 4, 5, 9, 10};
		System.out.println(Arrays.toString(Commonelemnts(array1A,array2A)));
	}

	private static int[] Commonelemnts(int[] array1a, int[] array2a) {
		List<Integer> collect = Arrays.stream(array1a).boxed().collect(Collectors.toList());
		List<Integer> collect2 = Arrays.stream(array2a).boxed().collect(Collectors.toList());
	    collect.retainAll(collect2);
		return collect.stream().mapToInt(e -> e).toArray();
	}

}

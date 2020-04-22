package HackerRank;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.TreeSet;

public class MaximumSubarray {
	public static void main(String[] args) throws IOException {
		 long[] inarr = { 2, 2, 9, 9, 1 };
		// long[] inarr = { 1 ,5 ,9 };
//		long[] inarr = { 1, 5, 9 };
//		long[] inarr =Arrays.stream(Files.readAllLines(Paths.get("C:\\Users\\Vicky\\Desktop\\test1.txt")).get(0).split("\\s+")).mapToLong(p -> Long.parseLong(p)).toArray();
//		System.out.println(maximumSum(inarr, 1853237434));
//		 solve(1853237434,inarr);
		 solve(7,inarr);
	}

	static long maximumSum(long[] a, long m) {
		Arrays.sort(a);
		long max = 0;
		long[] array = Arrays.stream(a).filter(p -> p <= m - 1).sorted().toArray();
		for (long i = m - 1; i >= 0; i--) {
			long dis = Search(array, i);
			if (i == dis) {
				if (max < i) {
					max = i;
				}
			}
		}
		long[] array2 = Arrays.stream(a).filter(p -> p >= m + 1).sorted().toArray();
		for (int i = 0; i < array2.length; i++) {
			long l = array2[i];
			long val = l % m;
			if (max < val) {
				max = val;
			}
		}
		return max;
	}

	private static long Search(long[] array, long l) {

		int index = Arrays.binarySearch(array, l);
		if (index >= 0) {
			return l;
		}
		long search = l;
		long sum = 0;
		int i = 0;
		for (; i < array.length && sum <= search; i++) {
			sum += array[i];
			if (sum == search) {
				return l;
			}
		}
		for (int j = 0; j < array.length; j++) {
			long x = array[j];
			long remain = search - x;
			int index2 = Arrays.binarySearch(array, remain);
			if (index2 >= 0) {
				return l;
			}
		}

		return 0;
	}
	
    static void solve(long M, long[] array){
        TreeSet<Long> sumSet = new TreeSet<Long>();
        long best = 0;
        long sum = 0;

        for(int i = 0; i < array.length; i++){
            sum = (sum + array[i]) % M;
            Long up = sumSet.higher(sum);
            if(up == null){
                best = Math.max(best,sum);
            } else {
                best = Math.max(best, M - up + sum);
            }
            sumSet.add(sum);
        }

        System.out.println(best);
    }
}
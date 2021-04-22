package HackerRank;

import java.util.TreeSet;

public class CodeNation {

	public static void main(String[] args) {
		long[] inarr = { 1 ,1 ,9 ,9};
		System.out.println(maxsum(inarr,inarr.length,7));
	}
	
    private static long maxsum(long[] A, int n, long m) {
        long result = 0;
        
        TreeSet<Long> tree = new TreeSet<Long>();
        tree.add(0L);
        long sum = 0;

        for (int i=0; i<n; i++) {
            long a = A[i];
            sum = (sum + a) % m;
            long other = tree.ceiling(sum - m + 1);
            result = Math.max(result, sum - other);
            tree.add(sum - m);
        }
        
        return result;
    }

}

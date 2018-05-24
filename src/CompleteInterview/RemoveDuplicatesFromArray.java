package CompleteInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int[] ins= {5,6,8,5,4,6,9};
		
		System.out.println(" Before removing Duplicates The elements are "+Arrays.toString(ins));
		
		// Complete Remove of duplicates
		
		List<Integer> sdjhv=Arrays.stream(ins).boxed().collect(Collectors.toList());
		
		Integer[] nc=Arrays.stream(ins).boxed().filter(x -> Collections.frequency(sdjhv, x) < 2).toArray(Integer[]::new);
		
	  //  keep  each integre with single only
		
//		ins=Arrays.stream(ins).distinct().toArray();
		
		System.out.println(" After removing Duplicates The elements are "+Arrays.toString(nc));

	}

}

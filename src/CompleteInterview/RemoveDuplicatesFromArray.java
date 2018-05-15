package CompleteInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class RemoveDuplicatesFromArray {

	public static void main(String[] args) {
		
		int[] ins= {5,6,8,5,4,6,9};
		
		System.out.println(" Before removing Duplicates The elements are "+Arrays.toString(ins));
		
		
	List<int[]> sjhv=Arrays.asList(ins).stream()
			.filter( x -> Collections.frequency(Arrays.asList(ins), x) < 2).collect(Collectors.toList());
	
		
//		ins=Arrays.stream(ins).distinct().toArray();
		
		System.out.println(" Before removing Duplicates The elements are "+Arrays.toString(sjhv.get(0)));

	}

}

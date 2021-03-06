package CompleteInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class RepeatedCharacterinString {

	public static void main(String[] args) {
		
		String name="rameswar";
		
		
		Character[] cga=name.chars()
				.distinct().boxed().map(c -> (char)c.intValue()).toArray(Character[]::new);
		
		//Distincts only
//		System.out.println(Arrays.toString(cga));
		
		List<Integer> d=name.chars().boxed().collect(Collectors.toList());
		
		d.removeIf(x -> Collections.frequency(d,x)<2); // Remove All Repeated Character Completely
		
//		System.out.println(d.stream().map(c -> (char)c.intValue()).collect(Collectors.toList()));
		
		//   > 1  will find the repeated characters only form the characters array
		// < 2 will find the distinct characters

		String[] chars=name.chars()
				.filter(x -> Collections.frequency(name.chars()
						.boxed().collect(Collectors.toList()), x) > 1).distinct().mapToObj(c -> (char)c).map(s -> String.valueOf(s))
				.toArray(String[]::new);
		
		
		Map<Character,Integer> sdv=name.chars()
		.filter(x -> Collections.frequency(name.chars()
				.boxed().collect(Collectors.toList()), x) > 1).mapToObj(c -> (char)c)
		.collect(Collectors.toMap(q -> q,q -> 1, (old,neww)->  old+1 ));
		
		
		
		System.out.println(sdv);
		
		
//		System.out.println(Arrays.toString(chars));

	}

}

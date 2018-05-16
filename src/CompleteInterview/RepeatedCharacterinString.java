package CompleteInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.stream.Collectors;

public class RepeatedCharacterinString {

	public static void main(String[] args) {
		
		String name="rameswar";
		
		//   > 1  will find the repeated characters only form the characters array
		// < 2 will find the distinct characters

		String[] chars=name.chars()
				.filter(x -> Collections.frequency(name.chars()
						.boxed().collect(Collectors.toList()), x) > 1).distinct().mapToObj(c -> (char)c).map(s -> String.valueOf(s))
				.toArray(String[]::new);
		
		System.out.println(Arrays.toString(chars));

	}

}

package CompleteInterview.GeeksforGeeks.String;

import java.util.Arrays;
import java.util.Set;
import java.util.stream.Collectors;

public class RemoveDuplicates {

	public static void main(String[] args) {

		String text = "geeks for geeks";


		Set<String> distinct=Arrays.stream(text.split("\\s+"))
				.map(s -> s.chars().distinct()
						.collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString()).collect(Collectors.toSet());
				

		System.out.println(distinct);
	}

}

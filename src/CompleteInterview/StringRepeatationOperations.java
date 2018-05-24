package CompleteInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;
import java.util.stream.Collectors;

public class StringRepeatationOperations {

	public static void main(String[] args) {
		String name = "rameswar is good and rameswar is bad";

		// Distincts only
		System.out.println(Arrays.toString(Arrays.stream(name.split("\\s")).distinct().toArray(String[]::new)));

		List<String> names = Arrays.stream(name.split("\\s")).collect(Collectors.toList());

		List<String> namess = Arrays.stream(name.split("\\s")).filter(x -> Collections.frequency(names, x) <2).distinct()
				.collect(Collectors.toList());

		System.out.println(namess);

	}

}

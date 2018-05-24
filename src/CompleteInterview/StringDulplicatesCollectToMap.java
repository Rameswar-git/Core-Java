package CompleteInterview;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class StringDulplicatesCollectToMap {

	public static void main(String[] args) {
		String Txt = "rameswar is good rameswar is bad";


		Map<String, Integer> dnbc = Arrays.asList(Txt.split(" ")).stream()
				.collect(Collectors.toMap(x -> x.toString(), x -> 1, (oldValue, newValue) -> oldValue + 1));

		Map<String, Integer> collect = Arrays.stream(Txt.split(" "))
				.collect(Collectors.toMap(x -> x.toString(), x -> 1, (oldValue, newValue) -> oldValue + newValue));

		System.out.println(collect);

		System.out.println(dnbc);

	}

}

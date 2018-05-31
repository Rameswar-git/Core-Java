package CompleteInterview;

import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringRepeatedKthDistanceMove {

	public static void main(String[] args) {
		String input = "geeksforgeeks";
		
		final int noofseparation=2;

		Map<Character, Integer> collect = input.chars().mapToObj(p -> (char) p)
				.collect(Collectors.toMap(v -> v, v -> 1, (oldval, newval) -> oldval + 1));

		collect = collect.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		
		StringBuilder build = new StringBuilder();
	
		long n=collect.keySet().stream().count();

		while (n>0) {			
			int val = noofseparation+1;
				Iterator<Map.Entry<Character, Integer>> it = collect.entrySet().iterator();
				while (it.hasNext() && val > 0) {
					Map.Entry<Character, Integer> pair = it.next();
					if(pair.getValue() > 0) {
						build.append(pair.getKey());
						collect.put(pair.getKey(), pair.getValue() - 1);
						val--;
					}else {
						it.remove();
					}

				}
				n--;
		}

		System.out.println(build.toString());
	}

}
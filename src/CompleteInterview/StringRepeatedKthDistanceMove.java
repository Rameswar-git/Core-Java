package CompleteInterview;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class StringRepeatedKthDistanceMove {

	public static void main(String[] args) {
		String input = "geeksforgeeks";
		int repdistance = 2;

		Map<Character, Integer> collect = input.chars().mapToObj(p -> (char) p)
				.collect(Collectors.toMap(v -> v, v -> 1, (oldval, newval) -> oldval + 1));

		collect = collect.entrySet().stream().sorted(Map.Entry.<Character, Integer>comparingByValue().reversed())
				.collect(Collectors.toMap(Map.Entry::getKey, Map.Entry::getValue, (oldValue, newValue) -> oldValue,
						LinkedHashMap::new));
		
 

		int iterationcount = repdistance + 1;
		
		StringBuilder build=new StringBuilder();
		
		while(collect.keySet().stream().filter(e -> collect.get(e)>0).findAny().isPresent()) {
			while (iterationcount > 0) {
				int count=0;
				char c;
				while(true) {
					if(collect.get(count).intValue() > 0) {
						c=collect.keySet().stream().filter(e -> collect.get(e)>0).findFirst().get();
						build.append(c);
					}else {
						continue;
					}
				}
				
//				collect.keySet().stream().filter(e -> collect.get(e)>0).findAny().get();
				
				
				iterationcount--;
			}
			iterationcount=repdistance + 1;;
		}

 


		System.out.println(collect);
	}

}

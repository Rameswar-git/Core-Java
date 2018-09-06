package CompleteInterview;

import java.util.Arrays;
import java.util.Collections;
import java.util.Map;
import java.util.stream.*;

public class StringRepeatedCharactertoMapUsingJava8 {

	public static void main(String[] args) {
		String Test = "sfvkhzgsdvkjfVickykzshDvbjghzVickyk,zshdgfjvhkghsdjrfVickyskdfhjslefsdfvicky";
		
		Character[] chars=Test.chars().mapToObj(r -> (char)r).toArray(Character[]::new);

		Map<String,Integer> mps=Stream.of(chars).filter(f -> Collections.frequency(Arrays.asList(chars), f) > 1)
		  .collect(Collectors.toMap(p -> p.toString(), p -> 1 , (old,newval) -> Integer.parseInt(old.toString())+1)); 
		
		System.out.println(mps);

	}

}

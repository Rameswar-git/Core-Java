package CompleteInterview.GeeksforGeeks.String;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class RemoveDuplicates {

	public static void main(String[] args) {
		
		String text="geeks for geeks";
		
		Set<String> clear=new HashSet<>();
		
Arrays.stream(text.split(" "))
 .map(s -> s.chars().distinct().collect(StringBuilder::new, StringBuilder::appendCodePoint, StringBuilder::append).toString()).forEach(x -> clear.add(x));
		
    System.out.println(clear);
	}

}

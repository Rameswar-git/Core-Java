package CompleteInterview;

import java.util.OptionalInt;
import java.util.stream.IntStream;

public class StringReverse_PalindromerusingJava8 {

	public static void main(String[] args) {
		
		String name="121";
		
         OptionalInt findAny = IntStream.range(0, name.length())
         .filter(f -> name.charAt(f) != name.charAt(name.length()-f-1)).findAny();
         
         if(findAny.isPresent()) {
        	 System.out.println("Provided String is not palindrome");
         }else {
        	 System.out.println("Provided String is palindrome");
         }
         
	}

}

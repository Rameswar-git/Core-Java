package Usefulprograms;

import java.util.stream.IntStream;

public class CountUpperCaseLetters {

	public static void main(String[] args) {
        String text="Welcome to Java";
        
        long uppercasecount=IntStream.range(0, text.length()).filter(x -> (text.charAt(x)>='A' && text.charAt(x) <= 'Z')).count();
        
        System.out.println(" Total Upper Case Charcters in The given String "+uppercasecount);
	}

}

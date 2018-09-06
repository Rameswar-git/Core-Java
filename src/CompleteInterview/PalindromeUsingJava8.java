package CompleteInterview;

import java.util.stream.IntStream;

public class PalindromeUsingJava8 {

	public static void main(String[] args) {
              String name="123";
              StringBuilder build=new StringBuilder();
              
   IntStream.range(0, name.length())
              .map(x -> name.length()-1-x)
              .map(c -> name.charAt(c)).boxed().map(f -> build.append((char)f.intValue()));
              
           
              
           
           if(name.toString().equals(name)) {
        	   System.out.println(" The Provided No is Palindrome ");
           }else {
        	   System.out.println("not a Palindrome No");
           }
//              
	}

}

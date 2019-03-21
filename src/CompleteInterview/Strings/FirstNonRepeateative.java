package CompleteInterview.Strings;

import java.util.Arrays;
import java.util.BitSet;
import java.util.Collections;
import java.util.List;

public class FirstNonRepeateative {

	public static void main(String[] args) {
		
//		String name="viccviky";
			
		
//		   BitSet seen=new BitSet(), repeated=new BitSet();
//		   name.chars().forEachOrdered(c -> (seen.get(c)? repeated: seen).set(c));
//		    if(repeated.isEmpty()) System.out.println("first unique: "+name.charAt(0));
//		    else {
//		    	name.chars().filter(repeated::get).findFirst()
//		                 .ifPresent(c -> System.out.println("first repeated: "+(char)c));
//		    	name.chars().filter(c -> !repeated.get(c)).findFirst()
//		                 .ifPresent(c -> System.out.println("first unique: "+(char)c));
//		    }
		
		String name="geeksforgeeks";
		
		List<String> asList = Arrays.asList(name.split(""));
		
		
		Character bs=name.chars().mapToObj(g -> (char)g)
		      .filter(f -> Collections.frequency( asList , f.charValue()+"") == 1)
		                  .findFirst().get();
		
		System.out.println(bs);
	
			
	}

}

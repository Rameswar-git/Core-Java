package CompleteInterview;

import java.util.BitSet;

public class FirstNonRepeateative {

	public static void main(String[] args) {
		
		String name="viccviky";
			
		
		   BitSet seen=new BitSet(), repeated=new BitSet();
		   name.chars().forEachOrdered(c -> (seen.get(c)? repeated: seen).set(c));
		    if(repeated.isEmpty()) System.out.println("first unique: "+name.charAt(0));
		    else {
		    	name.chars().filter(repeated::get).findFirst()
		                 .ifPresent(c -> System.out.println("first repeated: "+(char)c));
		    	name.chars().filter(c -> !repeated.get(c)).findFirst()
		                 .ifPresent(c -> System.out.println("first unique: "+(char)c));
		    }
	
			
	}

}

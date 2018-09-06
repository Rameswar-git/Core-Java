package CompleteInterview;

public class FirstNonRepeatbelowjava7 {

	public static void main(String[] args) {
		String name = "viccviky";
		
		System.out.println(" The First Non Repeatiteve character in the String is "+firstNonRepeatedChar(name));
//		+getFirstNotRepeatedChar(name) == null?" All Characters are repeated here ":getFirstNotRepeatedChar(name));
		
//		for (int i = 1; i < name.length(); i++) {
//      char ch=name.charAt(i);
//      if(!(name.substring(0, i).contains(ch+"")) && !(name.substring(i+1, name.length()).contains(ch+""))) {
//     	 System.out.println("The First Non Repeating Character is "+ch);
//     	 break;
//      }
//	}
	
//	  Map<Integer,Long> characters = string.chars().boxed()
//	            .collect(Collectors.groupingBy(Function.identity(), LinkedHashMap::new, Collectors.counting()));
//	    return (char)(int)characters.entrySet().stream()
//	            .filter(e -> e.getValue() == 1L)
//	            .findFirst()
//	            .map(Map.Entry::getKey)
//	            .orElseThrow(() -> new RuntimeException("No unrepeated character"));

	}

//	public static Character getFirstNotRepeatedChar(String input) {
//
//		byte[] flags = new byte[256]; // all is initialized by 0
//
//		for (int i = 0; i < input.length(); i++) { // O(n)
//			flags[(int) input.charAt(i)]++;
//		}
//
//		for (int i = 0; i < input.length(); i++) { // O(n)
//			if (flags[(int) input.charAt(i)] == 1)
//				return input.charAt(i);
//		}
//
//		return null;
//	}
	
	public static char firstNonRepeatedChar(String input) {
	    char out = 0;
	    int length = input.length();
	    for (int i = 0; i < length; i++) {
	        String sub1 = input.substring(0, i);
	        String sub2 = input.substring(i + 1);
	        if (!(sub1.contains(input.charAt(i) + "") || sub2.contains(input
	                .charAt(i) + ""))) {
	            out = input.charAt(i);
	            break;
	        }
	    }
	    return out;
	}

}

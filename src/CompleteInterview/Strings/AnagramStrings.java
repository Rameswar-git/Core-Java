package CompleteInterview.Strings;

import java.util.Arrays;

public class AnagramStrings {

	public static void main(String[] args) {
		
        isAnagram("Keep", "Peek");  
        isAnagram("Mother In Law", "Hitler Woman");  
        
	}

	private static void isAnagram(String string, String string2) {
		
		char[] chars=string.replaceAll("\\s", "").toLowerCase().toCharArray();
		char[] chars2=string2.replaceAll("\\s", "").toLowerCase().toCharArray();
		
		Arrays.sort(chars);
		Arrays.sort(chars2);
		
		boolean flag=Arrays.equals(chars, chars2);
		
		if(flag) {
			System.out.println(" Both Strings are Anagram of each other ");
		}else{
			System.out.println(" Both Strings are not Anagrams ");
		}
		
	}

}

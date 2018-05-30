package CompleteInterview;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PalindromePairs {



	public static void main(String[] args) {
		// words = ["bat", "tab", "cat"]

		String[] strings = {"abcd", "dcba", "lls", "s", "sssll"};
		
			 
			 List<int[]> matrics=new ArrayList<>();
		

		for (int i = 0; i < strings.length - 1; i++) {
			for (int j = i + 1; j <= strings.length-1; j++) {
				boolean shdv=isPalindeomePossible(strings[i], strings[j])? matrics.add(new int[]{i,j}):false;
				boolean shdv2=isPalindeomePossible(strings[j],strings[i])? matrics.add(new int[]{j,i}):false;
			}

		}
		
		
	     matrics.stream().forEach(f -> {
	    	System.out.println(Arrays.toString(f));
	     });

	}


	private static boolean isPalindeomePossible(String string, String string2) {
	
		return new StringBuffer(string.concat(string2)).reverse().toString().equals(string.concat(string2));
	}

}

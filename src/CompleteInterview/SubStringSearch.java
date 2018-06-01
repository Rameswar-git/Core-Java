package CompleteInterview;

import java.util.List;
import java.util.stream.Collectors;

public class SubStringSearch {

	public static void main(String[] args) {
        String str = "abcxabcdabcdabcy";
        String subString = "abcdabcy";
        
        List<Character> characters = subString.chars().mapToObj(g -> (char)g).collect(Collectors.toList());
        
        int startindex=0;
        
        for (int i = 0; i < str.length(); i++) {
			if(!characters.contains(str.charAt(i))) {
				
				boolean containsAll = str.substring(startindex, i).chars()
				.mapToObj(f -> (char)f).collect(Collectors.toList()).containsAll(characters);
				
				if(containsAll) {
					System.out.println(" The Substring found from  "+str.subSequence(startindex, i));
					break;
				}else {
					startindex=i;
				}
			}
		}
        
		boolean containsAll = str.substring(startindex, str.length()).chars()
		.mapToObj(f -> (char)f).collect(Collectors.toList()).containsAll(characters);
		
		if(containsAll) {
			System.out.println(" The Substring found from  "+str.subSequence(startindex+1, str.length()));
		}
        
	}

}

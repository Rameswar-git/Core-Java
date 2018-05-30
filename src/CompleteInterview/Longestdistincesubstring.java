package CompleteInterview;

import java.util.ArrayList;
import java.util.List;

public class Longestdistincesubstring {

	public static void main(String[] args) {
         String text="ABDEFGABEF";
         List<Character> chara=new ArrayList<>();
         List<Character> longest=new ArrayList<>();
         int start=0;
         int maxlen=0;
         for (int i = 0; i < text.length(); i++) {
			if(chara.contains(text.charAt(i))) {
				if(maxlen < i-start) {
					longest.addAll(chara);
					maxlen=i-start;
					start=i;
				}
				chara.clear();
				chara.add(text.charAt(i));

			}else {
				chara.add(text.charAt(i));
			}
		}
         
         System.out.println(" Max length is "+maxlen);
         System.out.println(" Characters are "+longest);
         
	}

}

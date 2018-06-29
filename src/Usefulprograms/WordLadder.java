package Usefulprograms;

import java.util.Arrays;
import java.util.HashSet;
import java.util.List;
import java.util.Set;
import java.util.function.BiPredicate;
import java.util.stream.Collectors;

public class WordLadder {

	public static void main(String[] args) {
		String start = "hit";
		String end = "cog";
		String[] dict = new String[] { "hot", "dot", "dog", "lot", "log" };
		Set<String> nwset=new HashSet<>();
		List<String> setstrs=Arrays.asList(dict);
           System.out.println(start);
           
           
           
           BiPredicate<String,String> arrayintersection = (i,j) -> {
        	           	   
			   List<Character> stsfs=j.chars().mapToObj(c -> (char) c).collect(Collectors.toList());
			   
			   stsfs.removeAll(i.chars().mapToObj(c -> (char) c).collect(Collectors.toList()));
			      
			   
        	   return stsfs.size() == 1;
           }; 
           
		while (true) {
			String testaa=start;
			
			String test=setstrs.stream().filter(p -> arrayintersection.test(p,testaa)).filter(l -> nwset.add(l)).findAny().orElse("");
			
			if(arrayintersection.test(end,test)) {
				System.out.println(test);
				System.out.println(end);
				break;
			}else {
				System.out.println(test);
				start=test;
			}
		}

	}

}

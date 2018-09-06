package CompleteInterview;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

public class SmallestWindoworStringContaingAllCharacters  {

//	public static void main(String[] args) {
//		String name = "this is a test string";
//
//		String pattern = "tist";
//
//		List<Character> patternchars = pattern.chars().mapToObj(f -> (char) f).collect(Collectors.toList());
//		
//		List<String> Selectedstrings = new ArrayList<>();
//		for (int i = 0; i < name.length(); i++) {
//			for (int j = i; j <= name.length(); j++) {
//				if (name.substring(i, j).length() > pattern.length()
//						|| pattern.length() == name.substring(i, j).length()) {
//					String temp = name.substring(i, j);
//
//					if (patternchars.stream().allMatch(p -> temp.contains(p + ""))) {
//						List<Character> chara2 = temp.chars().mapToObj(m -> (char) m).collect(Collectors.toList());
//						boolean check = false;
//						for (int k = 0; k < patternchars.size(); k++) {
//							if (Collections.frequency(patternchars, patternchars.get(k)) == Collections.frequency(chara2,
//									patternchars.get(k))) {
//								check = true;
//							} else {
//								check = false;
//								break;
//							}
//						}
//						if (check)
//							Selectedstrings.add(temp);
//
//					}
//				}
//			}
//		}
//
//		Comparator<String> lengthcomper = (e1, e2) -> e1.length() > e2.length() ? -1 : 1;
//
//		String result = Selectedstrings.stream().min(lengthcomper.reversed()).get();
//
//		System.out.println(result);
//
//	}
	
	public static void main(String[] args) {
		String name = "this is a test string";
		String pattern = "tist";
		char[] charArray = pattern.toCharArray();
		String temp = pattern;
		String window = "this is a test string";
		for (int i = 0; i < name.length(); i++) {
			int j=i;
			while (temp.length() > 0 &&  j < name.length()) {
				temp = temp.replaceFirst(name.charAt(j) + "", "");
				j++;
			}
			String sub = name.substring(i, j);

			boolean test=true;
			for (int k = 0; k < charArray.length; k++) {
				char ch=pattern.charAt(k);
				if(!sub.contains(ch+"")){
					test=false;
					break;
				}
			}
			if (sub.length() < window.length() && test ) {
				window = sub;
			}
			temp=pattern;
		}
		
		System.out.println(window);
	}

}
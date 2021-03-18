package CompleteInterview.GeeksforGeeks.String;

import java.util.HashSet;
import java.util.Set;

public class LongestDistinctCharSeq {

//	public static void main(String[] args) {
//		
//		String name="abcclmnqraac";
//          //	"abababcdefababcdab";
//		
//		int start=0;
//		
//		int end=name.length()-1;
//		
//		int maxlength=0;
//		
//		int n=name.length()-1;
//		
//		while(n > 0) {
//			char c=name.charAt(n);
//			int last=n;
//			while(true && n>0) {
//				if(c == name.charAt(n-1)) {
//					if((last-n)>maxlength) {
//						start=n;
//						end=last;
//						maxlength=last-n;
//					}
//					break;
//				}else {
//					n--;
//				}	
//			}
//			n--;
//		}
//		
//		System.out.println(name.substring(start, end-1));
//
//	}
	
	public static void main(String[] args) {
		String name = "dvdf";

//		StringBuilder build = new StringBuilder();
//
//		String maxstring = "";
//
//		for (int i = 0; i < name.length(); i++) {
//			if (!build.toString().contains(name.charAt(i) + "")) {
//				build.append(name.charAt(i));
//			} else {
//				if (maxstring.length() < build.toString().length()) {
//					maxstring= build.toString();
//				}
//				build.setLength(0);
//				build.append(name.charAt(i));
//			}
//		}
//		
//		if (maxstring.length() < build.toString().length()) {
//			maxstring= build.toString();
//		}
		
		System.out.println("The Longest Substring is "+lengthOfLongestSubstring(name));

	}
	
	    public static int lengthOfLongestSubstring(String s) {
	        int n = s.length();
	        Set<Character> set = new HashSet<>();
	        int ans = 0, i = 0, j = 0;
	        while (i < n && j < n) {
	            // try to extend the range [i, j]
	            if (!set.contains(s.charAt(j))){
	                set.add(s.charAt(j++));
	                ans = Math.max(ans, j - i);
	            }
	            else {
	                set.remove(s.charAt(i++));
	            }
	        }
	        return ans;
	    }

}

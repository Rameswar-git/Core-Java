package CompleteInterview;

import java.util.Arrays;

public class IsomorphicString {
//     static final int size=256;
//	public static void main(String[] args) {
//        System.out.println(isIsomorphic("abc","cxl"));
//	}
//	private static boolean isIsomorphic(String string, String string2) {
//		
//		int n=string.length();
//		int m=string2.length();
//		
//		if(m!=n) {
//			return false;
//		}
//
//		boolean[] marks=new boolean[size];		
//		int[] ins=new int[256];
//		
//		Arrays.fill(marks, Boolean.FALSE);
//		Arrays.fill(ins, -1);
//		
//		for (int i = 0; i < n; i++) {
//			
//			if (ins[string.charAt(i)] == -1) {
//				
//				if(marks[string2.charAt(i)] == true) {
//					return false;
//				}
//				
//				marks[string2.charAt(i)]=true;
//				
//				ins[string.charAt(i)]=string2.charAt(i);
//				
//			}
//			
//			if(ins[string.charAt(i)] != string2.charAt(i)) {
//				return false;
//			}
//
//		}
//		
//		return true;
//		
//	}
	
	public static void main(String[] args) {
		String text1 = "good";
		String text2 = "deer";
          boolean isisomorphic=true;
		for (int i = 1; i < text1.length() - 1; i++) {
			if ((text1.charAt(i) == text1.charAt(i - 1)) && (text2.charAt(i) == text2.charAt(i - 1))) {

			} else if ((text1.charAt(i) != text1.charAt(i - 1)) && (text2.charAt(i) != text2.charAt(i - 1))) {

			} else {
				isisomorphic=false;
				System.out.println(" both Strings are not Isomorphic ");
				break;
			}
		}
		
		if(isisomorphic)
			System.out.println(" Both Strings are Isomorphic ");

	}

}

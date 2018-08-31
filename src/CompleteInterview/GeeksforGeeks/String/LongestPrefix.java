package CompleteInterview.GeeksforGeeks.String;

import java.util.Arrays;
import java.util.Comparator;

public class LongestPrefix {
	
	// Old Process

//	public static void main(String[] args) {
//
//		String[] names = { "geeksforgeeks", "geeks", "geek", "geezer" };
//		String common = "";
//
//		for (int i = 0; i < names.length-1 ; i++) {
//			int n = 0;
//			
//			int len=names[i].length() > names[i + 1].length() ? names[i + 1].length():names[i].length();
//			common="";
//			while (len > 0) {
//				if (names[i].charAt(n) == names[i + 1].charAt(n)) {
//					common = common+names[i].charAt(n);
//					n++;
//					len--;
//				} else {
//					break;
//				}
//
//			}
//		}
//		
//		System.out.println(common);
//
//	}
	
	public static void main(String[] args) {
		String[] names = { "geeksforgeeks", "geeks", "geek", "geezer" };

		Comparator<String> comp = (p1, p2) -> {
			return p1.length() - p2.length();
		};

		String str = Arrays.stream(names).sorted(comp).findFirst().get();

		StringBuilder build = new StringBuilder();

		for (int i = str.length() - 1; i >= 0; i--) {
			boolean isprefix = true;
			String sub = str.substring(0, i + 1);
			for (int j = 0; j < names.length; j++) {
				if (!names[j].startsWith(sub)) {
					isprefix = false;
				}
			}
			if (isprefix) {
				build.append(sub);
				break;
			}
		}

		System.out.println(build.toString());

	}

}

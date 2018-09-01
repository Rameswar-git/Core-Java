package CompleteInterview.GeeksforGeeks.String;

public class CheckStringRotations {

//	public static void main(String[] args) {
//
//		String str1 = "amazon";
//
//		String str2 = "onamaz";
//
//		char c = 'a';
//
//
//		for (int i = 0; i < str2.length(); i++) {
//			if (str2.charAt(i) == c) {
//				str2 =   str2.substring(i, str2.length())+str2.substring(0, i);
//				break;
//			}
//		}
//
//		if (str1.equals(str2)) {
//			System.out.println(" Matches in Clockwise ");
//		}
//
//	}
	
	public static void main(String[] args) {

		String a = "ABCD";
		String b = "CDAB";

		boolean test = false;
		for (int i = 1; i < a.length(); i += 2) {
			String sub = a.substring(i - 1, i + 1);
			for (int j = sub.length() - 1, m = b.length() - i ; j >= 0 && m >= 0; j--, m--) {
				if (!(b.charAt(m) == sub.charAt(j))) {
					test = true;
					break;
				}
			}

		}

		if (test) {
			System.out.println(" The String is not rotated ");
		} else {
			System.out.println(" The Characters are rotated ");
		}

	}

}

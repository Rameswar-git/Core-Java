package CompleteInterview.GeeksforGeeks.String;

public class StringRotation { //Not working for the characters of length three

//	public static void main(String[] args) {
//		String str1 = "ABCD";
//		String str2 = "CDAB";
//
//		checkclockwiserotation(str1, str2);
//
//	}
//
//	private static void checkclockwiserotation(String str1, String str2) {
//		boolean test = true;
//		outerloop: for (int i = 1; i < str1.length(); i += 2) {
//
//			String value = str1.substring(i - 1, i + 1);
//
//			int stleln = value.length() - 1;
//
//			for (int j = str2.length() - i, m = stleln; j >= 0 && m >= 0; j--, m--) {
//				if (str2.charAt(j) != value.charAt(m)) {
//					test = false;
//					break outerloop;
//				}
//			}
//
//		}
//		if (test)
//			System.out.println(" Clock wise rotated ");
//		else
//			System.out.println("Clock wise not rotated  ");
//
//	}
	
	public static void main(String[] args) {
		String str1 = "ABCD";
		String str2 = "CDAB";
		 String joined=str1+str1;	
		 if(joined.contains(str2)) {
			 System.out.println("Strings are rotated");
		 }else {
			 System.out.println("Strings are not rotated");
		 }
	}

}

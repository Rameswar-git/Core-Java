package CompleteInterview.GeeksforGeeks.String;

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
		String name = "ABDEFGABEFZMTLLPOQR";

		StringBuilder build = new StringBuilder();

		String maxstring = "";

		for (int i = 0; i < name.length(); i++) {
			if (!build.toString().contains(name.charAt(i) + "")) {
				build.append(name.charAt(i));
			} else {
				if (maxstring.length() < build.toString().length()) {
					maxstring= build.toString();
				}
				build.setLength(0);
				build.append(name.charAt(i));
			}
		}
		
		if (maxstring.length() < build.toString().length()) {
			maxstring= build.toString();
		}
		
		System.out.println("The Longest Substring is "+maxstring);

	}


}

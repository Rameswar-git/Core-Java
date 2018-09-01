package CompleteInterview.GeeksforGeeks.String;

public class LongestSubString {

	// public static void main(String[] args) {
	//
	// String st1="abcd458963xyz";
	// String st2="xyzab458963cd";
	//
	// String maxst="";
	//
	// for (int i = 1,k=st2.length(); i <= st2.length() && k>=0; i++,k--) {
	//
	// if(st1.contains(st2.substring(0,i)) && maxst.length() <
	// st2.substring(0,i).length()) {
	// maxst=st2.substring(0,i);
	// }
	// if(st1.contains(st2.substring(k,st2.length())) && maxst.length() <
	// st2.substring(0,i).length()) {
	// maxst=st2.substring(k,st2.length());
	// }
	//
	// }
	//
	// System.out.println(" The Longest Common String between this two is "+maxst+"
	// and its length is "+maxst.length());
	//
	// }

	public static void main(String[] args) {

		String st1 = "abcd458963xyzlmrq";
		String st2 = "xyzlmrqab458963cd";

		StringBuilder build = new StringBuilder();
		int k = 0;
		outerloop: while (k < st1.length()) {
			for (int j = k; j < st1.length(); j++) {
				String substring = st1.substring(k, j + 1);
				if (st2.indexOf(substring) >= 0) {
					if (build.toString().length() < substring.length()) {
						build.setLength(0);
						build.append(substring);
					} else if (k + substring.length() == st1.length()) {
						break outerloop;
					}

				} else {
					k = j;
					break;
				}
			}

		}

		System.out.println(" The Longest Common Substring is " + build.toString());

	}

}

package CompleteInterview;


public class OneAwayStrings {

	public static void main(String[] args) {
        System.out.println(isOneAway("abcde", "abcd"));;  // should return true
        System.out.println(isOneAway("abde", "abcde"));;  // should return true
        System.out.println(isOneAway("a", "a"));;  // should return true
        System.out.println(isOneAway("abcdef", "abqdef"));;  // should return true
        System.out.println(isOneAway("abcdef", "abccef"));;  // should return true
        System.out.println(isOneAway("abcdef", "abcde"));;  // should return true
        System.out.println(isOneAway("aaa", "abc"));;  // should return false
        System.out.println(isOneAway("abcde", "abc"));;  // should return false
        System.out.println(isOneAway("abc", "abcde"));;  // should return false
        System.out.println(isOneAway("abc", "bcc"));;  // should return false
	}

	private static boolean isOneAway(String string, String string2) {
        if (string.length() - string2.length() >= 2 || string2.length() - string.length() >= 2) {
            return false;
        }
		if(string.length() == string2.length()) {
			return SamelengthComper(string,string2);
		}else {
			if(string.length()<string2.length()) {
				return DifferentLengthComper(string2,string);
			}else {
				return DifferentLengthComper(string,string2);
			}
			
		}
		
	}

	private static boolean DifferentLengthComper(String string, String string2) {
		int diffcount=0;
		for (int i = 0; i < string2.length();) {
			if(!(string2.charAt(i) == string.charAt(i+diffcount))) {
				diffcount++;
			}else {
				i+=1;
			}
		}
		if(diffcount>1)
		     return false;
		else
			return true;
	}

	private static boolean SamelengthComper(String string, String string2) {
		int diffcount=0;
		for (int i = 0; i < string.length(); i++) {
			if(string.charAt(i)!=string2.charAt(i)) {
				diffcount++;
			}
		}
		if(diffcount>1)
			return false;
		else
			return true;
	}
}

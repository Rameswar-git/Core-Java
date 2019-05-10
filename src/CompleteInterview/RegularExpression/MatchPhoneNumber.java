package CompleteInterview.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class MatchPhoneNumber {

	public static void main(String[] args) {
		isValidPhone("+91 9238990601");
	}

	private static void isValidPhone(String str) {
//		Pattern pat = Pattern.compile("^(\\+91[\\-])(\\d{10})");
		
//		Pattern pat = Pattern.compile("[789][\\d]{9}");
		
//		Pattern pat = Pattern.compile("^[0](\\d{3}[\\-]?)[\\d]{7}");
		
		//Land Line No Check
		Pattern landlineno = Pattern.compile("^(0\\d{3})([\\s+]|[-])(\\d{7})");
		Matcher match = landlineno.matcher("0680-2221709");
		System.out.println(match.matches());
		
//		Pattern pat = Pattern.compile("^(\\+91[-]?[\\s]?)(\\d{10})");
//		
//		Matcher match = pat.matcher(str);
//		System.out.println(match.matches());
	}

}

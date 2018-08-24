package CompleteInterview.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringReplace2ndOccuranceonward {

	public static void main(String[] args) {

		String name = "hello hello hello";

		// StringBuffer replace = new StringBuffer(name).replace(10, 15,
		// "Java");

		// System.out.println(replace.toString());

		Pattern oats = Pattern.compile("hello");

		Matcher magtc = oats.matcher(name);
		

		while (magtc.find()) {
			if (magtc.start() > 0) {
				if (magtc.regionEnd() == magtc.end()) {
					StringBuffer replace = new StringBuffer(name).replace(magtc.start() - 1, magtc.end(), "Java");
					name = replace.toString();
				} else {
					StringBuffer replace = new StringBuffer(name).replace(magtc.start(), magtc.end(), "Java");
					name = replace.toString();
				}
			}
		}
		
		System.out.println(name);

	}

}

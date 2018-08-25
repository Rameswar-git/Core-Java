package CompleteInterview.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class CommaAndDotRegex {

	public static void main(String[] args) {

		Pattern pats = Pattern.compile("\".+?\"");

		Matcher match = pats.matcher("earth has \"mountains\" and many \"seas\" to explore");

		while (match.find()) {
            System.out.println(match.start());
            System.out.println(match.end());
		}

	}

}

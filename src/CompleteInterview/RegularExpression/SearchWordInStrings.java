package CompleteInterview.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class SearchWordInStrings {

	public static void main(String[] args) {
		// String candidateString = "This is a java program. java This is
		// another java program.";
		//
		// Pattern pats = Pattern.compile("java");
		//
		// Matcher match = pats.matcher(candidateString);
		//
		// while (match.find()) {
		// System.out.println(match.start());
		// }

		String anotherstring = "sairamkrishna mammahepoint Tutorials Point Pvt Ltd";

		Pattern patr = Pattern.compile("point", Pattern.CASE_INSENSITIVE);

		Matcher mat = patr.matcher(anotherstring);

		while (mat.find()) {
			System.out.println(mat.start());
		}

	}

}

package CompleteInterview;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class RegexMatches {

	public static void main(String[] args) {

		String line = "This order was placed 9298 for QT3000! OK?";

		String pattern = "\\d+";
		Pattern loc = Pattern.compile(pattern);
		Matcher mat1 = loc.matcher(line);

//		if (mat1.find()) {
//			System.out.println(" Found in Value in " + mat1.group(0));
//			System.out.println(" Found in Value in " + mat1.group(1));
//			System.out.println(" Found in Value in " + mat1.group(2));
//		}
		
		while(mat1.find()) {
			System.out.println(" Found in Value in " + mat1.start()+"  end "+(mat1.end()-1));
		}

	}

}

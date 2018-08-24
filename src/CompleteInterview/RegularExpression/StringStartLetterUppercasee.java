package CompleteInterview.RegularExpression;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class StringStartLetterUppercasee {

	public static void main(String[] args) {

	      String str = "this is a java test";
	      System.out.println(str);
	      StringBuffer stringbf = new StringBuffer();
	      Matcher m = Pattern.compile(
	         "([a-z])([a-z]*)", Pattern.CASE_INSENSITIVE).matcher(str);
	      
	      
	      while (m.find()) {
	    	  System.out.println(m.group(1));
	    	  System.out.println(m.group(2));
	         m.appendReplacement(
	            stringbf, m.group(1).toUpperCase() + m.group(2).toLowerCase());
	      }
	      System.out.println(stringbf.toString());

	}

}

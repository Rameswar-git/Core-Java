package CompleteInterview;

public class StringRepeatedCharacterUsingIndexSubString {

	public static void main(String[] args) {
		String text = "rameswar is good rameswar is bad";

		String Providedstr = "is";

		while (true) {
			if (text.contains(Providedstr)) {
				System.out.println(Providedstr + " was found in index " + text.indexOf(Providedstr));
				text=text.substring(text.indexOf(Providedstr)+Providedstr.length());
			}else {
				break;
			}
		}
	}

}

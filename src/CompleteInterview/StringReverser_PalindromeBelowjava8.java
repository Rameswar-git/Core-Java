package CompleteInterview;

public class StringReverser_PalindromeBelowjava8 {

	public static void main(String[] args) {

		String name = "ram";

		int stringlength = name.length();

		boolean ispalindrome = true;

		for (int i = 0; i < name.length(); i++) {
			if (name.charAt(i) != name.charAt(stringlength - i - 1)) {
				ispalindrome = false;
				break;
			}
		}
		if (ispalindrome) {
			System.out.println(" Its an Palindrome String ");
		} else {
			System.out.println(" Its not an Palindrome String ");
		}

		boolean isReversed = new StringBuffer(name).reverse().toString().equals(name);

		if (isReversed) {
			System.out.println(" String is Plaindrrome using inbuild methods  ");
		} else {
			System.out.println("The Provide string is not Palindrome using inbuild Methods  ");
		}

	}

}

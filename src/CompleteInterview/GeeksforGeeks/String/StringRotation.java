package CompleteInterview.GeeksforGeeks.String;

public class StringRotation {

	public static void main(String[] args) {
		String str1 = "ABAD";
		String str2 = "ADAB";

		checkclockwiserotation(str1, str2);

	}

	private static void checkclockwiserotation(String str1, String str2) {
		boolean test = true;
		outerloop: for (int i = 1; i < str1.length(); i += 2) {

			String value = str1.substring(i - 1, i + 1);

			int stleln = value.length() - 1;

			for (int j = str2.length() - i, m = stleln; j >= 0 && m >= 0; j--, m--) {
				if (str2.charAt(j) != value.charAt(m)) {
					test = false;
					break outerloop;
				}
			}

		}
		if (test)
			System.out.println(" Clock wise rotated ");
		else
			System.out.println("Clock wise not rotated  ");

	}

}

package CompleteInterview.GeeksforGeeks.String;

public class CheckStringRotations {

	public static void main(String[] args) {

		String str1 = "amazon";

		String str2 = "onamaz";

		char c = 'a';

		// Anticlockwise checking

		// for (int i = str2.length()-1; i >= 0 ; i--) {
		// if(str2.charAt(i) == c) {
		// str2=str2.substring(i, str2.length())+str2.substring(0, i);
		// break;
		// }
		// }

		// Clockwise checking

		for (int i = 0; i < str2.length(); i++) {
			if (str2.charAt(i) == c) {
				str2 =   str2.substring(i, str2.length())+str2.substring(0, i);
				break;
			}
		}

		// if(str1.equals(str2)) {
		// System.out.println(" Matches in Anti Clockwise ");
		//
		// }

		if (str1.equals(str2)) {
			System.out.println(" Matches in Clockwise ");
		}

	}

}

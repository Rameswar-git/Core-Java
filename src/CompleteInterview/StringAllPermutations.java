package CompleteInterview;

public class StringAllPermutations {

	public static void main(String[] args) {

		String Text = "ABC";

		Stringallpermutations("", Text);

	}

	private static void Stringallpermutations(String prefix, String text) {

		int n = text.length();

		if (n == 0) {
			
			System.out.println(prefix);
		}

		for (int i = 0; i < text.length(); i++) {
			Stringallpermutations(prefix+text.charAt(i),text.substring(0,i)+text.substring(i+1,n));
		}

	}

}

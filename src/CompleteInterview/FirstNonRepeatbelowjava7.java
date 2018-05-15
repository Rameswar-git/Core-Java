package CompleteInterview;

public class FirstNonRepeatbelowjava7 {

	public static void main(String[] args) {
		String name = "viccviky";
		
		System.out.println(" The First Non Repeatiteve character in the String is "
		+getFirstNotRepeatedChar(name) == null?" All Characters are repeated here ":getFirstNotRepeatedChar(name));

	}

	public static Character getFirstNotRepeatedChar(String input) {

		byte[] flags = new byte[256]; // all is initialized by 0

		for (int i = 0; i < input.length(); i++) { // O(n)
			flags[(int) input.charAt(i)]++;
		}

		for (int i = 0; i < input.length(); i++) { // O(n)
			if (flags[(int) input.charAt(i)] == 1)
				return input.charAt(i);
		}

		return null;
	}

}

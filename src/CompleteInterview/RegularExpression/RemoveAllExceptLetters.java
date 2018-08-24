package CompleteInterview.RegularExpression;

public class RemoveAllExceptLetters {

	public static void main(String[] args) {
		String name="$rame123swar#.";
		
		System.out.println(name.replaceAll("\\P{L}", ""));
	}

}

package CompleteInterview;

public class StringOddPositionCharacterPrint {

	public static void main(String[] args) {
		String text = "Beijing Chicago";
		
		for (int i = 0; i < text.length(); i++) {
			if (!((i+1) % 2 == 0)) {
               System.out.print(text.charAt(i)+" ");
			}
		}
	}

}

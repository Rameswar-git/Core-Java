package CompleteInterview;

public class AllPossibleSubString {

	public static void main(String[] args) {
		String text = "Hello";
		
       for (int j = 0; j <= text.length(); j++) {
   		for (int i = j; i <= text.length(); i++) {
            System.out.print(text.substring(i, text.length())+"\n");
 		}
   		System.out.println();
	}

	}

}

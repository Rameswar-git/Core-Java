package CompleteInterview;


public class RemoveExtraWhiteSpaces {


	public static void main(String[] args) {
		String txt = "GEEKS    FOR   GEEKS";
		StringBuilder build = new StringBuilder();

		int count=0;
		for (int i = 0; i < txt.length(); i++) {
			build.append((count == 0 || txt.charAt(i) !=32) ?txt.charAt(i):"");
			count=txt.charAt(i)!=32 ? 0:count+1;
		}
		
  System.out.println(build.toString());


	}

}

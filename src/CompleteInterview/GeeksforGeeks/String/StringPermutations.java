package CompleteInterview.GeeksforGeeks.String;

public class StringPermutations {

	public static void main(String[] args) {
		
		StringPermutation("","ABC");

	}

	private static void StringPermutation(String prefix,String string) {
		int n=string.length();
		if(n == 0) {
			System.out.println(prefix);
		}else {
			for (int i = 0; i < string.length(); i++) {
				StringPermutation(prefix+string.charAt(i),string.substring(0,i)+string.substring(i+1,n));
			}
			
		}
		
	}

}

package CompleteInterview;

public class StringReverserinPlace {

	public static void main(String[] args) {
		
		String sample="1234";
		StringBuilder build=new StringBuilder(sample);
		
		for (int i = 0; i < sample.length()/2 ; i++) {
			
			int othereend=sample.length()-i-1 	;
			char c=sample.charAt(i);
			build.setCharAt(i, build.charAt(othereend));
			build.setCharAt(othereend, c);
		}
		
		System.out.println(build.toString());

	}

}

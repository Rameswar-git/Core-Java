package CompleteInterview;

public class StringReverserinPlace {

	public static void main(String[] args) {
		
		String sample="12345";
		StringBuilder build=new StringBuilder(sample);
		
		for (int i = 0; i < sample.length()/2 ; i++) {
			
			int othereend=sample.length()-i-1 	;
			char c=sample.charAt(i);
			build.setCharAt(i, build.charAt(othereend));
			build.setCharAt(othereend, c);
		}
		
		System.out.println(build.toString());
		
//		String text = "12345";
//		char[] charArray = text.toCharArray();
//		for (int i = 0; i < charArray.length / 2; i++) {
//			char temp = charArray[i];
//			charArray[i] = charArray[charArray.length - 1 - i];
//			charArray[charArray.length - 1 - i] = temp;
//		}
//
//		System.out.println(new String(charArray));

	}

}

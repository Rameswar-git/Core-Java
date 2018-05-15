package CompleteInterview;

public class AmstrongNumber {

	public static void main(String[] args) {
		
		String no="153";
		
		System.out.println("The provided no is "+isAmstrong(no));
		

	}

	private static String isAmstrong(String no) {
		int cal=0;
		for (int i = 0; i < no.length(); i++) {
			 cal+=Math.pow(Integer.parseInt(no.charAt(i)+""), no.length());
		}
		
		return Integer.parseInt(no) == cal ? " Amstrong  ": " Not Amstrong";
	}

}

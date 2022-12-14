package Usefulprograms;

public class AdditionOfVerylargeNumber {
	public static String getSum(String s1, String s2) {
		if(s1.length() < s2.length()) {
			String temp = s1;
			s1 = s2;
			s2 = temp;
		}
		int m = s1.length();
		int n = s2.length();
		int carry = 0;
		String ans = "";
		for (int i = 0; i < n; i++) {
			int temp = (s1.charAt(m - i - 1) - '0') + (s2.charAt(n - i - 1) - '0') + carry;
			ans = (temp % 10) + ans;
			carry = temp / 10;
		}
		for (int i = n; i < m; i++) {
			int temp = (s1.charAt(m - i - 1) - '0') + carry;
			ans = (temp % 10) + ans;
			carry = temp / 10;
		}
		if(carry != 0) {
			ans = carry + ans;
		}
		return ans;
	}
	
//	public static String getSum(String s1, String s2) {
//		long sum = 0;
//		long carry = 0;
//		long radix = 1;
//		int n1 = s1.length() - 1;
//		int n2 = s2.length() - 1;
//		while(n1 >= 0 && n2 >= 0) {
//			long temp = Character.getNumericValue(s1.charAt(n1)) + Character.getNumericValue(s2.charAt(n2)) + carry;
//			sum +=  (temp % 10) * radix;
//			carry = temp / 10; 
//			radix *=10;
//			n1--;
//			n2--;
//		}
//		while(n1 >= 0) {
//			long temp = Character.getNumericValue(s1.charAt(n1)) + carry;
//			sum +=  (temp % 10) * radix;
//			carry = temp / 10; 
//			radix *=10;
//			n1--;
//		}
//		while(n2 >= 0) {
//			long temp =  Character.getNumericValue(s2.charAt(n2)) + carry;
//			sum +=  (temp % 10) * radix;
//			carry = temp / 10; 
//			radix *=10;
//			n2--;
//		}
//		if(carry != 0) {
//			if(sum == 0) {
//				System.out.println("------------------------------");
//				System.out.printf("%s + %s = %s", s1,s2,String.valueOf(radix * carry));
//				System.out.println("------------------------------");
//				return String.valueOf(radix * carry);
//			}else {
//				System.out.println("------------------------------");
//				System.out.printf("%s + %s = %s", s1,s2,(carry +  String.valueOf(sum)));
//				System.out.println("------------------------------");
//				return carry +  String.valueOf(sum);
//			}
//		}else {
//			System.out.println("------------------------------");
//			System.out.printf("%s + %s = %s", s1,s2,String.valueOf(sum));
//			System.out.println("------------------------------");
//			return String.valueOf(sum);
//		}
//	}
}

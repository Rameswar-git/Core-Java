package CompleteInterview;

public class CheckPrimeNo {

	public static void main(String[] args) {
        System.out.println(isPrime(15));
        System.out.println(isPrime(1));
        System.out.println(isPrime(7));
	}

	private static boolean isPrime(int i) {
		if(i == 1 || i == 0) {
			return false;
		}
		int mid=i/2;
		for (int j = 2; j <= mid; j++) {
			if(i % j == 0) {
				return false;
			}
		} 
		
		return true;
	}

}

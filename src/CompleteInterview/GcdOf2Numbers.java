package CompleteInterview;


public class GcdOf2Numbers {

	public static void main(String[] args) {
		
		int n1 = 625;
		int n2 = 125;

		int gdc = 1;

		int i = 2;

		while (n1 >=1  && n2 >= 1 && i<10) {
			if ((n1 % i == 0) && (n2 % i == 0)) {
				gdc *= i;
				n1 = n1 / i;
				n2 = n2 / i;
			} else {
				i++;
			}
		}

		System.out.println(gdc);

	}

}

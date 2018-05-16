package CompleteInterview;

import java.util.Scanner;

public class GcdOf2Numbers {

	public static void main(String[] args) {
		
		Scanner scan=new Scanner(System.in);
		
		System.out.println(" Enter the First Number ");
		
		int firstno=scan.nextInt();
		
		System.out.println(" Enter the Second Number ");
		
		
		int secondno=scan.nextInt();
		
		System.out.print(" gcd of "+firstno+" and "+secondno+" is ");
		
		int gcd=1;
		
		while(true) {
			if((firstno % 2 == 0) && (secondno % 2 == 0)) {
				gcd*=2;
				firstno=firstno/2;
				secondno=secondno/2;
			}else {
				break;
			}
		}
		
		System.out.print(gcd);
		
		scan.close();

	}

}

package com.second;
/**
 * @author Rameswar Prasad Das
 *
 */
import java.util.Scanner;

public class DivisibilityBy7 {

	public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
         System.out.println("Enter a 2 digit Number To check for Divisible By 7");
         int div=scanner.nextInt();
         String no=Integer.toString(div);
         if (no.length() == 2) {
			String divisibility= div % 7 == 0 ?  "Divisible by 7" :  "Not Divisibel by 7";
			System.out.println(divisibility);
		}else{
			System.out.println("Provided No is not a 2 Digit no");
		}
         scanner.close();
	}

}

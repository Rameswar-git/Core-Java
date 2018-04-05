package com.second;

import java.util.Scanner;

/**
 * @author Rameswar Prasad Das
 *
 */
public class GiftPrograme {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
       System.out.println("Enter The Gift amount");
        int amout=scanner.nextInt();
        if (amout>=0 && amout<=2000) {
			System.out.println("Your gift is Key ring");
		}else if (amout>=2000 && amout<=2500) {
			System.out.println("Tour Gift is Ladies ear rings");
		}else if (amout>=2500 && amout<=3000) {
			System.out.println("Your Gift is Ladise Purse");
		} else if (amout>3000) {
			System.out.println("Your Gift is Silver ring");
		}
        scanner.close();
	}

}

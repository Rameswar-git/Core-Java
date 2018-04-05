package com.liang.chapter4;

import java.util.Scanner;

public class PrecessionLoss {

	public static void main(String[] args) {
         Scanner scanner=new Scanner(System.in);
		System.out.println("Enter a Doubel value");
         String string=scanner.nextLine();
         System.out.println("Precessin Loss On Conversion of int to doubel :: "+string.substring(string.indexOf(".")));
	}

}

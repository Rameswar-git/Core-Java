package com.liang.chapter12;

import java.util.Scanner;
import java.util.stream.Stream;

public class CalculatorWithException {

	public static void main(String[] args) {
       
//		if(args.length != 3){
//			System.out.println("Not a Valid Operation");
//			System.exit(0);
//		}
		System.out.println("Enter The Expression To Calculate ::");
		Scanner scanner=new Scanner(System.in);
//		String ram="sdvvd";
//		Stream.of(t)
//		char[] chars=
				Stream<Object> dhgc=scanner.nextLine().replaceAll("\\s", "").chars().distinct().mapToObj(i -> (char)i);
				Character[] chars=dhgc.toArray(Character[]::new);
//				.toCharArray();
				

		testdigit(chars);
//		testdigit(chars[2]);
		
		switch (chars[1]) {
		case '+':
			int addition=Integer.parseInt(chars[0]+"")+Integer.parseInt(chars[2]+"");
			System.out.println(chars[0]+" "+chars[1]+" "+chars[2]+" "+addition);
			break;
		case '-':
			int minus=Integer.parseInt(chars[0]+"")-Integer.parseInt(chars[2]+"");
			System.out.println(chars[0]+" "+chars[1]+" "+chars[2]+" "+minus);
			break;	
		case '*':
			int multiply=Integer.parseInt(chars[0]+"")*Integer.parseInt(chars[2]+"");
			System.out.println(chars[0]+" "+chars[1]+" "+chars[2]+" "+multiply);
			break;	
		case '/':
			int divison=Integer.parseInt(chars[0]+"")/Integer.parseInt(chars[2]+"");
			System.out.println(chars[0]+" "+chars[1]+" "+chars[2]+" "+divison);
			break;	
		default:
			break;
		}
		
		scanner.close();
	}

	private static void testdigit(Character[] args2) {
           for (int i = 0; i < args2.length; i++) {
        	   if (!Character.isDigit(args2[i]) ^ (args2[i] == '+' || args2[i] == '-' || args2[i] == '*' || args2[i] == '/')) {
        		   System.out.println("Wrong input :: "+args2[i]);
        		   break;
        	   }						
		}
		
	}

}

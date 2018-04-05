package com.liang.chapter9;

import java.util.Scanner;
import java.util.Stack;

public class StackFactorTest {

	public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.println("Provide a No to Display all of its Factors");
       int no=scanner.nextInt();
       PrimeFactors primeFactors=new PrimeFactors(new Stack<Integer>(), no);
       Stack<Integer> stack=primeFactors.factors();
       for (int i = 0; i < stack.size(); i++) {
		System.out.print(stack.pop());
	   }
       
	}

}

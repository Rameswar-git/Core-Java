package com.liang.chapter9;

import java.util.Scanner;

public class QuadraticEquationTest {

	public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            System.out.println("Enter Three Points of Equation a,b,c :: ");
            double a=sc.nextDouble();
            double b=sc.nextDouble();
            double c=sc.nextDouble();
            QuadraticEquation equation=new QuadraticEquation(a, b, c);       
            double dis=equation.getDiscriminator();
            if (dis>0) {
				System.out.println("Root 1 :: "+equation.getRoot1());
				System.out.println("Root 2 :: "+equation.getRoot2());
			}else if(dis == 0){
				System.out.println("Root 1 :: "+equation.getRoot1());
			}else{
				System.out.println("The Equation have no root");
			}
	}

}

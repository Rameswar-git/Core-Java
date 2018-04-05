package com.first;
/*
 * Developer Rameswar Prasad das
 */
import java.util.Scanner;

public class TirangelEasy {

	public static void main(String[] args) {
		 Scanner scanner=new Scanner(System.in);
		 System.out.println("Enter Three Sides Of The Triangel Sequentially as a,b,c");
         System.out.println("Entetr First Side of the Triangel a");
         double first=scanner.nextDouble();
         System.out.println("Enter Second Side of the Triangel b");
         double second=scanner.nextDouble();
         System.out.println("Enter Third Side of the Triangel c");
         double third=scanner.nextDouble();
          System.out.println("Choose The Operation No\n"+"1.Calculate Area\n"+"2.Calculate Perimeter\n");
          int oeration=scanner.nextInt();
          if (oeration == 1) {
	            double area=TriangelDiffucult.area(first, second, third);
	            System.out.println("Area Of the Triangel is::"+area);
	    		 }else if (oeration == 2) {
	    	       System.out.println("Perimeter Of The Triangel is ::"+TriangelDiffucult.perimeter(first, second, third));
	    		   }else {
	    		   System.out.println("Please Choose an Appropriate Option");
	    		  }
          scanner.close();
	}
	
	public static double area(double a,double b,double c) {
        double s=(a+b+c)/2;
        double part=(s-a)*(s-b)*(s-c);
        double area=Math.sqrt(s*part);
        return area;
	}
	
	public static double perimeter(double a,double b,double c) {
          return a+b+c;
	}

}

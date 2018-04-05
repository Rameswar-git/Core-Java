package com.first;
/*
 * Developer Rameswar Prasad das
 */
import java.util.Scanner;

public class TriangelDiffucult {
	
	static double first=0.00;
	static double second=0.00;
	static double third=0.00;

	public static void main(String[] args) {
		int operation=0;
		 Scanner scanner=new Scanner(System.in);
		 while(operation!=3){
		 if (TriangelDiffucult.getuserdata(scanner) instanceof Exception) {
			 System.out.println("Please Re Run The Programe and Provide valid input for a,b and c");
		  }else{
	          System.out.println("Choose The Operation No\n"+"1.Calculate Area\n"+"2.Calculate Perimeter\n"+"3.Exit");
	           operation=scanner.nextInt();
	          
	           if (operation == 1) {
	            double area=TriangelDiffucult.area(first, second, third);
	            System.out.println("Area Of the Triangel is::"+area);
	    		 }else if (operation == 2) {
	    	       System.out.println("Perimeter Of The Triangel is ::"+TriangelDiffucult.perimeter(first, second, third));
	    		   }else {
	    		   System.out.println("Please Choose an Appropriate Option");
	    		  }
	           System.out.println("To Continue Choose The Operation No or To Exit Press 3 \n"+"1.Calculate Area\n"+"2.Calculate Perimeter\n"+"3.Exit");
	           operation=scanner.nextInt();
	          }
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
	
	public static Object getuserdata(Scanner scanner) {
		Object object=null;
		 System.out.println("Enter Three Sides Of The Triangel Sequentially as a,b,c");
		 try {
	          System.out.println("Entetr First Side of the Triangel a");
	            first=scanner.nextDouble();
	          System.out.println("Enter Second Side of the Triangel b");
	           second=scanner.nextDouble();
	          System.out.println("Enter Third Side of the Triangel c");
	           third=scanner.nextDouble();
		  }catch (Exception e) {
			  object=e;
//			  System.out.println("Please Re Run The Programe and Provide valid input for a,b and c");
		  }
		 return object;		
	}
	
	
	

}

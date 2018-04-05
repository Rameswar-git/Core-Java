package com.liange.chapter5;

import java.util.Scanner;


public class HighestScorerStudent {

	public static void main(String[] args) {
          String Highestscorername = "";
          int highestScore=0;
       Scanner scanner=new Scanner(System.in);
       System.out.println("Eneter No Of  Students");
       int  noofstudent=scanner.nextInt();
       
       for (int i = 0; i < noofstudent; i++) {
    	   scanner.nextLine();
		 System.out.println("Enter The Name Of the Student");
		 String name=scanner.nextLine();
		 System.out.println("Enter Score of Students");
		 int score=scanner.nextInt();
		 if (score > highestScore) {
			 Highestscorername=name;
			 highestScore=score;
		}
		   
	  }
       System.out.println("Highest scorer Student Name "+Highestscorername+" and his Score is "+highestScore);
       scanner.close();
	}

}

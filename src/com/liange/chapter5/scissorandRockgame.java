package com.liange.chapter5;

import java.util.Scanner;

public class scissorandRockgame {

	public static void main(String[] args) {
		int userwincount=0;
		int computerwincount=0;
		 Scanner scanner =new Scanner(System.in);
		while(userwincount < 2 && computerwincount < 2){
			 System.out.print("scissor (0), rock (1), paper (2):");
		     System.out.print("Enter Your Lucky no Between 0 to 3");
		     int user=scanner.nextInt();
		     int computer = (int)(Math.random() * 3);

		     boolean won=(user == 0 && computer == 1) || (user == 1 && computer == 0) || (user == 2 && computer == 1);
		     
		     if (user == computer) {
		    	 System.out.println("Match Draws");
			  }else if(won){
				  userwincount++;
				  System.out.println("you Won The Match "+userwincount);
			  }  else{ 
				  computerwincount++;
				  System.out.println("System Won The Match "+computerwincount);
			  }
		}
		
     scanner.close();
  }
}

package com.liang.chapter12.Ex_25;

import java.io.IOException;
import java.net.URL;
import java.util.Scanner;

public class DatasheetExplorer {
	
	private static int assistantcount=0;
	private static int assistanttotal=0;
	private static int associativecount=0;
	private static int associativetotal=0;
	private static int fullcount=0;
	private static int fulltotal=0;
	
	private static int TotalFaculty=0;
	private static int TotalSalary=0;

	public static void main(String[] args) throws IOException {
       URL url=new URL("http://cs.armstrong.edu/liang/data/Salary.txt");   
		
       Scanner sc=new  Scanner(url.openStream());
		
		while(sc.hasNext()) {
			String[] strs=sc.nextLine().split(" ");
			DataProcessing(strs[2],new Double(strs[3]));
		}
		
		TotalFaculty=assistantcount+associativecount+fullcount;
		TotalSalary=assistanttotal+associativetotal+fulltotal;
		
		System.out.println("\n   Total salary ");
		System.out.println("---------------------");
		
		System.out.println("Total Salary Of Assistant Professior is "+assistanttotal);
		
		System.out.println("Total Salary Of Associative Professior is "+associativetotal);
		
		System.out.println("Total Salary Of Full Professior is "+fulltotal);
		
		System.out.println("Total Salary Of All Professior is "+TotalSalary);
		
		
		System.out.println("\n   Average salary ");
		
		System.out.println("---------------------");
		
		System.out.println("Average Salary Of Assistant Professior is "+(assistanttotal/assistantcount));
		
		System.out.println("Average Salary Of Associative Professior is "+(associativetotal/associativecount));
		
		System.out.println("Average Salary Of Full Professior is "+(fulltotal/fullcount));
		
		System.out.println("Average Salary Of Associative Professior is "+(TotalSalary/TotalFaculty));
		
		sc.close();
	}

	private static void DataProcessing(String string, Double string2) {
          if(string.equalsIgnoreCase("associate"))	{
        	  associativecount++;
        	  associativetotal+=string2;
          }else if(string.equalsIgnoreCase("full")) {
        	  fullcount++;
        	  fulltotal+=string2;
          }else if(string.equalsIgnoreCase("assistant")) {
        	  assistantcount++;
        	  assistanttotal+=string2;
          }
	}

}

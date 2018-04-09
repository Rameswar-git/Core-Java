package com.liang.chapter12.Ex_24;

import java.io.File;
import java.io.PrintWriter;
import java.util.concurrent.ThreadLocalRandom;

public class LargeFileCreator {
   
	public static void main(String[] args) {
		
		File f=new File("D:\\DataSheets.txt");
		
		try(PrintWriter output=new PrintWriter(f)) {
			for (int i = 0; i < 1000; i++) {
				output.print(" Firstname "+i+" LastName "+i);
				String rank=getrank();
				double salary=getsalary(rank);
				output.printf("  "+rank+"  %.2f\n",salary);
			}
		} catch (Exception e) {
			
		}
		
	}

	private static double getsalary(String rank) {
		
		if(rank.equalsIgnoreCase("assistant")) {
			return ThreadLocalRandom.current().nextDouble(50000,80000);
		}else if(rank.equalsIgnoreCase("associate")){
			return ThreadLocalRandom.current().nextDouble(60000,110000);
		}else {
			return ThreadLocalRandom.current().nextDouble(75000,130000);
		}
		
	}

	private static String getrank() {
		
		String[] ranks= {"assistant","associate","full"};
		
		return ranks[(int)(Math.random()*ranks.length)];
	}
	
}

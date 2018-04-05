package com.liang.chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.PrintWriter;

public class TestPrintWriter {

	public static void main(String[] args) throws FileNotFoundException {
		
		StringBuilder s1=new StringBuilder();
		s1.append("Ram");
		s1.append("Har");
		s1.append("Sit");
      PrintWriter print=new PrintWriter(new File("D:\\Test.txt"));
      
      print.print(s1.toString());
      
      print.close();
      
	}

}

package com.liang.chapter12.Ex_23;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.Scanner;

public class UrlReadWrite {

	public static void main(String[] args) throws IOException {
       URL url=new URL("http://cs.armstrong.edu/liang/data/Scores.txt");
       
       Scanner sc=new Scanner(url.openStream());
       
       int counter=0;
       
       int total=0;
    		   
       while(sc.hasNext()) {
    	   int no=sc.nextInt();
    	   System.out.println(no);
    	   total+=no;
    	   counter++;
       }
       
       System.out.println("The Total Of  All The numbers are ::"+total);
       
       System.out.println("The Avverage  Of the Numbers Are "+(total/counter));
       
       sc.close();
       
	}

}

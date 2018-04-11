package com.liang.chapter12.Ex_31;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Scanner;
import java.util.stream.Stream;


public class FileParse {

	public static void main(String[] args) throws IOException {
		Scanner scan=new Scanner(System.in);
		System.out.println("Enter The Year To Search :: ");
		int year=scan.nextInt();
		scan.nextLine();
		System.out.println("Eneter The the Baby name :: ");
		String naame=scan.nextLine();
		
		try {
    	   
			URL url=new URL("http://www.cs.armstrong.edu/liang/data/babynameranking"+year+".txt");
			
			BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
			
			Stream<String> lines=br.lines();
			
			
    	   String[] nsd=lines.map(p -> p.split("\\t"))
    			   .filter(x -> (x[1].trim().equalsIgnoreCase(naame) ||  x[3].trim().equalsIgnoreCase(naame))).findFirst().get();

    	   
    	   System.out.println(naame+" is Ranked "+nsd[0]+" in "+year);
    	   
    	   scan.close();
	   } catch (Exception e) {e.printStackTrace();}
	}

}

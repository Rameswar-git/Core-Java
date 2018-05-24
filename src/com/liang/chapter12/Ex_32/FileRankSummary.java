package com.liang.chapter12.Ex_32;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class FileRankSummary {

	public static void main(String[] args) throws IOException {
         
		System.out.println(
		"--------------------------------------------------------" +
		"-------------------------------------------------------------\n" +
		" Year  Rank 1(M)--(F)     Rank 2(M)--(F)      Rank 3(M)--(F)       Rank 4(M)--(F)       Rank 5(M)--(F)\n" +
		"--------------------------------------------------------" +
		"-------------------------------------------------------------");
		
		for (int i = 2001; i <= 2010 ; i++) {
			URL url=new URL("http://www.cs.armstrong.edu/liang/data/babynamesranking"+i+".txt");
			BufferedReader br=new BufferedReader(new InputStreamReader(url.openStream()));
			Stream<String> lines=br.lines().limit(5);

			List<String[]> alllines = lines.map(p -> p.split("\\t"))
					.map(s  -> Arrays.stream(s).map(d -> d.trim()).toArray(String[]::new)).collect(Collectors.toList());
					
			
			
//			alllines.forEach(f -> System.out.println(Arrays.toString(f)));			
					
//			print(i,li);
			
			int year=i;
			
			 print(year,alllines);
			 System.out.println();
			
//			alllines.forEach(x ->);
		}
		
		
	}

	private static void print(int i2, List<String[]> li) {
		System.out.print(i2+"  ");
		for (String[] strings : li) {
			System.out.print(strings[1].trim());
			printspace(strings[1].length());
			System.out.print(strings[3].trim());
			printspace(strings[3].length());
		}
//			
	}

	private static String printspace(int len) {
		
		IntStream.range(0, 10-len).forEach(i -> System.out.print("-"));
		
		
		return "";
	}
	
}

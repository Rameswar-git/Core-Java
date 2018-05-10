package com.liang.chapter20.Ex_20_1;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Java8FileWordSorting {

	public static void main(String[] args) {
		
		try {
			
			String str=new String(Files.readAllBytes(Paths.get("D:\\Ram.txt")));
			
			
			List<String> strs=Arrays.stream(str.split(" ")).collect(Collectors.toList());
			
			System.out.println(strs);
			
			
			strs=strs.stream().sorted().collect(Collectors.toList());
			
//			strs.sort((String s1,String s2) -> s1.compareTo(s2));

			
			System.out.println(strs);
			
		} catch (Exception e) {
			
			
		}
		
	}

}

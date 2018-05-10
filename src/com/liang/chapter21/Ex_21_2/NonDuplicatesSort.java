package com.liang.chapter21.Ex_21_2;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NonDuplicatesSort {

	public static void main(String[] args) throws IOException {
		
		String stext=new String(Files.readAllBytes(Paths.get("D:\\Ram.txt")));
		
		List<String> words=Arrays.stream(stext.split(" ")).distinct().sorted().collect(Collectors.toList());
		
		words.forEach(x -> System.out.println(x));

	}

}

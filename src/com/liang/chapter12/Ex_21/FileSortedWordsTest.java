package com.liang.chapter12.Ex_21;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.stream.Stream;

public class FileSortedWordsTest {

	public static void main(String[] args) {
            try(Stream<String> lines=Files.lines(Paths.get("D:\\Test.txt"))) {
            	
            	File f=new File("D:\\Test");
            	
                  
            	List<String> lines2=Files.readAllLines(Paths.get("D:\\Test.txt"));
            	
            	List<String> lines3=Files.readAllLines(Paths.get("D:\\Test.txt"));
            	
                Collections.sort(lines2);
                
                System.out.println(lines2.equals(lines3));
            	
            	
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}

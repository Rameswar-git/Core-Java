package com.liang.chapter12.Ex_21;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Stream;

public class FileSortedWordsTest {

	public static void main(String[] args) {
            try(Stream<String> lines=Files.lines(Paths.get("D:\\Test.txt"))) {
            	
            	File f=new File("D:\\Test.txt");
            	
            	
            	
                  
            	List<String> lines2=Files.readAllLines(Paths.get("D:\\Test.txt"));
            	
            	List<String> lines3=Files.readAllLines(Paths.get("D:\\Test.txt"));
            	
                Collections.sort(lines2);
                
//                System.out.println(lines2.equals(lines3));
                boolean sorted=true;
                if(!lines2.equals(lines3)) {
                	try(Scanner sc=new Scanner(f)) {
                		
                		
                		String str1="";
                		String str2="";
                		if(sc.hasNext())
                		str1=sc.next();
                		while(sorted && sc.hasNext()) {
                			str2=sc.next();
                			
                			if(str1.compareTo(str2) > 0) {
                				System.out.println("String "+str1+" and String  "+str2+"  are not in sorted order");
                				sorted=false;
                				break;
                			}
                			
                			str1=str2;

                		}
						
					} catch (Exception e) {
						
					}
                	
                	if (sorted) {
                		System.out.println("The Elements in The file are in sotrted order");
                	}
                	
                }
                
			} catch (Exception e) {
				e.printStackTrace();
			}
	}

}

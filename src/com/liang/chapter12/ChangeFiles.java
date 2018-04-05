package com.liang.chapter12;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.FilenameFilter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.List;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class ChangeFiles {

	public static void main(String[] args) {
		File f=new File("D:\\Test");
        List<File> directories=getdirectories(f);
   
        directories.forEach(fis -> {
        	File[] files = fis.listFiles(new FilenameFilter() {
        	    public boolean accept(File dir, String name) {
        	        return (name.toLowerCase().endsWith(".txt") || name.toLowerCase().endsWith(".dat"));
        	      }
        	 });
        	
//       	File[] files=Stream.of(fis.list()).filter(e -> (e.toLowerCase().endsWith(".dat") || e.toLowerCase().endsWith(".txt"))).toArray(File[]::new);
        	
        	
//       	File[] files =Stream.of(fis.listFiles()).filter(e -> (e.toLowerCase().endsWith(".dat") || e.toLowerCase().endsWith(".txt"))).toArray(File[]::new);

        	Stream.of(files).forEach(fil -> {
        		try {
        			StringBuilder build=new StringBuilder();
        			build.append("Package  "+fis.getName()+";");
					Scanner scn=new Scanner(fil);
					while(scn.hasNext()) {
						build.append(scn.nextLine());
					}
					
					 PrintWriter printasc=new PrintWriter(fil);
					
					 printasc.println(build.toString());
					 
					 printasc.close();
					 scn.close();
					
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
        	});
        	
        	
        });
        
	}

	private static List<File> getdirectories(File fils) {
		List<File>  directories=Stream.of(fils.list()).map(x -> new File("D:\\Test\\"+x)).collect(Collectors.toList());
       return directories;
	}

}

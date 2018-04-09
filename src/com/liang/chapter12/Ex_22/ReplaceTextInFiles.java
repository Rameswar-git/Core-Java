package com.liang.chapter12.Ex_22;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.List;
import java.util.stream.Collectors;

public class ReplaceTextInFiles {

	public static void main(String[] args) {
		
         try {

//        	 StringBuilder sbt=new StringBuilder();
        	 
        	 List<String> paths= Files.list(Paths.get("D:\\Songs")).map(x -> x.toAbsolutePath().toString()).collect(Collectors.toList());
        	 
        	 System.out.println(paths);
        	 
        	 paths.forEach(fil ->{
        		 StringBuilder stb=new StringBuilder();
        		 try {
					List<String> lines=Files.readAllLines(Paths.get(fil));
					lines.forEach(li -> {
						if(li.contains("Rameswar") || li.equalsIgnoreCase("Rameswar")) {
							stb.append(" ");
						}else {
							stb.append(li+" ");
						}
							
					});
					Files.write(Paths.get(fil), stb.toString().getBytes());
				} catch (IOException e) {
					e.printStackTrace();
				}
        		 
        	 });
        	 
        	 
//        	 List<String> rsjd=strsas.map(x -> x.toAbsolutePath().toString()).collect(Collectors.toList());    	 
//                 strs.forEach(line -> {
//                   if(line.contains("Rameswar"))
//                	 sbt.append(line.replaceAll("Rameswar", ""));
//            });    
//                 
//          Files.write(Paths.get("D:\\Songs"), sbt.toString().getBytes());
            
          
			
		} catch (Exception e) {
			System.out.println();
		}
	}

}

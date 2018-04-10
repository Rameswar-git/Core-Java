package com.liang.chapter12.Ex_28;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class FileReameFromFolder {

	public static void main(String[] args) {
       
		Scanner sc=new Scanner(System.in);
		
		String path=sc.nextLine();
		
		File f=new File(path);
		
		try {
			if(!f.isDirectory()) {
				System.out.println("The Provided Path is not valid");
				System.exit(0);
			}
			
			Arrays.stream(f.listFiles()).forEach(fil -> {
				String filename=fil.getName();
				System.out.println(filename);
				if(filename.matches("Exercise\\d_\\d.*")) {
					StringBuilder stb=new StringBuilder(filename);
					stb.insert(filename.indexOf("_")+1, 0+"");
					stb.insert(8, '0');
					System.out.println(stb.toString());
					fil.renameTo(new File(path+"\\"+stb.toString()));
				}
				
			});
			
		} catch (Exception e) {
			
		}

		sc.close();
	}

}

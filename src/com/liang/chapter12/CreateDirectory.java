package com.liang.chapter12;

import java.io.File;
import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;

public class CreateDirectory {

	public static void main(String[] args) {
		List<File> directories=new ArrayList<>();
         CreatDirs(directories);
         createFiles(directories);
	}

	private static void createFiles(List<File> directories) { 
		for (int i = 0; i < directories.size(); i++) {
			createJavaFile(2,directories.get(i),"TestJavaFile",".java");
			createJavaFile(2,directories.get(i),"TestDataFile",".dat");
			createJavaFile(2,directories.get(i),"TestTxtFile",".txt");
		}
	}

	private static void createJavaFile(int n,File dir, String Filename, String Extension) {
		
		for (int i = 1; i <= n; i++) {
			File fi=new File(dir,Filename+i+Extension);
			if(!fi.exists()) {
				try(PrintWriter wri=new PrintWriter(fi)) {
					for (int j = 0; j < 11; j++) {
						wri.print((int)(Math.random() * 500));
						wri.print(" ");					
					}
					wri.close();
				} catch (Exception e) {}
			}
		}

	}

	private static void CreatDirs(List<File> directories) {
	 
		for (int i = 0; i < 10; i++) {
	      File fil=new File("D:\\Test\\testdir"+i);
			if(!fil.isDirectory()) {
				if(fil.mkdir())
					directories.add(fil);		
			}
	
		}
	} 

}

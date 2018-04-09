package com.liang.chapter12.Ex_26;

import java.io.File;
import java.util.Scanner;

public class MakeDirectory {

	public static void main(String[] args) {
         Scanner sc=new Scanner(System.in);
         
         System.out.println("Provide The Name Of The Directory");
         
         String name=sc.nextLine();
         
         String path="D:\\"+name;
         
         try {
        	 File f=new File(path);
        	 if (!f.exists()) {
        		 if(f.mkdirs())
        			  System.out.println("Directory Created Successfully ");
        			  
        	 }else {
        		 System.out.println("Directory Already Exists");
        	 }
                 
		} catch (Exception e) {	}
         
         sc.close();
         
	}

}

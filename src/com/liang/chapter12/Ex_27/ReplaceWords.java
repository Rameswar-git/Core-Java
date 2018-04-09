package com.liang.chapter12.Ex_27;

import java.io.File;
import java.util.Arrays;
import java.util.Scanner;

public class ReplaceWords {

	public static void main(String[] args) {
//       Scanner scan=new Scanner(System.in);
       
//       String path=scan.nextLine();
       
//       File f=new File(path);
       
//       if(!f.isDirectory()) {
//    	   System.out.println("Provided Path DoesNot Exists");
//    	   System.exit(0);
//       }
		
		File na= new File("D:\\Vic\\Exercise2_3");
       
       na.renameTo(new File(na.getName().split("_")[0].substring(0,8)+"0"+
    		   na.getName().split("_")[0].substring(8)+"_"+"0"+na.getName().split("_")[1].substring(0,na.getName().split("_")[1].indexOf("."))));
       
       
//       Arrays.stream(f.listFiles()).forEach(na -> {
//
//    	   
//    	   System.out.println(na.getName().split("_")[0].substring(8).length());
//    	   
//    	   
//    	   if(na.getName().split("_")[0].substring(8).length() == 1 || na.getName().split("_")[1].length() == 1) {
//    		   na.renameTo(new File(na.getName().split("_")[0].substring(0,8)+"0"+
//    		   na.getName().split("_")[0].substring(8)+"_"+"0"+na.getName().split("_")[1].substring(0,na.getName().split("_")[1].indexOf("."))));
//    	   }
//    	   
//       });
       

//       scan.close();
	}

}

package com.liang.chapter17.Ex_17_2;

import java.io.FileOutputStream;
import java.io.ObjectOutputStream;
import java.util.Date;

public class Programe {

	public static void main(String[] args) {
       int[] nums= {5,4,6,8,9};
       
       try(ObjectOutputStream ob=new ObjectOutputStream(new FileOutputStream("D:\\Exercise17_05.dat"))) {
    	   ob.writeObject(nums);
    	   ob.writeDouble(12.3);
    	   ob.writeObject(new Date());
    	   ob.close();
    	   System.out.println("Write Success");
	    } catch (Exception e) {
		  e.printStackTrace();
	   }
       
	}

}

package com.liang.chapter17.Ex_17_7;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.ObjectInputStream;

public class RestoreFromFile {

	public static void main(String[] args) {
		
       try(ObjectInputStream on =new ObjectInputStream(new BufferedInputStream(new FileInputStream("D:\\Exercise17_07.dat")))) {
           while(true) {
        	   Student stu=(Student)on.readObject();
        	   System.out.println(stu.getName());
        	   System.out.println(stu.getRoll());
           }
	   } catch (Exception e) {}
		
       
//       try(ObjectOutputStream out=new ObjectOutputStream(new FileOutputStream("D:\\Exercise17_07.dat"))) {
//    	   Student stu=new Student();
//    	   stu.setName("Rameswar");
//    	   stu.setRoll(5);
//    	   Student stu2=new Student();
//    	   stu2.setName("Har");
//    	   stu2.setRoll(6);
//    	   out.writeObject(stu);
//    	   out.writeObject(stu2);
//    	   out.close();
//	    } catch (Exception e) {}
       
	}
}

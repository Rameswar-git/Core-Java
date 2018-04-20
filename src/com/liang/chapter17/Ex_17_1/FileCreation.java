package com.liang.chapter17.Ex_17_1;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;
import java.util.stream.IntStream;

public class FileCreation {

	public static void main(String[] args) throws IOException {
         File f=new File("D:\\CreatedClass\\Exercise_17_01.txt");

          if(f.exists()) {
        	  PrintWriter writre=new PrintWriter(f);
        	  writre.append(new Date()+" ");
              writre.close();
          }else {
        	  PrintWriter writre=new PrintWriter(f);
        	  writre.print(((int)(Math.random()*100))+" ");
        	  writre.close();
          }
         
         
	}

}

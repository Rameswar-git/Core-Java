package com.test.programs;

public class GCTest {

	   final int NELEMS = 50000;

	   void eatMemory() {

	      int[] intArray = new int[NELEMS];

	      for (int i=0; i<NELEMS; i++) {
	        intArray[i] = i;
	      }

	   }

	   public static void main (String[] args) {

/*	      GCTest gct = new GCTest();

	      Runtime r = Runtime.getRuntime();

	      long freeMem = r.freeMemory();
	      System.out.println("free memory before creating array: " + freeMem);
	      r.gc();
	      freeMem = r.freeMemory();
	      System.out.println("free memory calling garbage collector " + freeMem);
	      gct.eatMemory();

	      freeMem = r.freeMemory();
	      System.out.println("free memory after creating array:  " + freeMem);

	      r.gc();
	      freeMem = r.freeMemory();
	      System.out.println("free memory after running gc():    " + freeMem);*/
	      
//		   
//		   System.out.println(Runtime.getRuntime().freeMemory());
//
//		    for (int i=0;i<= 100000;i++) {
//		    Double d = new Double(225);
//		    }
//		    System.out.println(Runtime.getRuntime().freeMemory());
//		    System.gc();
//		    System.out.println(Runtime.getRuntime().freeMemory());
//	      
	      
	      
	      Long ts=(long) 0;
	      System.out.println(ts.intValue());
	      
	   }
	}
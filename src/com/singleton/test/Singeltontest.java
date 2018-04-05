package com.singleton.test;

public class Singeltontest {
	
   public static void main(String[] args) {
	   try {
		   FullySingleton ob1=FullySingleton.getInstance();
		   FullySingleton ob2=ob1.clone();
		   if(ob1.hashCode() == ob2.hashCode()){
			   System.out.println("Same");
		   }
	
	  }catch (Exception e) { System.out.println(e.getCause());}	
   }
}

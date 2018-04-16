package com.liang.chapter13.Ex_21;

public class MainClass {

	public static void main(String[] args) throws CloneNotSupportedException {
         Octagon oct=new Octagon(5);
         
         System.out.println(oct.getArea());
         System.out.println(oct.getPerimeter());
         
         Octagon oct2=(Octagon) oct.clone();
         
         int result=oct2.compareTo(oct);
         
         if(result == 1) {
        	 System.out.println("Octagone is grater Then Its clone");
         }else if(result == -1) {
        	 System.out.println("Octagone is less Then Its clone");
         }else {
        	 System.out.println("Octagone and its clone both are same ");
         }
	}

}

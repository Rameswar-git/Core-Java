package com.liang.chapter9;

import java.util.Scanner;

public class MyRecTest2 {

	public static void main(String[] args) {
       Scanner scanner=new Scanner(System.in);
       System.out.print(" Enter The Five points Of Rectangel :: ");
       
       double[][] points=new double[5][2];
       
       for (int i = 0; i < points.length; i++) {
		   for (int j = 0; j < points[i].length; j++) {
			   points[i][j]=scanner.nextDouble();
		}
	   }
       
       
       MyRectangle2D rectangle2d=MyRectangle2D.getRectangle(points);
       
       System.out.println("The bounding rectangle's center"+(rectangle2d.getX()+" , "+ rectangle2d.getY())+"  "+rectangle2d.getWidth()+","+rectangle2d.getHeight());
       
       
       
	}

}

package com.liang.chapter9;

public class PolygonTest {

	public static void main(String[] args) {
      RegularPolygon pol1=new RegularPolygon();
      RegularPolygon pol2=new RegularPolygon(6,4);
      RegularPolygon pol3=new RegularPolygon(10,4,5.6,7.8);
      
      System.out.println("\n-----------------------");
      System.out.println(" Regular Polygon Objects  |  Perimetr");
      System.out.println("--------------------------------------------------");
      System.out.printf("| Object1   |%8.2f     |%6.2f|\n", pol1.getPerimeter(),pol1.getArea());
      System.out.printf("| Object1   |%8.2f     |%6.2f|\n", pol2.getPerimeter(),pol2.getArea());
      System.out.printf("| Object1   |%8.2f     |%6.2f|\n", pol3.getPerimeter(),pol3.getArea());
      
	}

}

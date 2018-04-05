package com.liang.chapter9;


public class Circle2DTest {

	public static void main(String[] args) {
      Circle2D cir=new Circle2D(2, 2, 5.5);
      System.out.printf("Area Of the Circle is :: %5.3f \n",cir.getArea());
      System.out.printf("Perimeter of the Circle is :: %5.3f \n",cir.getPerimeter());
      System.out.println(cir.contains(3,3));
      System.out.println(cir.contains(new Circle2D(4, 5, 10.5)));
      System.out.println(cir.overlaps(new Circle2D(3, 5, 2.3)));
      
	}

}

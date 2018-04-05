package com.liang.chapter9;

public class MyRectangelTest {

	public static void main(String[] args) {
		MyRectangle2D r1 = new MyRectangle2D(2, 2, 5.5, 4.9);

		// Display results
		System.out.println("\nRectangle:");
		System.out.printf("Area: %5.3f\n" ,r1.getArea());
		System.out.printf("Perimeter: %5.3f\n" ,r1.getgetPerimete());
		System.out.println((r1.contains(3,3) ? "Contains":"Not Contains")+" Point(3,3)");
		System.out.println((r1.contains(new MyRectangle2D(4, 5, 10.5, 3.2)) ? "Contains":"Not Contains")+" the rectangle with points (4, 5, 10.5, 3.2)");
	}

}

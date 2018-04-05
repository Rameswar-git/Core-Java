package com.liang.chapter12;

import java.util.Scanner;

public class TrinagelExceptionTest {

	public static void main(String[] args) {
		boolean inp=true;
		Scanner scanner=new Scanner(System.in);
		System.out.println("Enter Three Sides of The Trinagel");
		do{
			try {
				int side1=scanner.nextInt();
				int side2=scanner.nextInt();
				int side3=scanner.nextInt();
				Triangel tri=new Triangel(side1, side2, side3);
				double area=tri.getarea();
				double perimeter=tri.getarea();
				System.out.println("Trinagel Details are "+area+" "+perimeter);
				inp=false;
			} catch (TriangelException e) {
				System.out.println(e.getMessage());
				System.out.println("Invalid Input Please Try again :: ");
				scanner.nextLine();
			}
		}while(inp);
		
		scanner.close();
	}

}

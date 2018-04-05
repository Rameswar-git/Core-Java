package com.liang.chapter9;

public class RestangelTest {

	public static void main(String[] args) {
		Rectangel rectangel=new Rectangel();
        Rectangel rectangel1=new Rectangel(40, 4);
        Rectangel rectangel2=new Rectangel(39.5, 305);
        
        System.out.println("Default Area Of Rectangel  is ::"+rectangel.getArea());
        System.out.println("Default Perimetr Of Rectangel  is ::"+rectangel.getArea());
        
        System.out.println("Area Of Rectangel 1 is ::"+rectangel1.getArea());
        System.out.println("Perimer Of Rectangel 1 is ::"+rectangel1.getPerimeter());
        
        System.out.println("Area Of Rectangel 2 is ::"+rectangel2.getArea());
        System.out.println("Perimer Of Rectangel 1 is ::"+rectangel2.getPerimeter());

        
        
	}

}

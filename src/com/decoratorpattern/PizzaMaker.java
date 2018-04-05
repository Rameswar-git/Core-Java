package com.decoratorpattern;

public class PizzaMaker {

	public static void main(String[] args) {

        Pizza basicPizza = new TomatoSauce(new PlainPizza());


        System.out.println("Ingredients: " + basicPizza.getDescription());
    

        System.out.println("Price: " + basicPizza.getCost());

	}

}

package com.decoratorpattern;

public class Mozzarella extends ToppingDecorator {

	public Mozzarella(Pizza newPizza) {
		super(newPizza);
		System.out.println("Adding Dough");
		System.out.println("Adding Moz");

	}

	@Override
	public String getDescription() {
		 return tempPizza.getDescription() + ", mozzarella";
	}

	@Override
	public double getCost() {
		System.out.println("Cost of Moz: " + .50);
		return tempPizza.getCost() + .50;
	}

}

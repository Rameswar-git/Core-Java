package com.JavaGeneraics;

import java.util.ArrayList;
import java.util.List;

public class GroceryStore {

	static class Plant {
		private String name;

		public Plant(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}
	}

	static class Fruit extends Plant {

		private int size;

		public Fruit(String name, int size) {
			super(name);
			this.size = size;
		}

	}

	static class Apple extends Fruit {
		private String origin;

		public Apple(String name, int size, String origin) {
			super(name, size);
			this.origin = origin;
		}

	}

	public static void main(String[] args) {
		 
		   
//		  GroceryStore.Fill();

	}
	
	private  <T extends Fruit>  void sum1() {
		
		
//		return a.doubleValue()+b.doubleValue();
//		return a.doubleValue()+b.doubleValue();
	}
	
	
//	   <? super Fruit>  void Fill() {
//		  
////		 List<? super Fruit> fruitsBasket = new ArrayList<>();
//		 
////		return fruitsBasket;
//		
//	}

}

package CompleteInterview.Generics;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;

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
		
        public int getSize() {
            return size;
        }

	}

	static class Apple extends Fruit {
		private String origin;

		public Apple(String name, int size, String origin) {
			super(name, size);
			this.origin = origin;
		}
		
        public String getOrigin() {
            return origin;
        }

	}

	public static void main(String[] args) {
   
        List<? super Fruit> fruitsBasket=Fill();
        
        
        List<Apple> anotherBasket = new ArrayList<>();
       
        anotherBasket.add(new Apple("apple", 5, "US"));
        anotherBasket.add(new Apple("apple", 8, "UK"));
        anotherBasket.add(new Apple("apple", 9, "CN"));
        
       Fruit fr=getBiggestFruit(anotherBasket);
       
       System.out.println(fr.getSize());
		   
	}
	
	private static  List<? super Fruit> Fill() {
		
		 List<? super Fruit> fruitsBasket = new ArrayList<>();
		 
	    fruitsBasket.add(new Apple("apple", 5, "US"));
	    fruitsBasket.add(new Apple("apple", 8, "UK"));
	    fruitsBasket.add(new Apple("apple", 9, "CN"));
		 
		return fruitsBasket;

	}
	
	private static   Fruit  getBiggestFruit(List<? extends Fruit> bas) {
		
		assert(!bas.isEmpty());
		
		Fruit f=bas.stream().max(Comparator.comparing(i -> i.getSize())).get();
		
		
		return f;
	}

}

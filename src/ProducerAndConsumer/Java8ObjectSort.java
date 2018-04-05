package ProducerAndConsumer;

import java.math.BigDecimal;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class Java8ObjectSort {

	public static void main(String[] args) {

		List<Item> items = Arrays.asList(
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 20, new BigDecimal("19.99")),
                new Item("orang", 10, new BigDecimal("29.99")),
                new Item("watermelon", 10, new BigDecimal("29.99")),
                new Item("papaya", 20, new BigDecimal("9.99")),
                new Item("apple", 10, new BigDecimal("9.99")),
                new Item("banana", 10, new BigDecimal("19.99")),
                new Item("apple", 20, new BigDecimal("9.99"))
                );
		
		/*Map<String,Integer> finalitems=listitems.stream().collect(Collectors.groupingBy(Item::getName, 
				Collectors.summingInt(Item::getCount)));
		
		 Map<String, Integer> finalMap = new LinkedHashMap<>();
		 
		 finalitems.entrySet().stream().sorted(Map.Entry.<String,Integer>comparingByValue().reversed()).forEachOrdered(x->finalMap.put(x.getKey(), x.getValue()));
		
		
		System.out.println(finalitems);
		
		System.out.println(finalMap);*/
		
		//Group  By Pricing
		
		Map<BigDecimal,List<Item>> groupbyprice=items.stream().collect(Collectors.groupingBy(Item::getPrice));
		
		System.out.println(groupbyprice);
		
		
		Map<BigDecimal,Set<String>> TosetConversion=items.stream().
				collect(Collectors.groupingBy(Item::getPrice,Collectors.mapping(Item::getName,Collectors.toSet())));
		
		System.out.println(TosetConversion);
		
	}

}

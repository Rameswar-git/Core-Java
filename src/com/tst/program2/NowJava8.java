package com.tst.program2;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class NowJava8 {

	public static void main(String[] args) {
		

		List<Person> persons=Arrays.asList(new Person("Rameswar",26),
				new Person("Shyam",30), new Person("Hari",50));
		
		Person result=persons.stream().
				filter(x->"Hari".equals(x.getName())).findAny().orElse(null);
          System.out.println(result);
          
          String name=persons.stream().filter(x->"Hari".equals(x.getName())).
        		  findAny().map(Person::getName).orElse(null);
          
          System.out.println(name);
          
          List<String> names=persons.stream().map(Person::getName).
        		  collect(Collectors.toList());
          
          
          names.forEach(System.out::println);
          
          
	}

}

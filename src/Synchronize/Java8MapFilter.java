package Synchronize;

import java.util.HashMap;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8MapFilter {

	public static void main(String[] args) {
		
		Map<Integer,String> heroku=new HashMap<Integer,String>();
		
		heroku.put(1, "www.google.com");
		
		heroku.put(2, "www.amazon.com");
		
		heroku.put(3, "www.flipkart.com");
		
		heroku.put(4, "www.djmaza.com");
		
		heroku.put(5, "www.mkyoung.com");
		
		heroku.put(6, "www.java8.com");
		
		heroku.put(7, "www.oracle.com");
		
		heroku.put(8, "www.fasoft.com");

		heroku.put(9, "www.odisha.com");
		
		heroku.put(1, "www.google.com");
		
		
	 Map<Integer,String> result= heroku.entrySet().stream().filter(x->x.getValue().equals("www.fasoft.com"))
			 .collect(Collectors.toMap(p->p.getKey(), p -> p.getValue()));
		
		System.out.println(result);
		
	}
}

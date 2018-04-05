package Synchronize;

import java.util.Arrays;
import java.util.stream.Stream;

public class TestExample1 {

	public static void main(String[] args) {
		
        String[] data ={"a", "b" ,"c", "d", "e", "f"};

        //Stream<String[]>
        Stream<String> temp = Arrays.stream(data);

        //filter a stream of string[], and return a string[]?
        Stream<String> stream = temp.filter(x -> "a".equals(x.toString()));

        stream.forEach(System.out::println);

	}

}

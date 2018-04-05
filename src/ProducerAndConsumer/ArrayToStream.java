package ProducerAndConsumer;

import java.util.function.Supplier;
import java.util.stream.Stream;

public class ArrayToStream {

	public static void main(String[] args) {
		
		Character[] charr={'a','b','c','d','e','f','c'};
		
//		Stream<Character> streamchars=Stream.of(charr);
		
		Supplier<Stream<Character>> streamsuppliers= () -> Stream.of(charr);
		
//		streamsuppliers.get().forEach(x->System.out.println(x));
		
		streamsuppliers.get().filter(x->x.equals('c')).forEach(System.out::println);

	}

}

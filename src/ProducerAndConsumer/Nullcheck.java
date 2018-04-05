package ProducerAndConsumer;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Nullcheck {

	public static void main(String[] args) {
		
		Stream<String> liststream=Stream.of("Java",".Net","C++","null","Python","SalesForce","null");
		
		
		List<String> finevalues=liststream.filter(x->!"null".equals(x)).collect(Collectors.toList());
		
		
		System.out.println(finevalues);

	}

}

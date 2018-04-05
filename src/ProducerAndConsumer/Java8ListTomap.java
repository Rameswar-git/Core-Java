package ProducerAndConsumer;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class Java8ListTomap {

	public static void main(String[] args) {
		
	
		List<Hosting> hostes=new ArrayList<Hosting>();

		hostes.add(new Hosting(1, "rameswar.com", 180000));		
		hostes.add(new Hosting(2, "shyam.com", 20000));
		hostes.add(new Hosting(3, "sundar.com", 80000));
		hostes.add(new Hosting(4, "nanda.com", 8756));		
		hostes.add(new Hosting(5, "vicky.com", 70000));
		hostes.add(new Hosting(6, "sukesj.com",60000 ));
		hostes.add(new Hosting(7, "murganamdam.com", 20000));
		hostes.add(new Hosting(8, "Kiran.com", 40000));
		hostes.add(new Hosting(9, "Kiran.com", 180000));
		
		Map<String,Long> mapcount=hostes.stream().collect(Collectors.toMap(Hosting::getName,Hosting::getWebsites,(oldValue, newValue) -> newValue));
		
		
		System.out.println(mapcount);
		
	}

}

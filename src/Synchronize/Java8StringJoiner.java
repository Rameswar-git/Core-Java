package Synchronize;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Java8StringJoiner {

	public static void main(String[] args) {
//		
//		StringJoiner sj = new StringJoiner(",");
//        sj.add("aaa");
//        sj.add("bbb");
//        sj.add("ccc");
//        String result = sj.toString(); //aaa,bbb,ccc
        
       

        
//        StringJoiner sj = new StringJoiner("/", "prefix-", "-suffix");
//        sj.add("2016");
//        sj.add("02");
//        sj.add("26");
//        String result = sj.toString(); //prefix-2016/02/26-suffix
//        System.out.println(result);
        
//		String result = String.join("-", "2015", "10", "31" );
//		
//		System.out.println(result);
//		
		
		List<String> list = Arrays.asList("java", "python", "nodejs", "ruby");
		
		List<String> arrstrings=new ArrayList<String>();
		
		arrstrings.add("java");
		
		arrstrings.add("python");
		
		arrstrings.add("nodejs");
		
		arrstrings.add("ruby");
		
//		String result = arrstrings.stream().map(x -> x).collect(Collectors.joining(" | "));
		
		String name=String.join(" | ", arrstrings);
		
		System.out.println(name);

	}

}

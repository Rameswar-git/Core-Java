package Usefulprograms;

import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Java8ReadFile {

	public static void main(String[] args) {
		String fileName = "D://lines.txt";
		
		try(Stream<String> stream = Files.lines(Paths.get(fileName))) {

//			stream.forEach(System.out::println);
			
			List<String> tetst=new ArrayList<String>();
			
			tetst=stream.filter(x->!x.equals("Good")).map(String::toUpperCase).collect(Collectors.toList());
			
			System.out.println(tetst);
			
		} catch (Exception e) {	
			
		}
		
	}

}

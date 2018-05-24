package Usefulprograms;

import java.io.IOException;
import java.net.URL;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Spliterator;
import java.util.Spliterators;
import java.util.stream.Stream;
import java.util.stream.StreamSupport;

public class UrlWordCount {

	public static void main(String[] args) throws IOException {
		URL ur=new URL("http://cs.armstrong.edu/liang/data/Lincoln.txt");
		Scanner sc=new Scanner(ur.openStream());
		

		
		
		
		int dhs=0;
		while(sc.hasNext()) {
			if (Character.isLetter((sc.next()).charAt(0))) {
				dhs++;
			}
		}
       System.out.println(dhs);
		
//		int no=0;
		
//		Stream.of(sc).forEach({
//			int count=0;
//			if (Character.isLetter((x.next()).charAt(0))) {
//				count++;
//		});
		
		
//		Stream.of(sc).forEach(x -> {
//			int count=0;
//			if (Character.isLetter((x.next()).charAt(0))) {
//				count++;
//			}
//			return count;
//		});
		
//		Stream.of(sc).forEach(x -> System.out.println(x.next()));
		
//		Stream.of(sc).forEach(x -> {
//
//		});
		
//		Stream.of(sc).iterator().hasNext()
		
//		long no=Stream.of(sc).filter(x -> Character.isLetter((x.next()).charAt(0))).collect(Collectors.counting());
		
//		System.out.println("The Number Of Words are "+no);
		
		
//		filter(x -> {
//			int count=0;
//			if (Character.isLetter((x.next()).charAt(0))) {
//				count++;
//			}
//		});
		
		
		}

}

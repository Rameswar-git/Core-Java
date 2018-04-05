package Synchronize;

import java.io.BufferedReader;
import java.io.FileReader;

public class Java8BufferedReader {

	public static void main(String[] args) {
		
		String fileName = "D://lines.txt";
		
//		try(BufferedReader br =new BufferedReader(new FileReader(fileName))) {
//			
//			List<String> sts=br.lines().collect(Collectors.toList());
//			
//			sts.forEach(System.out::println);
//			
//		} catch (Exception e) {
//			
//			
//		}
		
		try(BufferedReader br =new BufferedReader(new FileReader(fileName))) {
		
			String line;
			while((line = br.readLine()) != null){
				System.out.println(line);
			}
         
			
		} catch (Exception e) {
			
			
		}
		

	}

}

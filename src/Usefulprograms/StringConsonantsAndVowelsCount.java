package Usefulprograms;

import java.util.stream.IntStream;

public class StringConsonantsAndVowelsCount {

	public static void main(String[] args) {
           String text="Programmingisfun";
           String filterttext="AEIOUaeiou";
         
            long vowels=IntStream.range(0, text.length())
            .filter(x -> filterttext.contains(text.charAt(x)+"")).count();
            
            System.out.println(" No of Vowels are "+vowels);
            
            System.out.println("No of Consonants are "+(text.length()-vowels));
	}

}

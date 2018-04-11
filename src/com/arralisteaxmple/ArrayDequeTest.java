package com.arralisteaxmple;

import java.util.ArrayDeque;
import java.util.Iterator;


//Test


public class ArrayDequeTest {

public static void main(String... args){
		
		ArrayDeque<String> aq= new ArrayDeque<String>();
		aq.add("A");
		aq.add("B");
		aq.add("C");
		aq.add("D");
		aq.add("E");
		aq.add("F");
		aq.add("G");
		aq.add("H");
		aq.add("I");
		aq.add("J");
		aq.add("K");
		aq.add("L");
		aq.add("M");
		aq.add("N");
		aq.add("O");
		aq.add("P");
		aq.add("Q");
		aq.add("R");
		aq.add("S");
		aq.add("T");
		
//		aq.addFirst("KK");
		 while(!(aq.size() == 0)){
				if (aq.size() <= 10) {
					 int size=aq.size();
					for(int i=20 ; i>0 ; i--){
						if(!aq.isEmpty())
						System.out.println(aq.pop());
					}  
					}else{
						for(int i=0 ; i<10 ; i++){
							System.out.println(aq.pop());
						}
					}
				
				System.out.println("##########");
		 }
		
		//offerFirst-adds elements at the front of the ArrayDeque 
//		aq.offerFirst("D");
		
		//offerLast inserts the element at the last of ArrayDeque 
//		aq.offerLast("E");
		
//		Iterator<String> itr= aq.iterator();
//		while(itr.hasNext()){
//			System.out.println(itr.next());
//			itr.remove();
//		}
		
//		aq.forEach(x -> System.out.println("*"+x));
		
	}

}

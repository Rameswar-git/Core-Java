package com.liang.chapter4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;



public class CitiesSort {

	public static void main(String[] args) {
         System.out.println("Enter The ListOf CitiesTo Sort :: ");
         
         Scanner scanner=new Scanner(System.in);
         
         List<String> cities=new ArrayList<>();
         
         int no=0;
         
         while(no == 0){
        	 cities.add(scanner.nextLine());
        	 System.out.println("To Continue Press 1 else 0 ::");
        	 no=scanner.nextInt();
        	 scanner.nextLine();
         }
                 
//         Collections.sort(cities);
         
         cities.sort((o1,o2) -> o1.compareTo(o2));
         
         cities.forEach(System.out::println);
	}

}

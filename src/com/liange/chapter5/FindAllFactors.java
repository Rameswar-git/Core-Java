package com.liange.chapter5;

public class FindAllFactors {

	public static void main(String[] args) {
       int no=120;
       int index=2;
       while(no > 1){
    	   if (no % index == 0) {
			  System.out.print(index+",");
			  no=no/index;
		    }else{
		    	index++;
		     }
       }
       
	}

}

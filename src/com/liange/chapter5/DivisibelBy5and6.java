package com.liange.chapter5;

public class DivisibelBy5and6 {

	public static void main(String[] args) {
		int counter=1;
		for(int i=100 ; i<=1000 ; i++){
			if(i % 5 == 0 && i % 6 == 0){
				System.out.print(i+" ");
				if (counter == 10) {
					System.out.println();
					counter=1;
				}else {
					counter++;
				}
				
			}
		}

	}

}

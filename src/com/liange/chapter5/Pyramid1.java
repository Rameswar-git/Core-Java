package com.liange.chapter5;

import java.util.Scanner;

public class Pyramid1 {

	public static void main(String[] args) {
		System.out.println("EnterThe Number To Print Pyramid");
		Scanner scanner=new Scanner(System.in) ;
		int no=scanner.nextInt();
		for(int i=1;i<=no;i++){
              for(int k=no-i;k>=1;k--){
            	  System.out.print("  ");
              }
              
              for (int n = i; n >= 2 ; n--) {
				System.out.print(n+" ");
			}
              
              for (int p = 1; p <= i ; p++) {
				System.out.print(p+" ");
			}
             
              System.out.println();
		}
		scanner.close();
	}

}

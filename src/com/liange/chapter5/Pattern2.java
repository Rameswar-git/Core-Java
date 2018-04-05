package com.liange.chapter5;

public class Pattern2 {

	public static void main(String[] args) {
        int row=6;
        for (int i = 6; i>0; i--) {
//			int coun=i;
			for(int j=i;j>0;j--){
				System.out.print(j+" ");
//				coun--;
			}
			System.out.println();
		}
	}

}

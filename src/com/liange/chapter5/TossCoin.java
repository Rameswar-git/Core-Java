package com.liange.chapter5;

public class TossCoin {

	public static void main(String[] args) {
       int head = 0,tail=0,coin=0;
       for (int i = 0; i < 1000000; i++) {
    	   coin=(int)(Math.random() * 2) == 0 ? head++ : tail++;
	    }
       
       System.out.println(" No Of Heads "+head+" No Of Tails "+tail);
	}

}

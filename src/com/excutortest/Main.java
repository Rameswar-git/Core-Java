package com.excutortest;

public class Main implements Runnable {
     int i;
    
        @Override
        public void run() {
//        	System.out.println(Thread.currentThread().getName());
        for (i = 0; i < 10000; i++) {
//        	System.out.println("** "+Thread.currentThread().getName()+"  ");
            System.out.println(i+"  "+Thread.currentThread().getName()+" ");
        }
    }

    public static void main(String[] args) {
        Main a = new Main();
        Thread t1 = new Thread(  a);
        Thread t2 = new Thread(a);
        t1.start();
        t2.start();
    }        
}

package com.liang.chapter9;

public class StopWatchTest {

	public static void main(String[] args) {
        CustomStopwatch stopwatch=new CustomStopwatch();
        stopwatch.start();
        int[] rawarr=getArray();
        System.out.println("Before Sorting Elemnts are");
        for (int i = 0; i < rawarr.length; i++) {
        	 System.out.print(rawarr[i]+"\t");
		}
        System.out.println();
        selectionsort(rawarr);
        System.out.println("After Sorting Elemnts are");
        for (int i = 0; i < rawarr.length; i++) {
       	    System.out.print(rawarr[i]+"\t");
		}
        stopwatch.Stop();
        System.out.println("Elpsed Time is :: "+stopwatch.getElapsedTime());
       
	}

	private static void selectionsort(int[] rawarr) {
		for (int i = 0; i < rawarr.length-1 ; i++) {
			int val=rawarr[i];
			int minindex=i;
			for (int j = i+1; j < rawarr.length; j++) {
				if (rawarr[j]<val) {
					val=rawarr[j];
					minindex=j;
				}
			}
			
			if(i!=minindex){
				rawarr[minindex]=rawarr[i];
				rawarr[i]=val;
			}
		}
		
	}

	private static int[] getArray() {
		int[] arr=new int[20];
		for (int i = 0; i < arr.length; i++) {
			arr[i]=(int)(Math.random()*100);
		}
		return arr;
	}

}

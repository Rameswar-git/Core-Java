package com.ramgeeks.Topics.Arrays;

import java.util.ArrayList;
import java.util.Deque;
import java.util.LinkedList;

public class Maximumofallsubarraysofsizek {

	public static void main(String[] args) {
		int arr[] = {8,5,10,7,9,4,15,12,90,13}; //10 10 10 15 15 90 90
		System.out.println(max_of_subarrays(arr,10,4));
	}
	
    static ArrayList <Integer> max_of_subarrays(int arr[], int n, int k)
    {  
    	ArrayList<Integer> lst = new ArrayList<>();
    	Deque<Integer> dq = new LinkedList<>();
    	int i = 0;
    	for (i = 0; i < k; i++) {
			while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
				dq.removeLast();
			dq.addLast(i);
		}
    	for (; i < n; i++) {
    		lst.add(arr[dq.peek()]);
			while(!dq.isEmpty() && dq.peekFirst() <= i-k)
				dq.removeFirst();
			while(!dq.isEmpty() && arr[i] >= arr[dq.peekLast()])
				dq.removeLast();
			dq.addLast(i);
		}
    	return lst;
    }

}

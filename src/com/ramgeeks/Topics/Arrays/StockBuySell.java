package com.ramgeeks.Topics.Arrays;

import java.util.ArrayList;

/*
 * The cost of a stock on each day is given in an array, find the max profit that you can make by buying and selling in those days. For example,
 *  if the given array is {100, 180, 260, 310, 40, 535, 695}, the maximum profit can earned by buying on day 0, selling on day 3. 
 *  Again buy on day 4 and sell on day 6. If the given array of prices is sorted in decreasing order, then profit cannot be earned at all.
 */

public class StockBuySell {
	
	static class Interval {
		int buy , selll;
	}

	public static void main(String[] args) {
        // stock prices on consecutive days
		StockBuySell sl = new StockBuySell();
//      int price[] = { 100, 180, 260, 310, 40, 535, 695 };
      int price[] = { 81,69};
//      int price[] = { 30,40,50,35,80 };
      int n = price.length;

      // function call
     for (ArrayList<Integer> val:  sl.stockBuySell(price, n)) {
		System.out.println(val);
	}
	}
	
	
    ArrayList<ArrayList<Integer> > stockBuySell(int A[], int n) {
    	ArrayList<ArrayList<Integer>> sols = new ArrayList<>();
    	
    	int i = 0;
    	while (i < n-1) {
        	while(i < n-1 && (A[i + 1] <= A[i]))
        		i++;
        	
            if (i == n - 1)
                break;
            
        	ArrayList<Integer> sol = new ArrayList<>();
        	sol.add(i++);
        	
        	while(i < n && A[i] >= A[i-1])
        		i++;
        	
        	sol.add(i-1);
        	sols.add(sol);
    	}

    	return sols;
    }

}

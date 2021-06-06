package com.ramgeeks.Topics.Arrays;

import java.util.ArrayList;

public class SpirallyTraverseMatrix {

	public static void main(String[] args) {
		int r = 4, c = 4;
				int matrix[][] = {{1, 2, 3, 4},
				           {5, 6, 7, 8},
				           {9, 10, 11, 12},
				           {13, 14, 15,16}};
				System.out.println(spirallyTraverse(matrix,r,c));

	}
	
    static ArrayList<Integer> spirallyTraverse(int matrix[][], int r, int c)
    {
    	ArrayList<Integer> lst = new ArrayList<>();
    	
    	if(matrix.length == 0)
    		return lst;
    	int[] dr = {0 , 1, 0 , -1};
    	int[] dc = {1 , 0, -1 , 0};
    	int rr = 0,cc = 0, di= 0;
    	boolean[][] seen= new boolean[r][c];
    	for (int i = 0; i < r * c; i++) {
    		lst.add(matrix[rr][cc]);
    		seen[rr][cc] = true;
    		int cr = rr + dr[di];
    		int cd = cc + dc[di];
    		
    		if(0<=cr && cr < r && 0<=cd && cd < c && !seen[cr][cd]) {
    			rr = cr;
    			cc = cd;
    		}else {
    			di = (di + 1) % 4;
    			rr += dr[di];
    			cc += dc[di];
    		}
			
		}
        return lst;
    }

}

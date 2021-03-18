package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;


public class ConnectedCellsinaGrid2 {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		int m = inpReader.nextInt();
		boolean[][] visited = new boolean[n][m];
		boolean[][] grid = new boolean[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				visited[i][j] = false;
				grid[i][j] = inpReader.nextInt() == 1;
			}
		}
		int maxRegion = Integer.MIN_VALUE;
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(!visited[i][j] && grid[i][j]) {
					int size = dfs(visited,grid,n,m,i,j);
					maxRegion = Math.max(size, maxRegion);
				}
			}
		}
		System.out.println(maxRegion);
		inpReader.close();
	}

	private static int dfs(boolean[][] visited, boolean[][] grid, int n, int m, int row, int column) {
		if(visited[row][column] || !grid[row][column]) return 0;
		int count = 1;
		visited[row][column] = true;
		if(row-1 >=0) {
			count+=dfs(visited,grid,n,m,row-1,column);
			if(column-1>=0) count+=dfs(visited,grid,n,m,row-1,column-1);
			if(column+1<m) count+=dfs(visited,grid,n,m,row-1,column+1);
		}
		if(row+1 < n) {
			count+=dfs(visited,grid,n,m,row+1,column);
			if(column-1>=0) count+=dfs(visited,grid,n,m,row+1,column-1);
			if(column+1<m) count+=dfs(visited,grid,n,m,row+1,column+1);
		}
		if(column-1>=0)count+=dfs(visited,grid,n,m,row,column-1);
		if(column+1<m)count+=dfs(visited,grid,n,m,row,column+1);
		return count;
	}

}

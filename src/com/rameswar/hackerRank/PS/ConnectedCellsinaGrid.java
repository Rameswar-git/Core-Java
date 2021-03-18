package com.rameswar.hackerRank.PS;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

public class ConnectedCellsinaGrid {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner inpReader = new Scanner(new File("C:\\Users\\Vicky\\Desktop\\input00.txt"));
		int n = inpReader.nextInt();
		int m = inpReader.nextInt();
		int[][] grid = new int[n][m];
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				grid[i][j] = inpReader.nextInt();
			}
		}
		int maxRegion = Integer.MIN_VALUE;
		ArrayList<Region> regions = new ArrayList<>();
		for (int i = 0; i < n; i++) {
			for (int j = 0; j < m; j++) {
				if(grid[i][j] == 1) {
					createRegion(regions,new Pair(i,j),n,m);
					int vertical_lower = i - 1;
					int vertical_upper = i + 1;
					int horizontal_left = j - 1;
					int horizontal_right = j + 1;
					if(vertical_lower>=0 && grid[vertical_lower][j] == 1) {
						createRegion(regions,new Pair(vertical_lower,j),n,m);
					}
					if(vertical_upper<n && grid[vertical_upper][j] == 1) {
						createRegion(regions,new Pair(vertical_upper,j),n,m);
					}
					if(horizontal_left>=0 && grid[i][horizontal_left] == 1) {
						createRegion(regions,new Pair(i,horizontal_left),n,m);
					}
					if(horizontal_right<m && grid[i][horizontal_right] == 1) {
						createRegion(regions,new Pair(i,horizontal_right),n,m);
					}
					if(vertical_lower>=0 && horizontal_left>=0 && grid[vertical_lower][horizontal_left] == 1) {
						createRegion(regions,new Pair(vertical_lower,horizontal_left),n,m);
					}
					if(vertical_lower>=0 && horizontal_right<n && grid[vertical_lower][horizontal_right] == 1) {
						createRegion(regions,new Pair(vertical_lower,horizontal_right),n,m);
					}
					if(vertical_upper<n && horizontal_left>=0 && grid[vertical_upper][horizontal_left] == 1) {
						createRegion(regions,new Pair(vertical_upper,horizontal_left),n,m);
					}
					if(vertical_upper<n && horizontal_right<m && grid[vertical_upper][horizontal_right] == 1) {
						createRegion(regions,new Pair(vertical_upper,horizontal_right),n,m);
					}
				}
			}
		}
		for (Region region : regions) {
			maxRegion = Math.max(maxRegion, region.size);
		}
		System.out.println(maxRegion);
		inpReader.close();
	}
	private static boolean createRegion(ArrayList<Region> regions, Pair pair, int n, int m) {
		if(regions.isEmpty()) {
			return regions.add(new Region(pair));
		}else {
			for (Region region : regions) {
				if(region.addPair(pair,n,m)) {
					region.size++;
					return true;
				}
			}
			boolean cona= false;
			for (Region region : regions) {
				if(region.pairs.contains(pair)) {
					cona = true;
					break;
				}
			}
			if(!cona) {
				regions.add(new Region(pair));
			}
			return true;
		}
	}

	public static class Region {
		public ArrayList<Pair> pairs;
		public int size;
		public Region(Pair par) {
			this.pairs = new ArrayList<Pair>() {{
				add(par);
			}};
			this.size = 1;
		}
		
		public boolean addPair(Pair pair,int n ,int m) {
			if(!this.pairs.contains(pair)) {
				for (Pair point : pairs) {
					int lower = point.lower;
					int upper = point.upper;
					int left = point.left;
					int right = point.right;
					if(lower>=0 && pair.row == lower && point.coulmn == pair.coulmn) {
						return this.pairs.add(pair);
					}else if(upper < n && pair.row == upper && point.coulmn == pair.coulmn) {
						return this.pairs.add(pair);
					}else if(left>=0 && pair.row == point.row && left == pair.coulmn) {
						return this.pairs.add(pair);
					}else if(right < m && pair.row == point.row && right == pair.coulmn) {
						return this.pairs.add(pair);
					}else if(lower>=0 && left>=0 && pair.row == lower && left == pair.coulmn) {
						return this.pairs.add(pair);
					}else if(lower>=0 && right < m && pair.row == lower && right == pair.coulmn) {
						return this.pairs.add(pair);
					}else if(left>=0 && upper< n && pair.row == upper && left == pair.coulmn) {
						return this.pairs.add(pair);
					}else if(upper< n && right< m && pair.row == upper && right == pair.coulmn) {
						return this.pairs.add(pair);
					}
				}
			}
			return false;
		}
	}

	public static class Pair {
		public int row;
		public int coulmn;
		public int lower;
		public int upper;
		public int left;
		public int right;

		public Pair(int row, int coulmn) {
			this.row = row;
			this.coulmn = coulmn;
			this.lower = row - 1;
			this.upper = row  + 1;
			this.left = coulmn - 1;
			this.right = coulmn + 1;
		}

		@Override
		public int hashCode() {
			final int prime = 31;
			int result = 1;
			result = prime * result + coulmn;
			result = prime * result + row;
			return result;
		}

		@Override
		public boolean equals(Object obj) {
			if (this == obj)
				return true;
			if (obj == null)
				return false;
			if (getClass() != obj.getClass())
				return false;
			Pair other = (Pair) obj;
			if (coulmn != other.coulmn)
				return false;
			if (row != other.row)
				return false;
			return true;
		}

	}

}

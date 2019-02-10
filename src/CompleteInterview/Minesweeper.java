package CompleteInterview;

public class Minesweeper {

	public static void main(String[] args) {
        int[][] bombs3 = {{1, 1}, {1, 2}, {2, 2}, {4, 3}};
        int[][] mineSweeper = mineSweeper(bombs3, 5, 5) ;
		for (int i = 0; i < mineSweeper.length; i++) {
			for (int j = 0; j < mineSweeper[i].length; j++) {
				System.out.print(mineSweeper[i][j]+" ");
			}
			System.out.println();
		}
	}

	private static int[][] mineSweeper(int[][] bombs1, int rows, int columns) {
		int[][] arr=new int[rows][columns];
		for (int j2 = 0; j2 < bombs1.length; j2++) {
			int[] ks = bombs1[j2];
			arr[ks[0]][ks[1]]=-1;
			int rowindex=ks[0];
			int colindex=ks[1];
			for (int k = rowindex-1; k <= rowindex+1; k++) {
				for (int k2 = colindex-1; k2 <= colindex+1; k2++) {
                    if(k>=0 && k < rows && k2>=0 && k2 < columns && arr[k][k2]!=-1 ) {
                    	arr[k][k2]+=1;
                    }
				}
			}
		}
		return arr;
	}

}

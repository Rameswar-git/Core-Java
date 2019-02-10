package CompleteInterview;

import java.util.ArrayDeque;

public class MinesSweeper2 {

	public static void main(String[] args) {
		int[][] field2 = { { -1, 1, 0, 0 }, { 1, 1, 0, 0 }, { 0, 0, 1, 1 }, { 0, 0, 1, -1 } };
		// click(field2, 4, 4, 1, 3) should return:
		// [[-1, 1, -2, -2],
		// [1, 1, -2, -2],
		// [-2, -2, 1, 1],
		// [-2, -2, 1, -1]]
		int[][] ans = click(field2, 4, 4, 1, 3);
		for (int i = 0; i < ans.length; i++) {
			for (int j = 0; j < ans[i].length; j++) {
                  System.out.print(ans[i][j]+"\t");
			}
			System.out.println();
		}
	}

	private static int[][] click(int[][] field2, int i, int j, int k, int l) {
		ArrayDeque<int[]> zerofeilds=new ArrayDeque<>();
		if(field2[k][l] == 0) {
			field2[k][l]=-2;
			int[] pt= {k,l};
			zerofeilds.add(pt);
		}else {
			return field2;
		}
		
		while(!zerofeilds.isEmpty()) {
			int[] remove = zerofeilds.remove();
			int rowindex=remove[0];
			int colindex=remove[1];
			for (int m = rowindex-1; m <= rowindex+1; m++) {
				for (int m2 = colindex-1; m2 <= colindex+1; m2++) {
					if(m>=0 && m<i && m2>=0 && m2<j && field2[m][m2]==0) {
						field2[m][m2]=-2;
						zerofeilds.add(new int[] {m,m2});
					}
				}
			}
		}
		
		
		return field2;
	}

}

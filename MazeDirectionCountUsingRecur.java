import java.util.*;
public class MazeDirectionCountUsingRecur {
	public static int count = 0;
	
	
	static int printAnyPath(int cur_row, int cur_col, int n, int m, int[][] mat)
    {
        if(cur_row == n - 1 && cur_col == m - 1){//we have reached destination
            count++;
            return 0;
        }
		if(cur_row < 0 || cur_col < 0 || cur_row > n - 1 || cur_col > m - 1 || mat[cur_row][cur_col] == 1)
			return 0;
        mat[cur_row][cur_col] = 1; 
     
        printAnyPath(cur_row, cur_col + 1, n, m, mat);
        printAnyPath(cur_row + 1, cur_col, n, m, mat);
        printAnyPath(cur_row, cur_col - 1, n, m, mat);
        printAnyPath(cur_row - 1, cur_col, n, m, mat);
        printAnyPath(cur_row + 1, cur_col + 1, n, m, mat);
        printAnyPath(cur_row + 1, cur_col - 1, n, m, mat);
        printAnyPath(cur_row - 1, cur_col + 1, n, m, mat);
        printAnyPath(cur_row - 1, cur_col - 1, n, m, mat);
        
        mat[cur_row][cur_col] = 0;
		return 0;
    }


	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int mat[][] = new int[n][m];
		printAnyPath(0,0,n,m,mat);
		System.out.print(count);

	}

}

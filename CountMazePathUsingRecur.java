import java.util.*;
public class CountMazePathUsingRecur {
	public static int CountMaze(int row,int col, int n, int m) {
		if(row == n - 1 && col == m - 1) return 1;
		if(row >= n || col >= m) return 0;
		return CountMaze(row,col + 1,n,m) + CountMaze(row + 1,col,n,m);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		System.out.println(CountMaze(0,0,n,m));

	}

}

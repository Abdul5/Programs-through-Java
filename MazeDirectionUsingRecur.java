import java.util.*;
public class MazeDirectionUsingRecur {
	public static void mazeDir(int row,int col,int n,int m,int[][] mat,String psf) {
		if(row == n - 1 && col == m - 1) {
			System.out.println(psf);
			return;
		}
		mat[row][col] = 1;
		if(col < m - 1 && mat[row][col + 1] == 0)
			mazeDir(row,col + 1,n,m,mat,psf + " Right ");
		if(row < n - 1 && mat[row + 1][col] == 0)
			mazeDir(row + 1,col,n,m,mat,psf + " Down ");
		if(col > 0 && mat[row][col - 1] == 0)
			mazeDir(row,col - 1,n,m,mat,psf + " left ");
		if(row > 0 && mat[row - 1][col] == 0)
			mazeDir(row - 1,col,n,m,mat,psf + " Up ");
		if(row < n - 1 && col < m - 1 && mat[row + 1][col + 1] == 0)
			mazeDir(row + 1,col + 1,n,m,mat,psf + " Dig-Down-Right ");
		if(row < n - 1 && col > 0 && mat[row + 1][col - 1] == 0)
			mazeDir(row + 1,col - 1,n,m,mat,psf + " Dig-Down-Left ");
		if(row > 0 && col < m - 1 && mat[row - 1][col + 1] == 0)
			mazeDir(row - 1,col + 1,n,m,mat,psf + " Dig-Up-Right ");
		if(row > 0 && col > 0 && mat[row - 1][col - 1] == 0)
			mazeDir(row - 1,col - 1,n,m,mat,psf + " Dig-Up-Left ");
		mat[row][col] = 0;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int mat[][] = new int[n][m];
		mazeDir(0,0,n,m,mat,"");

	}

}

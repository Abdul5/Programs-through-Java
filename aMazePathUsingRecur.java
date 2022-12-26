import java.util.*;
public class aMazePathUsingRecur {
	public static void aMaze(int row,int col, int n, int m, String psf) {
		if(row == n - 1 && col == m - 1) {
			System.out.println(psf);
			return;
		}
		if(row >= n || col >= m) return;
		aMaze(row,col + 1,n,m,psf + "h");
		aMaze(row + 1,col,n,m,psf + "v");
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		aMaze(0,0,n,m,"");

	}

}

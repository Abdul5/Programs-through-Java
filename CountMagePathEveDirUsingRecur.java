import java.util.*;
public class CountMagePathEveDirUsingRecur {
	static int countAllPath(int n, int m)
    {
        //Write your code here
		if(n == 1 || m == 1) return 1;
		boolean[][] vis = new boolean[n][m];
		return f(0,0,n - 1,m - 1,vis);
    }
	static int[][] dirs = {{0,1},{0,-1},{1,0},{-1,0},{1,1},{-1,1},{1,-1},{-1,-1}};
	static int f(int r,int c,int n,int m,boolean[][] vis) {
		if(r < 0 || r > n || c < 0 || c > m || vis[r][c]) return 0;
		if(r == n && c == m) return 1;
		int ans = 0;
		vis[r][c] = true;
		for(int[] dir : dirs) {
			int x = r + dir[0];
			int y = c + dir[1];
			ans += f(x,y,n,m,vis);
		}
		vis[r][c] = false;
		return ans;
	}
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n= sc.nextInt();
        int m= sc.nextInt();
        System.out.println(countAllPath(n,m));
    }

}

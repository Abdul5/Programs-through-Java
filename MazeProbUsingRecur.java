import java.util.*;
public class MazeProbUsingRecur {
	public static void Maze(int row,int col,int n,int m, String psf) {
		if(row == n - 1 && col == m - 1) {
			System.out.println(psf);
			return;
		}
		if(row >= n || col >= m) return;
		
		for(int i = 1;i <= m;i++) 
			Maze(row,col + i,n,m,psf+"h"+i);
		
		for(int i = 1;i <= n;i++) 
			Maze(row + i,col,n,m,psf+"v"+i);
		
		for(int i = 1;i <= n;i++) 
			Maze(row + i,col + i,n,m,psf+"d"+i);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		Maze(0,0,n,m,"");

	}

}

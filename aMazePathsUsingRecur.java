import java.util.*;
public class aMazePathsUsingRecur {
	public static void aMazePaths(int n, int m, String psf){
	       //Write your code here
			if(n == 1 && m == 1) {
				System.out.println(psf);
				return;
			}
			if(n < 0 || m < 0) return;
			aMazePaths(n,m - 1,psf + "h");
			aMazePaths(n - 1,m,psf + "v");
	    }
		
	    public static void main(String[] args) throws Exception {
	        Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int m = sc.nextInt();
	        aMazePaths(n, m, "");
	  }

}

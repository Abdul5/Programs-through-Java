import java.util.*;
	class Solution{
	static double average(int a[], int n)
	    {
	      
	    // Your code here
			int sum = 0;
			for(int i = 0;i < n;i++) {
				sum += a[i];
			}
			double db = (float)sum / n;
			return db;
	    }
		}
	public class AverageOfArrayInDouble {
		public static void main(String[] args) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int[] mat = new int[n];
			for (int i = 0; i < n; i++) {
				mat[i] = sc.nextInt();
			}
			double res = Solution.average(mat, n);
			System.out.format("%.2f", res);
		}

}

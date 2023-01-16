import java.util.*;
public class UpperAndLowerTriangle {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n;
	        n = sc.nextInt();
	        int[][] matrix = new int[n][n];
	        for (int i = 0; i < n; i++)
	            for (int j = 0; j < n; j++)
	                matrix[i][j] = sc.nextInt();

	        triangleSums(n, matrix);
	        sc.close();
	    }

	    public static void triangleSums(int n, int[][] mat) {
	        // your code here
			int i, j;
	        int upper_sum = 0;
	        int lower_sum = 0;

	        /*Calculate sum of upper triangle*/
	        for (i = 0; i < n; i++)
	            for (j = 0; j < n; j++) {
	                if (i <= j) {
	                    upper_sum += mat[i][j];
	                }
	            }

	        System.out.print(upper_sum+" ");

	        /*Calculate sum of lower*/
	        for (i = 0; i < n; i++)
	            for (j = 0; j < n; j++) {
	                if (j <= i) {
	                    lower_sum += mat[i][j];
	                }
	            }

	        System.out.print(lower_sum);
	    }

}

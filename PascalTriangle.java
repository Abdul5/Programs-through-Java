import java.util.*;
public class PascalTriangle {
	    public static int[][] pascalTriangle(int n) {
	        int[][] triangle = new int[n][n];
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j <= i; j++) {
	                if (j == 0 || j == i) {
	                    triangle[i][j] = 1;
	                } else {
	                    triangle[i][j] = triangle[i - 1][j - 1] + triangle[i - 1][j];
	                }
	            }
	        }
	        return triangle;
	    }
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[][] triangle = pascalTriangle(n);
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j <= i; j++) {
	                System.out.print(triangle[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
}

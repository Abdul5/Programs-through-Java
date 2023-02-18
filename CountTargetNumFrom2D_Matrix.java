import java.util.*;
public class CountTargetNumFrom2D_Matrix {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int m = sc.nextInt();
	        int[][] matrix = new int[n][m];
	        int count = 0;
	        for (int i = 0; i < n; i++) {
	            for (int j = 0; j < m; j++) {
	                matrix[i][j] = sc.nextInt();
	                if (matrix[i][j] == 5) {
	                    count++;
	                }
	            }
	        }
	        System.out.println(count);
	    }
}

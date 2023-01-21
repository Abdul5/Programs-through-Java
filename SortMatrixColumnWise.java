import java.util.*;
public class SortMatrixColumnWise {
	    public static void sortCol(int[][] mat, int N, int M){
	        for (int j = 0; j < M; j++) {
	            int[] column = new int[N];
	            for (int i = 0; i < N; i++) {
	                column[i] = mat[i][j];
	            }
	            Arrays.sort(column);
	            for (int i = 0; i < N; i++) {
	                mat[i][j] = column[i];
	            }
	        }
			for (int i = 0; i < N; i++) {
	            for (int j = 0; j < M; j++) {
	                System.out.print(mat[i][j] + " ");
	            }
	            System.out.println();
	        }
	    }
	        public static void main(String[] args) throws Throwable {
	         Scanner sc=new Scanner(System.in); 
	          int n=sc.nextInt();
	          int m=sc.nextInt();
	          int[][] mat =new int[n][m]; 
	          for(int i=0;i<n;i++) {
	            for(int j=0;j<m;j++) {
	                mat[i][j] = sc.nextInt();
	            }
	          } 
	          sortCol(mat, n, m);
	      
	        }

}

import java.util.*;
public class MatrixMultiplication {
	public static void printMultiplication(int[][] matrix1,int[][] matrix2,int n) {
        //Write code here and print output
		int mul[][] = new int[n][n];
		int sum = 0;
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				sum = 0;
				for(int k = 0;k < n;k++) {
					sum +=matrix1[i][k]*matrix2[k][j] ;
				}
				mul[i][j]=sum;
			}
		}
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n; j++) {
				System.out.print(mul[i][j]+" ");
			}
			System.out.println();
		}
        
   }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int t = sc.nextInt();
		while(t-- > 0)
		{
        int n;
        n = sc.nextInt();
        int[][] matrix1 = new int[n][n];
        int[][] matrix2 = new int[n][n];
        
        for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix1[i][j] = sc.nextInt();
                
                for (int i = 0; i < n; i++)
            for (int j = 0; j < n; j++)
                matrix2[i][j] = sc.nextInt();
                
        printMultiplication(matrix1,matrix2,n);
		}
        sc.close();


  }
}

import java.util.*;
public class LowerTriangularMatrix {
	boolean isLowerTriangularMatrix(int mat[][],int N)
    {
        for (int i = 0; i < N-1; i++)
            for (int j = i + 1; j < N; j++)
                if (mat[i][j] != 0)
                    return false;
 
        return true;
    }
    public static void main(String args[]) {
        // your code here
    	LowerTriangularMatrix ob = new LowerTriangularMatrix();
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		if(ob.isLowerTriangularMatrix(arr,n)) {
			System.out.println("YES");
		}
		else {
			System.out.println("NO");
		}
    }

}

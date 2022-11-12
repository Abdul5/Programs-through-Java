import java.util.*;
public class TransposeMatrix {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int arr[][] = new int[n][n];
        for(int i  = 0; i < n;i++) {
            for(int j  = 0;j < n;j++) {
                arr[i][j]=sc.nextInt();
            }
        }
        int b[][] = new int[n][n];
        for(int i = 0; i < n;i++) {
            for(int j = 0; j < n;j++) {
                b[i][j] = arr[j][i];
            }
        }
        for(int i = 0; i < n;i++) {
            for(int j = 0; j < n;j++) {
                System.out.print(b[i][j]+" ");
            }
            System.out.println();
        }

	}

}

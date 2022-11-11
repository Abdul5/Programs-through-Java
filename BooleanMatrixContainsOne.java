import java.util.*;
public class BooleanMatrixContainsOne {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int m = sc.nextInt();
        int arr[][] = new int[n][m];
        boolean bl[] = new boolean[n];
        for(int i = 0; i < n;i++) {
                for(int j = 0;j < m;j++) {
                        arr[i][j] = sc.nextInt();
                        if(arr[i][j] == 1) {
                                bl[i] = true;
                        }
                }
        }
        for(int i = 0;i < n;i++) {
                if(bl[i] == true) {
                        for(int j = 0; j < m;j++) {
                                arr[i][j] = 1;
                        }
                }
        }
        for(int i = 0; i < n;i++) {
                for(int j = 0;j < m;j++) {
                        System.out.print(arr[i][j]+" ");
                }
                System.out.println();
        }

	}

}

import java.util.*;
public class Diagonal_Left_Right_Sum {
		    public static void main(String args[]) {
		        //your code here
				Scanner sc = new Scanner(System.in);
				int n = sc.nextInt();
				int arr[][] = new int[n][n];
				for(int i = 0;i < n;i++) {
					for(int j = 0;j < n;j++) {
						arr[i][j] = sc.nextInt();
					}
				}

				int left = 0;
				int right = 0;
				for(int i = 0;i < n;i++) {
					for(int j = 0;j < n;j++) {
						if(i == j) {
							left += arr[i][j];
						}
						else if((i + j) == n - 1) {
							right += arr[i][j];
						}
					}
				}
				System.out.println("Left "+left+" "+"Right "+right);
		    }

}

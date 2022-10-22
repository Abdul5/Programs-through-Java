import java.util.*;
public class RowWiseSumLargeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int n1 = sc.nextInt();
		int arr[][] = new int[n][n1];
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n1;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for(int i = 0; i < n;i++) {
			sum = 0;
			for(int j = 0;j<n1;j++) {
				sum += arr[i][j];
			}
			System.out.print(sum+" ");
		}
		int large = 0;
		if(sum > large) {
			large = sum;
			System.out.print("Largest Row = "+large);
		}

	}

}

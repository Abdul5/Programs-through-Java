import java.util.*;
public class ColWiseSumLargeNo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][]=new int[n][n];
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for(int j = 0;j < n;j++) {
			sum = 0;
			for(int i = 0;i < n;i++) {
				sum += arr[i][j];
			}
			System.out.print(sum+" ");
		}
		int large = 0;
		if(sum > large) {
			large = sum;
			System.out.println("Largest Column = "+large);
	  }

	}

}

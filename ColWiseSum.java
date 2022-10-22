import java.util.Scanner;
public class ColWiseSum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int r = sc.nextInt();
		int c = sc.nextInt();
		int arr[][] = new int[r][c];
		for(int i = 0; i < r;i++) {
			for(int j = 0; j < c; j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		int sum = 0;
		for(int j = 0; j < c;j++) {
			sum = 0;
			for(int i = 0; i < r; i++) {
				sum += arr[i][j];
				//System.out.print(sum+" ");
			}
			System.out.print(sum+" ");
		}

	}

}

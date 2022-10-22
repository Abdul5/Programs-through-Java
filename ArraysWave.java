import java.util.*;
public class ArraysWave {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < m;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		for(int i = 0; i < arr[0].length;i++) {
			if(i % 2 == 0) {
				for(int j  = 0; j <= arr.length-1;j++) {
					System.out.print(arr[j][i]+" ");
				}
			}
			if(i % 2 != 0) {
				for(int j = arr.length-1;j>=0;j--) {
					System.out.print(arr[j][i]+" ");
				}
			}
		}

	}

}

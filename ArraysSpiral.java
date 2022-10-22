import java.util.*;
public class ArraysSpiral {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int m = sc.nextInt();
		int arr[][] = new int[n][m];
		for(int i = 0; i < n;i++) {
			for(int j = 0; j < m;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		
		int rowStart = 0;
		int rowLength = arr.length-1;
		int colStart = 0;
		int colLength = arr[0].length-1;
		while(rowStart <= rowLength && colStart <= colLength) {
			for(int i = rowStart;i <= colLength;i++) {
				System.out.print(arr[rowStart][i]+" ");
			}
			for(int j = rowStart+1;j <= rowLength;j++) {
				System.out.print(arr[j][colLength]+" ");
			}
			if(rowStart+1 <= rowLength) {
				for(int k = colLength-1;k >= colStart;k--) {
					System.out.print(arr[rowLength][k]+" ");
				}
			}
			if(colStart+1 <= colLength) {
				for(int k = rowLength-1;k > rowStart;k--) {
					System.out.print(arr[k][colStart]+" ");
				}
			}
			rowStart++;
			rowLength--;
			colStart++;
			colLength--;
			
		}

	}

}

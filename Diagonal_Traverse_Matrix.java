import java.util.*;
public class Diagonal_Traverse_Matrix {
	public static void Diag(int arr[][] , int n) {
		int row = 0, col = n-1;  // row at 0 and col at last
		for(int i = 0;i < n;i++) {  // use loop for traversing
			int r = row , c = col;  // r have row value and c have col value 
			while(r < n && c < n) { // if both condition true 
				System.out.print(arr[r][c]+" "); // print row and col
				r++; // increament
				c++; // increament
			}
			if(col > 0) { // check col greater than 0 then decreament and row inc
				col--; // dnc
			}
			else {
				row++;  // inc
			}
		}
		for(int i = 1;i < n;i++) { // another loop for traversing
			int r = i , c = 0;
			while(r < n && c < n) {
				System.out.print(arr[r][c]+" "); // printing matrix
				r++;
				c++;
			}
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[][] = new int[n][n];
		for(int i = 0;i < n;i++) {
			for(int j = 0;j < n;j++) {
				arr[i][j] = sc.nextInt();
			}
		}
		Diag(arr,n);

	}

}

import java.util.*;
public class SnakePattern {
	public static void SnakePat(int arr[][], int n) {
		for(int i = 0;i < n;i++) {
			if(i % 2 == 0) {
				for(int j = 0;j < n;j++) {
					System.out.print(arr[i][j]+" ");
				}
			}
			else {
				for(int j = n-1;j >= 0;j--) {
					System.out.print(arr[i][j]+" ");
				}
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
		SnakePat(arr,n);

	}

}
/*
output :-
3 
45 -> 48-> 54
            |    
21 <- 89 <-87
|
70-> 78 -> 15

45 48 54 87 89 21 70 78 15 
 */



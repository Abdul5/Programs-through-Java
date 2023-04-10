import java.util.*;
public class AppendArray {
	public static int[] Append(int arr[],int n) {
		int newArr[] = new int[2 * n];
		for(int i = 0;i < n;i++) {
			newArr[i] = arr[i];
		}
		for(int i = n;i < 2 * n;i++) {
			newArr[i] = arr[i - n];
		}
		return newArr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int newArr[] = Append(arr,n);
		for(int ans : newArr) {
			System.out.print(ans+" ");
		}

	}

}

/*
input :-
3
1 2 3
output :-
1 2 3 1 2 3 

*/

import java.util.*;
public class LeftRotateArray {
	public static int[] L_Rotate(int arr[], int n, int k) {
		int N_Arr[] = new int[n];
		int j = 0;
		for(int i = k;i < n;i++) {
			N_Arr[j] = arr[i];
			j++;
		}
		for(int i = 0;i < k;i++) {
			N_Arr[j] = arr[i];
			j++;
		}
		for(int i = 0;i < n;i++) {
			arr[i] = N_Arr[i];
		}
		return N_Arr;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int k = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int N_Arr[] = L_Rotate(arr,n,k);
	    for(int i = 0;i < N_Arr.length;i++) {
	    	System.out.print(N_Arr[i]+" ");
	    }

	}

}

/*
input : -
5 2
1 2 3 4 5

output:-

3 4 5 1 2 

*/

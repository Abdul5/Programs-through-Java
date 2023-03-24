import java.util.*;
public class RightRotateArray {
	public static int[] Rotate(int arr[],int n, int k) {
		// these statement is also used for right rotate
//		int[] rotatedArr = new int[n];
//        for (int i = 0; i < n; i++) {
//            rotatedArr[(i + k) % n] = arr[i];
//        }
		
		int N_Arr[] = new int[n];
		k = k % n;
		int j = 0;
		for(int i = n - k;i < n;i++) {
			N_Arr[j++] = arr[i];
		}
		for(int i = 0;i < n - k;i++) {
			N_Arr[j++] = arr[i];
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
		int N_Arr[] =Rotate(arr,n,k);
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

4 5 1 2 3 

*/

import java.util.*;
public class ArrayRotateRight_K_Times {
	static void RightRotate(int a[],int n, int k)
	{
		// If rotation is greater
		// than size of array
		k = k % n;

		for(int i = 0; i < n; i++)
		{
			if(i < k)
			{
				// Printing rightmost
				// kth elements
				System.out.print(a[n + i - k]+ " ");
			}
			else
			{
				// Prints array after
				// 'k' elements
				System.out.print(a[i - k]+ " ");
			}
		}
		System.out.println();
	}
	public static void main(String args[])
	{
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n; i++) {
			arr[i] = sc.nextInt();
		}
		int K = sc.nextInt();
		RightRotate(arr, n, K);
	}
}

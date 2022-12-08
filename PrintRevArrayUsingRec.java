import java.util.*;
public class PrintRevArrayUsingRec {
	public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n = sc.nextInt();
        int[] arr = new int[n];

        for(int i = 0; i < n; i++)
            arr[i] = sc.nextInt();
        PrintArray(arr, 0);
    }

	public static void PrintArray(int[] arr, int n) {
      // Write your code here
		if(n == arr.length) return;
		PrintArray(arr,n + 1);
		System.out.print(arr[n]+" ");
    }

}

import java.util.*;
public class ArraysSumAvgLargest {
	public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        int n = scanner.nextInt();

        int[] arr = new int[n];
        for(int i = 0; i < n; i++)
                arr[i] = scanner.nextInt();

        ArrayOperations(arr, n);
    }

    public static void ArrayOperations(int[] arr, int n) {
        // Write your code here
		int avg = 0,sum = 0,lar = 0;
		for(int i = 0;i < n;i++) {
			sum += arr[i];
			avg = sum / n;
			if(arr[i] > lar) {
				lar = arr[i];
			}
		}
		System.out.print(sum+" "+avg+" "+lar);
    }

}

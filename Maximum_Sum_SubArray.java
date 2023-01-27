import java.util.*;
public class Maximum_Sum_SubArray {
	public static int MaxSum(int arr[], int n) {
		int maxSum = Integer.MIN_VALUE;
		int currSum = 0;
		for(int i = 0;i < n;i++) {
			currSum += arr[i];
			if(currSum < 0) {
				currSum = 0;
			}
			maxSum = Math.max(currSum, maxSum);
		}
		return maxSum;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(MaxSum(arr,n));

	}

}

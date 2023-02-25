import java.util.*;
public class Largest_Highest_Product {
	public static int prod(int[] arr,int n) {
		int max1 = Integer.MIN_VALUE;
		int max2 = Integer.MIN_VALUE;
		int max3 = Integer.MIN_VALUE;
		int min1 = Integer.MAX_VALUE;
		int min2 = Integer.MAX_VALUE;
		for(int i = 0;i < n;i++) {
			int curr = arr[i];
			if(curr > max1) {
				max3 = max2;
				max2 = max1;
				max1 = curr;
			}
			else if(curr > max2) {
				max3 = max2;
				max2 = curr;
			}
			else if(curr > max3) {
				max3 = curr;
			}
			if(curr < min1) {
				min2 = min1;
				min1 = curr;
			}
			else if(curr < min2) {
				min2 = curr;
			}
		}
		int prod1 = max1 * max2 * max3;
		int prod2 = max1 * min1 * min2;
		int ans = Math.max(prod1, prod2);
		return ans;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(prod(arr,n));

	}

}

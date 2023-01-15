import java.util.*;
public class CompareTwoSumOfArray {
		public static void main(String args[]) {
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr1[] = new int[n];
			for(int i = 0;i < n;i++) {
				arr1[i] = sc.nextInt();
			}
			int m = sc.nextInt();
			int arr2[] = new int[m];
			for(int i = 0;i < m;i++) {
				arr2[i] = sc.nextInt();
			}
			int sum1 = 0, sum2 = 0;
			for(int i = 0;i < n;i++) {
				sum1 += arr1[i];
			}
			for(int i = 0;i < m;i++) {
				sum2 += arr2[i];
			}
			if(sum1 > sum2) {
				System.out.println("First array is larger");
			}
			else if(sum1 == sum2) {
				System.out.println("Both are equal");
			}
			else {
				System.out.println("Second array is larger");
			}
		}

}

import java.util.*;
public class CheckArraySortedUsingRecur {
	public static boolean CheckSort(int arr[]) {
		if(arr.length == 1) return true;
		int SmallArr[] = new int[arr.length - 1];
		for(int i = 1;i < arr.length;i++) {
			SmallArr[i - 1] = arr[i];
		}
		boolean SmallPart = CheckSort(SmallArr);
		if(! SmallPart) {
			return false;
		}
		if(arr[0] <= arr[1]) {
			return true;
		}
		else {
			return false;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.println(CheckSort(arr));
	}

}

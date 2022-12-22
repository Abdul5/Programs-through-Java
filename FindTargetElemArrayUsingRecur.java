import java.util.*;
public class FindTargetElemArrayUsingRecur {
	public static boolean FindTarget(int arr[],int x) {
			return FindTarget(arr,0,arr.length-1,x);
		}

		private static boolean FindTarget(int[] arr, int start, int end,int x) {
			// TODO Auto-generated method stub
			
			if(start > end) {
				return false;
			}
			if(arr[start]==x) {
				return true;
			}
			return FindTarget(arr, start+1, end, x);
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(FindTarget(arr,x));
	}

}

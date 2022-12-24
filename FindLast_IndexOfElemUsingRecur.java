import java.util.*;
public class FindLast_IndexOfElemUsingRecur {
	public static int LastIndex(int arr[],int idx,int x) {
		if(idx == arr.length) return -1;
		int ans = LastIndex(arr,idx + 1,x);
		if(ans == -1) {
			if(arr[idx] == x) return idx;
			else {
				return -1;
			}
		}
		else {
			return ans;
		}
	}
	public static void main(String args[]) {
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(LastIndex(arr,0,x));
	}

}

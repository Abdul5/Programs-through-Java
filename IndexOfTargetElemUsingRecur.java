import java.util.*;
public class IndexOfTargetElemUsingRecur {
	public static int IndexTarget(int arr[],int idx,int x) {
		 if(idx == arr.length)return -1;
		 if(arr[idx] == x) return idx;
			return IndexTarget(arr,idx + 1,x);
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int x = sc.nextInt();
		System.out.println(IndexTarget(arr,0,x));
	}
}

import java.util.*;
public class Find_IndexOfAll_X_ElemUsingRecur {
	public static int[] AllIndex(int[] arr,int num) {
		return AllIndex(arr, 0, arr.length-1, num);
	}
	public static int[] AllIndex(int[] arr,int start,int end,int num) {
		if(start > end) {
			return new int[0];
		}
		
		int[] smallAns = AllIndex(arr, start+1, end, num);
		if(arr[start]==num) {
			int[] ans=new int[smallAns.length+1];
			ans[0]=start;
			for(int i=0;i<smallAns.length;i++)
				ans[i+1]=smallAns[i];
			return ans;
		}
		return  smallAns;
	
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
		int ans[] = AllIndex(arr,x);
		for(int i : ans) {
			System.out.print(i+" ");
		}

	}

}

import java.util.*;
public class ImmediateSmallerElemInArray {
	public static void ImSm(int arr[], int n) {
		int res[] = new int[n];
		for(int i = 0;i < n-1;i++) {
			if(arr[i+1] < arr[i]) {
				res[i] = arr[i + 1];
			}
			else {
				res[i] = -1;
			}
		}
		res[n-1] = -1;
		for(int i = 0;i < n;i++) {
			System.out.print(res[i]+" ");
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		ImSm(arr,n);

	}

}

import java.util.*;
public class Every2AppearsAfter_A_2 {
	public static boolean Every2(int arr[], int n) {
		boolean bl = true;
		for(int i = 0;i < n;i++) {
			if(arr[i] == 2 && (i == 0 || arr[i - 1] != 2) && (i == n - 1 || arr[i+1] != 2)) {
				bl = false;
				break;
			}
		}
		return bl;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		System.out.print(Every2(arr,n));

	}

}

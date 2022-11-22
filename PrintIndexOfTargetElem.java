import java.util.*;
public class PrintIndexOfTargetElem {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int k = sc.nextInt();
		Arrays.sort(arr);
		for(int i = 0; i < n;i++) {
			if(arr[i] == k) {
				System.out.print(i);
			}
		}

	}

}

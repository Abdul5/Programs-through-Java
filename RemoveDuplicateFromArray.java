import java.util.*;
public class RemoveDuplicateFromArray {
	public static int RevDup(int arr[], int n) {
		if(n == 0) return 0;  // this is base condition
		int i = 0;        // here i initialize i from first index
		for(int j = 1;j < n;j++) {   // run loop from index second till n
			if(arr[j] != arr[i]) { // this condition check unique val if i change this arr[j] == arr[i] it is for duplicate
				i++;
				arr[i] = arr[j]; // here i assign arr[j] in arr[i]
			}
		}
		return i + 1;
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int k = RevDup(arr,n);
		System.out.println(k);
//		for(int i = 0;i < k;i++) {
//			System.out.print(arr[i]+" ");
//		}
//		System.out.println();

	}

}

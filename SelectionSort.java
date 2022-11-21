import java.util.*;
public class SelectionSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		
		for(int i = 0; i < n-1;i++) {
			int min = i;
			for(int j = i; j < n;j++) {
				if(arr[j] < arr[min]) {
					min = j;
				}
			}
			int temp = arr[i];
			arr[i] = arr[min];
			arr[min] = temp;
		}
		for(int k = 0; k < n;k++) {
			System.out.print(arr[k]+" ");
		}
		System.out.println();

	}

}

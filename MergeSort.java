import java.util.*;
public class MergeSort {
	public static void conqure(int arr[], int si , int mid, int ei) {
		int merged[] = new int[si - ei + 1]; // assign length
		int idx1 = si;    // starting index and track first array
		int idx2 = mid + 1;  // track second array
		int x = 0;
		while(idx1 <= mid && idx2 <= ei) {   // this loop use for both array
			if(arr[idx1] <= arr[idx2]) {
				merged[x++] = arr[idx1++];
			}
			else {
				merged[x++] = arr[idx2++];
			}
		}
		while(idx1 <= mid) {    // this loop is use for first array
			merged[x++] = arr[idx1++];
		}
		while(idx2 <= ei) {     // this loop is use for second array
			merged[x++] = arr[idx2++];
		}
		for(int i = 0,j = si;i < arr.length;i++,j++) {   // copy merged elem into original array
			arr[j] = merged[i];
		}
		
	}
	public static void devide(int arr[],int si , int ei) {
		if(si > ei) {
			return;
		}
		int mid = si + (ei - si) / 2;  // we got mid
		devide(arr,si,mid-1); // first part
		devide(arr,mid+1,ei); // second part
		conqure(arr,si,mid,ei); // conqure both part
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0;i < n;i++) {
			arr[i] = sc.nextInt();
		}
		devide(arr,0,n-1);
		
		// print
		for(int i = 0;i < n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}

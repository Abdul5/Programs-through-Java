import java.util.*;
public class QuickSort1 {
	public static int Partition(int arr[], int low, int high) {
		int pi = arr[high]; // assign last element
		int i = low - 1;    // assign first element
		for(int j = low; j < high;j++) {   // this loop uses for smaller elem then pivot 
			if(arr[j] < pi) {
				i++;
				int temp = arr[i];
				arr[i] = arr[j];
				arr[j] = temp;
			}
		}
		// this all condition uses for larger element then pivot
		i++;
		int temp = arr[i];
		arr[i] = arr[high];
		arr[high] = temp;
		return i;
		
	}
	public static void Q_Sort(int arr[],int low , int high) {
		if(low < high) {
			int pi = Partition(arr,low,high); // here we pivot
			Q_Sort(arr,low,pi-1);             // use for small elem then pivot
			Q_Sort(arr,pi+1,high);            // use for large elem then pivot
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
		Q_Sort(arr,0,n - 1); // 0 -> low and n-1 -> high
		
		//Print
		for(int i = 0;i < n;i++) {
			System.out.print(arr[i]+" ");
		}
		System.out.println();

	}

}

//time complexity in worst case is O(n2) and average case = n(log n)
// if we take small elem or large elem is pivot then we got time comlex = O(n2)

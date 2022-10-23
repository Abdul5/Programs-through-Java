import java.util.*;
public class BubbleSort {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		for(int i = 0; i < arr.length;i++) {
			for(int j = 0;j < arr.length-i-1;j++) {
				if(arr[j] > arr[j + 1]) {
					int temp = arr[j];
					arr[j] = arr[j + 1];
					arr[j + 1] = temp;
				}
			}
		}
	//	Arrays.sort(arr); // this is for sorting array in ascending order
		for(int i = 0;i < arr.length;i++) {
			System.out.print(arr[i]+" ");
			
		}

	}

}

import java.util.*;
public class ZeroMaxPrintMaxOddNumPlaceOfZero {
	public static void MaxZero(int arr[], int n) {
		// use this loop for traversing till the n 
		for(int i = 0;i < n;i++) {
			int M_Odd = 0; // here we store max odd number
			if(arr[i] == 0) { // here we check arr[i] == 0 or not
				for(int j = i + 1;j < n;j++) {  // use this loop to check which value at i + 1 position
					if(arr[j] % 2 != 0 && arr[j] > M_Odd) { // check odd num and value is greater then max odd num
						M_Odd = arr[j];  // here i assign value of arr[j] in max odd
					}
				}
				arr[i] = M_Odd; // here i assign value of max odd in arr[i]
			}
		}
		// printing the final array
		for(int i = 0;i < n;i++) {
			System.out.print(arr[i]+" ");
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
		MaxZero(arr,n);

	}

}

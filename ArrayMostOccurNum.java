import java.util.*;
public class ArrayMostOccurNum {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		int n = sc.nextInt();
		int arr[] = new int[n];
		for(int i = 0; i < n;i++) {
			arr[i] = sc.nextInt();
		}
		int max = 0;
		int maxOcc = arr[0];
		for(int i = 0; i < n;i++) {
			int freq = 0;
			for(int j = i + 1; j < n;j++) {
				if(arr[i] == arr[j]) {
					freq++;
				}
			}
			if(freq > max) {
				max = freq;
				maxOcc = arr[i];
			}
		}
		System.out.print(maxOcc);

	}

}

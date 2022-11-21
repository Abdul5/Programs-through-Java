import java.util.*;
public class MostFreqElemInLessTime {
	public static void main(String args[]) {
        int n;
        Scanner sc = new Scanner(System.in);
        n = sc.nextInt();
        int[] arr = new int[n];
        for (int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }
        Solution ob = new Solution();
        System.out.print(ob.maximum_occurrence(arr, n));

    }	
}
class Solution{
    int maximum_occurrence(int arr[], int n) {
        //Write code here
		Arrays.sort(arr);
		int max = 1;
		int freq = 1;
		int maxOcc = arr[0];
		for(int i = 1; i < n;i++) {
			if(arr[i] == arr[i-1]) {
				freq++;
			}
			else {
				freq = 1;
			}
			if(freq > max) {
				max = freq;
				maxOcc = arr[i-1];
			}
		}
		return maxOcc;
    }
}

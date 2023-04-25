import java.util.*;
public class Lucky_SevensWithTripletSum {
		public static void main (String[] args) throws java.lang.Exception
		{
			//your code here
			Scanner sc = new Scanner(System.in);
			int n = sc.nextInt();
			int arr[] = new int[n];
			for(int i = 0;i < n;i++) {
				arr[i] = sc.nextInt();
			}
			System.out.print(lucky_sevens(arr));
		}
		public static boolean lucky_sevens(int[] arr) {
	    if (arr == null || arr.length < 3) {
	        // The array is null or has less than three elements
	        return false;
	    }

	    for (int i = 0; i <= arr.length - 3; i++) {
	        // Check if the sum of three consecutive elements equals 7
	        if (arr[i] + arr[i+1] + arr[i+2] == 7) {
	            return true;
	        }
	    }

	    // No three consecutive elements sum to 7
	    return false;
	  }

}

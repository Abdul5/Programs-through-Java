import java.util.*;
public class FindPivot_Index {
	    public static int pivotIndex(int[] nums) {
	        //Write code here
			// Initialize total sum of the given array...
	        int totalSum = 0;
	        // Initialize 'leftsum' as sum of first i numbers, not including nums[i]...
	        int leftsum = 0;
	        // Traverse the elements and add them to store the totalSum...
	        for (int ele : nums)
	            totalSum += ele;
	        // Again traverse all the elements through the for loop and store the sum of i numbers from left to right...
	        for (int i = 0; i < nums.length; leftsum += nums[i++])
	            // sum to the left == leftsum.
	            // sum to the right === totalSum - leftsum - nums[i]..
	            // check if leftsum == totalSum - leftsum - nums[i]...
	            if (leftsum * 2 == totalSum - nums[i])
	                return i;       // Return the pivot index...
	        return -1;      // If there is no index that satisfies the conditions in the problem statement...
	    }

	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n;
	        n = sc.nextInt();
	        int arr[] = new int[n];
	        for (int i = 0; i < n; i++)
	            arr[i] = sc.nextInt();
	        int result = pivotIndex(arr);
	        System.out.println(result);
	        sc.close();
	    }
}

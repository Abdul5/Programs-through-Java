import java.util.*;

public class MinSizeSubArraySum {
	    static int findLengthOfSmallestSubarray(int[] nums, int target) {
	        //Write your code here
			int result=Integer.MAX_VALUE;
	      int left=0;
	      int sum=0;
	      for(int i=0;i<nums.length;i++){
	        sum+=nums[i];
	         while(sum>=target){
	             result=Math.min(result,i+1-left);
	             sum-=nums[left];
	             left++;
	         }
	      }
	         return result!=Integer.MAX_VALUE? result:0;
	    }
	    public static void main(String[] args) {
	        Scanner keyboard = new Scanner(System.in);
	        int n = keyboard.nextInt();
			int K = keyboard.nextInt();
	        int[] a = new int[n];
	        for(int i = 0; i < n; i++) {
	            a[i] = keyboard.nextInt();
	        }
	        keyboard.close();
	        System.out.println(findLengthOfSmallestSubarray(a, K));
	    }
}

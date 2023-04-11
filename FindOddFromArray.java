import java.util.*;
public class FindOddFromArray {
	    public static void main(String[] args) {
	        Scanner sc = new Scanner(System.in);
	        int n = sc.nextInt();
	        int[] nums = new int[n];
	        for (int i = 0; i < n; i++) {
	            nums[i] = sc.nextInt();
	        }
	        if(splitOdd10(nums, 0, 0, 0)) {
				System.out.print("YES");
			}
			else {
				System.out.print("NO");
			}
	    }
	    
	    // Recursive helper method
	    public static boolean splitOdd10(int[] nums, int index, int sum1, int sum2) {
	        if (index == nums.length) {
	            return sum1 % 10 == 0 && sum2 % 2 == 1;
	        }
	        // Add the current number to sum1 and call recursively
	        if (splitOdd10(nums, index+1, sum1+nums[index], sum2)) {
	            return true;
	        }
	        // Add the current number to sum2 and call recursively
	        if (splitOdd10(nums, index+1, sum1, sum2+nums[index])) {
	            return true;
	        }
	        // Neither option worked, return false
	        return false;
	    }
}

/*
 input1 :
3
5 5 5

output1 :
YES

input2:
3
5 5 6
output2:
NO
*/